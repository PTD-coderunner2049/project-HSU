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
    public static <T extends Model> boolean eat(T object) {
        // Navigate object type.
        @SuppressWarnings("unchecked") // I dont know how to check for it.
        Class<T> objectClass = (Class<T>) object.getClass();
        File desiredBank = findBank(objectClass);
        // add
        List<T> objectsList = fetchDataBase(desiredBank, objectClass);
        objectsList.add(object);
        try (FileWriter writer = new FileWriter(desiredBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(objectsList));
            return true;
        } catch (IOException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            return false;
        }
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
    private static <T extends Model> File findBank(Class<T> objectClass) {
        if (objectClass == User.class) {
            DataStream.setId(1);
            return usersBank;
        }
        if (objectClass == Account.class) {
            DataStream.setId(2);
            return accountsBank;
        }
        if (objectClass == Request.class) {
            return requestsBank;
        }
        if (objectClass == Report.class) {

            return reportsBank;
        }
        if (objectClass == Vehicle.class) {

            return vehiclesBank;
        }
        return null;
    }

    @SuppressWarnings("unchecked") // I dont know how to check for it.
    public static <T extends Model> boolean vormit(T object) {// reconstuct user from database

        Class<T> objectClass = (Class<T>) object.getClass();
        File desiredBank = findBank(objectClass);
        List<T> objectsList = fetchDataBase(desiredBank, objectClass);

        if (objectsList == null)
            return false;// none to vormit]
        int i = DataStream.getId();

        if (i == 1) {
            User user = User.getInstance(); // When know it was user, call the static instance of user
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
        } else if (i == 2) {
            Account account = Account.getInstance();
            for (Account a : (List<Account>) objectsList) {
                if (a.getUsername().equals(account.getUsername()) &&
                        a.getPassword().equals(account.getPassword())) {
                    account.setId(a.getId());
                    return true;
                }
            }
        }
        // TODO case 3 4 5 req rep veh
        else {
            System.out.println("Unknown object type: " + objectClass);
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
    public static boolean IdDistributor(Account account) {
        // send out available ID base on database account list's size()
        // pull account list
        List<Account> accountsList = fetchDataBase(accountsBank, Account.class);
        // assigning ID
        account.setId(Integer.toString(accountsList.size()));
        return (account.getId() != null) ? true : false;
    }

    public static boolean accountValidate(Account account) {
        List<Account> accountsList = fetchDataBase(accountsBank, Account.class);
        for (Account a : accountsList) {
            if (a.getUsername().equals(account.getUsername()) && a.getPassword().equals(account.getPassword())) {
                return true;
            }
        }
        return false;
    }

    // BEHOLE PEASANT, THIS IS MY INVENTION. Generic class
    private static <T> List<T> fetchDataBase(File dir, Class<T> targetClass) {// capable of fetching any class to list.

        // pull object list
        try (FileReader jsonDataSheet = new FileReader(dir)) {
            Gson gson = builder.create();
            List<T> objectList = gson.fromJson(jsonDataSheet,
                    TypeToken.getParameterized(List.class, targetClass).getType());
            return (objectList == null) ? new LinkedList<T>() : objectList;
        } catch (IOException e) {
            System.out.println("JSON DataBank fetching failure!");
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
}
