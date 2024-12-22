package Models;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
// import com.google.gson.JsonArray;
// import com.google.gson.JsonObject;

// ----------------------------------------------------------------------------
public abstract class DataBase {
    private static File accountsBank = new File("src/main/resources/JSONs/AccountsBank.JSON");
    private static File usersBank = new File("src/main/resources/JSONs/UsersBank.JSON");
    private static File requestsBank = new File("src/main/resources/JSONs/ReqsBank.JSON");
    private static File reportsBank = new File("src/main/resources/JSONs/RepsBank.JSON");
    private static File vehiclesBank = new File("src/main/resources/JSONs/VehsBank.JSON");
    @SuppressWarnings("unused")
    private static final int trafficToleranceByHour = 1;
    // for demo, only 1 vessel is registered for transfering per hours
    @SuppressWarnings("unused")
    private static int[] todayTrafficDensity = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0 }; // 0 -> 24h TODO uniform updated density in realtime.

    private static GsonBuilder builder = new GsonBuilder();

    // ----------------------------------------------------------------------------
    // Directories getters
    public static String getAccountsbankPth() {
        return accountsBank.getAbsolutePath();
    }

    public static String getReportsbankPth() {
        return reportsBank.getAbsolutePath();
    }

    public static String getRequestsbankPth() {
        return requestsBank.getAbsolutePath();
    }

    public static String getUsersbankPth() {
        return usersBank.getAbsolutePath();
    }

    // ----------------------------------------------------------------------------
    // contribute to the core database.

    // Generic eat method.
    public static <Thing extends Model> boolean eat(Thing object) {
        // Navigate object type and pull appopriate list.
        File desiredBank = findBank(object.getClass());
        List<Thing> objectsList = fetchDataBase(object);

        // look for existing to replace before add
        int i = haveExistingID(objectsList, object.getId());
        if (i == -1) {
            objectsList.add(object);
        } else {
            objectsList.set(i, object);
        }
        // save updated data
        try (FileWriter writer = new FileWriter(desiredBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(objectsList));
            return true;
        } catch (IOException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            return false;
        }
    }

    public static <Thing extends Model> int haveExistingID(List<Thing> objectsList, String id) {
        for (int i = 0; i < objectsList.size(); i++) {
            if (objectsList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    // WARNING: LEGACY CODE - Overloaded eat method for difference classes.
    // public static boolean eat(Account account) {
    // List<Account> accountsList = fetchDataBase(accountsBank, Account.class);
    // accountsList.add(account);
    // try (FileWriter writer = new FileWriter(accountsBank)) {
    // writer.write(builder.setPrettyPrinting().create().toJson(accountsList));
    // return true;
    // // writer.close(); //try() is try with resource, writer garanteered close
    // even
    // } catch (IOException e) {
    // System.out.println("Data directory void, attempted to recreate directory.
    // Retry? " + e.getMessage());
    // // accountsBank.createNewFile(); Legacy, unessessary anymore
    // return false;
    // }
    // }

    // public static boolean eat(User user) {
    // List<User> usersList = fetchDataBase(usersBank, User.class);
    // usersList.add(user);
    // try (FileWriter writer = new FileWriter(usersBank)) {
    // writer.write(builder.setPrettyPrinting().create().toJson(usersList));
    // return true;
    // } catch (IOException e) {
    // System.err.println("Data directory void, attempted to recreate directory.
    // Retry? " + e.getMessage());
    // return false;
    // }
    // }

    // public static boolean eat(Report report) {
    // List<Report> reportsList = fetchDataBase(reportsBank, Report.class);
    // reportsList.add(report);
    // try (FileWriter writer = new FileWriter(reportsBank)) {
    // writer.write(builder.setPrettyPrinting().create().toJson(reportsList));
    // return true;
    // } catch (IOException e) {
    // System.err.println("Data directory void, attempted to recreate directory.
    // Retry? " + e.getMessage());
    // return false;
    // }
    // }

    // public static boolean eat(Request request) {
    // List<Request> requestsList = fetchDataBase(requestsBank, Request.class);
    // requestsList.add(request);
    // try (FileWriter writer = new FileWriter(requestsBank)) {
    // writer.write(builder.setPrettyPrinting().create().toJson(requestsList));
    // return true;
    // } catch (IOException e) {
    // System.err.println("Data directory void, attempted to recreate directory.
    // Retry? " + e.getMessage());
    // return false;
    // }
    // }

    // public static boolean eat(Vehicle vehicle) {
    // List<Vehicle> vehiclesList = fetchDataBase(vehiclesBank, Vehicle.class);
    // vehiclesList.add(vehicle);
    // try (FileWriter writer = new FileWriter(vehiclesBank)) {
    // writer.write(builder.setPrettyPrinting().create().toJson(vehiclesList));
    // return true;
    // } catch (IOException e) {
    // System.err.println("Data directory void, attempted to recreate directory.
    // Retry? " + e.getMessage());
    // return false;
    // }
    // }

    // ----------------------------------------------------------------------------
    // read from the core database.
    private static <Thing extends Model> File findBank(Class<Thing> objectClass) {
        if (objectClass == User.class) {
            DataStream.setBankId(1);
            return usersBank;
        }
        if (objectClass == Account.class) {
            DataStream.setBankId(2);
            return accountsBank;
        }
        if (objectClass == Request.class) {
            DataStream.setBankId(3);
            return requestsBank;
        }
        if (objectClass == Report.class) {
            DataStream.setBankId(4);
            return reportsBank;
        }
        if (objectClass == Vehicle.class) {
            DataStream.setBankId(5);
            return vehiclesBank;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public static <Thing extends Model> boolean vormit(Thing object) {// reconstuct user from database

        List<Thing> objectsList = fetchDataBase(object);

        if (objectsList == null)
            return false;// none to vormit
        int i = DataStream.getBankId();

        if (i == 1) {
            User user = (User) object;
            // OPTIONALY :)
            // User user = User.getInstance(); (OPTIONAL)
            // When know it was user, call the static instance of user
            // that should have an ID during login stage(from account's ID)
            for (User u : (List<User>) objectsList) {// pull user info
                if (u.getId().equals(user.getId())) {
                    // object.setAdminRight(u.getAdminRight());
                    user.setDateOfBirth(u.getDateOfBirth());
                    user.setFullName(u.getFullName());
                    user.setId(u.getId());
                    user.setReports(u.getReports());
                    user.setRequests(u.getRequests());
                    user.setVehicles(u.getVehicles());
                    return true;
                }
            }
        } else if (i == 2) {// pull user include the document.
            Account account = (Account) object;
            // OPTIONALY :)
            // Account account = Account.getInstance();
            for (Account a : (List<Account>) objectsList) {
                if (a.getUsername().equals(account.getUsername()) &&
                        a.getPassword().equals(account.getPassword())) {
                    account.setId(a.getId());
                    return true;
                }
            }
        } else if (i == 3) {
            Request request = (Request) object;
            // OPTIONALY :)
            // Account account = Account.getInstance();
            for (Request r : (List<Request>) objectsList) {
                if (r.getId().equals(request.getId())) {
                    request.setUserID(r.getUserID());
                    request.setVehicleID(r.getVehicleID());
                    request.setRequestedTime(r.getRequestedTime());
                    request.setSubmittedTime(r.getSubmittedTime());
                    request.setType(r.getType());
                    request.setStatus(r.getStatus());
                    request.abort(r.aborted());
                    return true;
                }
            }
        } else if (i == 4) {
            Report report = (Report) object;
            // OPTIONALY :)
            // Account account = Account.getInstance();
            for (Report r : (List<Report>) objectsList) {
                if (r.getId().equals(report.getId())) {
                    report.setUserID(r.getUserID());
                    report.setVehicleID(r.getVehicleID());
                    report.setRequestedTime(r.getRequestedTime());
                    report.setSubmittedTime(r.getSubmittedTime());
                    report.setType(r.getType());
                    report.setStatus(r.getStatus());
                    report.abort(r.aborted());
                    return true;
                }
            }
        } // other class is saved as object with its user, while also save on an isolated
          // databank, make method that pull entire list of them for admin task later, if!
          // created fetchDataBase().
        else if (i == 5) {
            Vehicle vehicle = (Vehicle) object;
            for (Vehicle v : (List<Vehicle>) objectsList) {
                if (v.getId().equals(vehicle.getId())) {
                    vehicle.setOccupiedPosition(v.getOccupiedPosition());
                    vehicle.setVehicleLicensedPlate(v.getVehicleLicensedPlate());
                    vehicle.setSize(v.getSize());
                    vehicle.setType(v.getType());
                    vehicle.setUserID(v.getUserID());
                    // object = (T) v;// you bend object to point to the one v point, left the veh
                    // outside unchange
                    return true;
                }
            }
        } else {
            System.out.println("Unsupported object type: " + object.getClass());
        }
        return false;// unknow Object
    }

    // public static boolean vormit(User user) {// reconstuct user from database

    // if (user.getId() == null)
    // return false;// no user
    // List<User> usersList = fetchDataBase(usersBank, User.class);
    // if (usersList == null)
    // return false;// data empty
    // for (User u : usersList) {// pull user info
    // if (u.getId().equals(user.getId())) {
    // user.setAdminRight(u.getAdminRight());
    // user.setDateOfBirth(u.getDateOfBirth());
    // user.setFullName(u.getFullName());
    // user.setId(u.getId());// java dont support pointer, but object are reference
    // // themselfs so I do this.
    // user.setReports(u.getReports());
    // user.setRequests(u.getRequests());
    // user.setVehicles(u.getVehicles());
    // return true;
    // }
    // }
    // return false;// no match
    // }

    // public static boolean vormit(Account account) {
    // // account = getInstance();
    // if (!account.isExist()) {
    // return false;
    // }
    // List<Account> accountsList = fetchDataBase(accountsBank, Account.class);
    // if (accountsList == null) {
    // return false;
    // }
    // for (Account a : accountsList) {// pull account
    // if (a.getUsername().equals(account.getUsername()) &&
    // a.getPassword().equals(account.getPassword())) {
    // account.setId(a.getId());
    // return true;
    // }
    // }
    // return false;
    // }

    // Power tools-----------------------------------------------------------------
    public static <Thing extends Model> boolean IdDistributor(Thing object) {
        List<Thing> objectsList = fetchDataBase(object);
        // assigning ID
        String prefix = "unkown@:0";
        int i = DataStream.getBankId();
        switch (i) {
            case 1:
                prefix = "u@:0";
                break;
            case 2:
                prefix = "ac@:0";
                break;
            case 3:
                prefix = "req@:0";
                break;
            case 4:
                prefix = "rep@:0";
                break;
            case 5:
                prefix = "veh@:0";
                break;
            default:
                break;
        }

        object.setId(prefix + Integer.toString(objectsList.size()));
        if (object.getId() != null)
            return true;
        System.out.println("ERROR: ID distributing failure!");
        return false;
    }

    public static boolean accountValidate(Account account) {
        List<Account> accountsList = fetchDataBase(account);
        for (Account a : accountsList) {
            if (a.getUsername().equals(account.getUsername()) && a.getPassword().equals(account.getPassword())) {
                return true;
            }
        }
        return false;
    }

    // blindly fetching a JSON file, need to specified a class for processing
    @SuppressWarnings("unused") // I dont know how to check for it.
    private static <Thing> List<Thing> blindFetchDataBase(File dir, Class<Thing> targetClass) {
        // class to list.
        // pull object list
        try (FileReader jsonSheet = new FileReader(dir)) {
            Gson read = builder.create();
            List<Thing> objectList = read.fromJson(jsonSheet,
                    TypeToken.getParameterized(List.class, targetClass).getType());

            return objectList;

        } catch (IOException e) {
            System.out.println("JSON DataBank Blindly fetching failure! Attemping to recreate nessesary dataBank");
            return new LinkedList<>();
        }
    }

    // capable of fetching any class to list.
    @SuppressWarnings("unchecked") // I dont know how to check for it.
    private static <Thing extends Model> List<Thing> fetchDataBase(Thing object) {
        Class<Thing> objectClass = (Class<Thing>) object.getClass();
        File desiredBank = findBank(objectClass);
        // pull object list
        try (FileReader jsonSheet = new FileReader(desiredBank)) {
            Gson read = builder.create();
            List<Thing> objectList = read.fromJson(jsonSheet,
                    TypeToken.getParameterized(List.class, objectClass).getType());

            // return (objectList == null) ? new LinkedList<Thing>() : objectList;
            return objectList;

        } catch (IOException e) {
            System.out.println("JSON DataBank fetching failure! Attemping to recreate nessesary dataBank");
            return new LinkedList<>();
        }
    }
    // @SuppressWarnings("unused")
    // WARNING: LEGACY CODE, USELESS NOW

    // private static List<Account> fetchAccounts() throws IOException {
    // try (FileReader reader = new FileReader(accountsBank)) {
    // Gson gson = builder.create();
    // List<Account> accountsList;
    // accountsList = gson.fromJson(reader, new TypeToken<List<Account>>() {
    // }.getType());
    // return (accountsList == null) ? new LinkedList<>() : accountsList;
    // } catch (FileNotFoundException e) {
    // System.out.println("AccountsBank.JSON not found, empty list returned.");
    // return new LinkedList<>();
    // }
    // }

    // private boolean patch(File dir) {// pack the JSON into an array if there are
    // only one object since GSON avoid
    // // doing this. and overwrite the original data.
    // try (FileReader reader = new FileReader(dir); FileWriter writer = new
    // FileWriter(dir + ".patched")) {
    // Gson gson = builder.create();
    // JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
    // // Check if the JSON is already an array
    // if (!jsonObject.isJsonArray()) {// Wrap
    // JsonArray jsonArray = new JsonArray();
    // jsonArray.add(jsonObject);
    // writer.write(builder.setPrettyPrinting().create().toJson(jsonArray));
    // return true;
    // }
    // } catch (IOException e) {
    // System.out.println("JSON DataBank fetching failure!");
    // }
    // return false;
    // }
    public static void cleanDocumentsBank() {

        requestsBank.delete();
        reportsBank.delete();
        vehiclesBank.delete();

        List<User> user = blindFetchDataBase(usersBank, User.class);
        for (User u : user) {
            u.getReports().clear();
            u.getRequests().clear();
            u.getVehicles().clear();
            DataBase.eat(u);
        }
    }

    public static <Thing extends Model> boolean export(Thing object) {
        // remove the object, object only need to have id. use carefully

        // Navigate object type and pull appopriate list.
        File desiredBank = findBank(object.getClass());
        List<Thing> objectsList = fetchDataBase(object);
        // look for existing to replace before add
        int i = haveExistingID(objectsList, object.getId());
        if (i == -1) {
            System.out.println("Object not found, exporting from Data Bank failed!");
            return false;
        }
        objectsList.set(i, object);
        object = objectsList.get(i);// pull the object
        objectsList.remove(i);// remove from list
        // save updated data
        try (FileWriter writer = new FileWriter(desiredBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(objectsList));
        } catch (IOException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            return false;// redundant, i dont care. had to catch this anyway.
        }
        return true;
    }

    @SuppressWarnings("unchecked") // I dont know how to check for it.
    public static <Thing extends UserData> boolean userBond(Thing thisObject) {

        User owner = new User(thisObject.getUserID());

        List<User> usersList = blindFetchDataBase(usersBank, User.class);
        LinkedList<Thing> objectsList = null;
        // check list data
        if (usersList == null) {
            System.out.println("list of user not found or is empty!");
            return false;
        } // found list
        for (User u : usersList) {
            if (u.getId().equals(thisObject.getUserID())) {
                owner = u;// owner point to u in the list, get modified and resave the list
                break;
            }
        } // check user
        if (owner.getId() == null) {
            System.out.println(
                    "Owner of Object for bonding task is somehow unexist. an object of type UserData must always have an owner regardless of bonding state.");
        } // found user
          // find appropriate type from user
        int c = 0;
        if (thisObject.getClass() == Request.class) {
            c = 1;
            objectsList = (LinkedList<Thing>) owner.getRequests();
        } else if (thisObject.getClass() == Report.class) {
            c = 2;
            objectsList = (LinkedList<Thing>) owner.getReports();
        } else if (thisObject.getClass() == Vehicle.class) {
            c = 3;
            objectsList = (LinkedList<Thing>) owner.getVehicles();
        }
        // make change on user own data list
        int i = DataBase.haveExistingID(objectsList, thisObject.getId());
        if (i == -1) {
            objectsList.add(thisObject);
            System.out.println("Current user successfully bonded with new item.");
        } else {
            System.out.println("Current user successfully re-bonded with new item.");
            objectsList.set(i, thisObject);
        }
        System.out.println("Bonding succeeded. saving change on user...");
        // save and sync
        if (User.getInstance().getId().equals(owner.getId())) {
            // if the modified user was the current user, update it help the dashboard
            // content up to date without need of re launching application.

            // save and reload owner, it not the owner is outdated and then overriding
            // change on current user instance instead of updating it.
            // or maybe just use the objectlist which is updated rightaway.

            switch (c) {
                case 1:
                    User.getInstance().setRequests((LinkedList<Request>) objectsList);
                    break;
                case 2:
                    User.getInstance().setReports((LinkedList<Report>) objectsList);
                    break;
                case 3:
                    User.getInstance().setVehicles((LinkedList<Vehicle>) objectsList);
                    break;
                default:
                    break;// incoming object is bounded to UserData type, this case never reach
            }// noneed to save current user in this case
             // if they are one, owner save is enough.
        }
        return owner.save();
    }

    @SuppressWarnings("unchecked")
    // remove from user list, but remain on main DataBanks.
    public static <Thing extends UserData> boolean userDeBond(Thing thisObject) {
        User user = User.getInstance();
        
        LinkedList<Thing> objectsList = null;

        if (thisObject.getClass() == Request.class) {
            objectsList = (LinkedList<Thing>) user.getRequests();
        } else if (thisObject.getClass() == Report.class) {
            objectsList = (LinkedList<Thing>) user.getReports();
        } else if (thisObject.getClass() == Vehicle.class) {
            objectsList = (LinkedList<Thing>) user.getVehicles();
        }
        int i = DataBase.haveExistingID(objectsList, thisObject.getId());
        if (i == -1) {
            System.out.println("Debonding unsucceeded, object never been bonded with current user...");
            return false;
        } else {
            objectsList.remove(i);
            System.out.println("An item is de-bonded with current user.");
        }
        System.out.println("Bonding succeeded. saving change on user...");
        return user.save();
    }
}
