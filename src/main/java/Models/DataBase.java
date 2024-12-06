package Models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

// ----------------------------------------------------------------------------
public abstract class DataBase {
    private static final File accountsBank = new File("Resources/JSONs/AccountsBank.JSON");
    private static final File usersBank = new File("Resources/JSONs/UsersBank.JSON");
    private static final File requestsBank = new File("Resources/JSONs/ReqsBank.JSON");
    private static final File reportsBank = new File("Resources/JSONs/RepsBank.JSON");
    private static final File vehiclesBank = new File("Resources/JSONs/VehsBank.JSON");

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
    public static boolean eat(Account account) throws IOException {
        try (FileWriter writer = new FileWriter(accountsBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(account));
            // writer.close(); //try() is try with resource, writer garanteered close even
            // when exception occurr.
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            accountsBank.createNewFile();
            return false;
        }
    }

    public static boolean eat(User user) throws IOException {

        try (FileWriter writer = new FileWriter(usersBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(user));
            // writer.close();
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            usersBank.createNewFile();
            return false;
        }
    }

    public static boolean eat(Report report) throws IOException {
        try (FileWriter writer = new FileWriter(reportsBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(report));
            // writer.close();
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            reportsBank.createNewFile();
            return false;
        }
    }

    public static boolean eat(Request request) throws IOException {
        try (FileWriter writer = new FileWriter(requestsBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(request));
            // writer.close();
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            requestsBank.createNewFile();
            return false;
        }
    }

    public static boolean eat(Vehicle vehicle) throws IOException {
        try (FileWriter writer = new FileWriter(vehiclesBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(vehicle));
            // writer.close();
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            vehiclesBank.createNewFile();
            return false;
        }
    }

    // ----------------------------------------------------------------------------
    // read from the core database.
    public static boolean vormit(Account account) throws IOException {// reconstuct account from database
        if (!account.isExist()) {
            return false;
        }
        // Gson gson = builder.create();
        List<? extends Account> accountsList = fetchDataBase(Account.class);
        // WARNING LEGACY CODE: incase the multi-class-database-fetch came to ruin.
        // List<Account> accountsList;

        // try (FileReader reader = new FileReader(accountsBank)) {
        // accountsList = gson.fromJson(reader, new TypeToken<List<Account>>() {
        // }.getType());
        // } catch (FileNotFoundException e) {
        // System.err.println("AccountsBank.JSON not found.");
        // return false;
        // }
        // pull account
        for (Account a : accountsList) {
            if (a.getUsername().equals(account.getUsername()) && a.getPassword().equals(account.getPassword())) {
                account.setId(a.getId());
                account.setValidate(true);
                return true;
            }
        }
        return false;
    }

    // TODO you may want to rename all vormit as Reconstruct, prof Son may not like
    // it.
    public static boolean vormit(User user) throws IOException {// reconstuct user from database
        if (user.getId() == null) {
            return false;
        }
        List<? extends User> usersList = fetchDataBase(User.class);

        // pull user info
        for (User u : usersList) {
            if (u.getId().equals(user.getId())) {
                user.setAdminRight(u.getAdminRight());
                user.setDateOfBirth(u.getDateOfBirth());
                user.setFullName(u.getFullName());
                user.setId(u.getId());
                user.setReports(u.getReports());
                user.setRequests(u.getRequests());
                user.setVehicles(u.getVehicles());
                // java dont support pointer, but object are reference themself so I do this.
                return true;
            }
        }
        return false;
    }
    // remove from the core database.
    // public static boolean forget() {

    // }

    public static boolean IdDistributor(Account account) throws IOException {
        // send out available ID base on database account list's size()
        // pull account list
        List<? extends Account> accountsList = fetchDataBase(Account.class);
        // assigning ID
        account.setId(Integer.toString(accountsList.size()));
        return (account.getId() != null) ? true : false;
    }

    public static boolean accountValidate(Account account) throws IOException {
        List<? extends Account> accountsList = fetchDataBase(Account.class);
        for (Account a : accountsList) {
            if (a.getUsername().equals(account.getUsername()) && a.getPassword().equals(account.getPassword())) {
                return true;
            }
        }
        return false;
    }

    // BEHOLE PEASANT, THIS IS MY INVENTION. Generic class capable of pulling any
    // JSON class in a list.
    private static <T> List<T> fetchDataBase(Class<T> targetClass) throws IOException {
        // pull object list
        Gson gson = builder.create();
        List<T> anyObjectList;

        try (FileReader reader = new FileReader(accountsBank)) {
            anyObjectList = gson.fromJson(reader, TypeToken.getParameterized(List.class, targetClass).getType());
        } catch (FileNotFoundException e) {
            System.err.println("Crucial JSON DataBank not found!");
            return null;
        }
        return anyObjectList;
    }
}
