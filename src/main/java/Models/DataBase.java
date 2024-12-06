package Models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

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
    public static boolean eat(Account account) throws IOException {
        try (FileWriter writer = new FileWriter(accountsBank)) {
            List<Account> accountsList = fetchAccounts();
            accountsList.add(account);// TODO the exception laying on fetch funtion
            writer.write(builder.setPrettyPrinting().create().toJson(accountsList));
            // writer.close(); //try() is try with resource, writer garanteered close even
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            // accountsBank.createNewFile(); Legacy, unessessary anymore
            return false;
        }
    }

    public static boolean eat(User user) throws IOException {

        try (FileWriter writer = new FileWriter(usersBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(user));
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            return false;
        }
    }

    public static boolean eat(Report report) throws IOException {
        try (FileWriter writer = new FileWriter(reportsBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(report));
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            return false;
        }
    }

    public static boolean eat(Request request) throws IOException {
        try (FileWriter writer = new FileWriter(requestsBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(request));
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            return false;
        }
    }

    public static boolean eat(Vehicle vehicle) throws IOException {
        try (FileWriter writer = new FileWriter(vehiclesBank)) {
            writer.write(builder.setPrettyPrinting().create().toJson(vehicle));
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Data directory void, attempted to recreate directory. Retry? " + e.getMessage());
            return false;
        }
    }

    // ----------------------------------------------------------------------------
    // read from the core database.
    // TODO you may want to rename all vormit as Reconstruct, prof Son may not like
    // it.
    public static boolean vormit(User user) throws IOException {// reconstuct user from database
        if (user.getId() == null) {
            return false;
        }
        Gson gson = builder.create();
        List<User> usersList;
        try (FileReader reader = new FileReader(usersBank)) {
            usersList = gson.fromJson(reader, new TypeToken<List<Account>>() {
            }.getType());
        } catch (FileNotFoundException e) {
            System.err.println("AccountsBank.JSON not found.");
            return false;
        }

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

    public static boolean vormit(Account account) throws IOException {// reconstuct account from database
        if (!account.isExist()) {
            return false;
        }
        // List<? extends Account> accountsList = fetchDataBase(Account.class);
        // WARNING LEGACY CODE: incase the multi-class-database-fetch came to ruin.
        List<Account> accountsList = fetchAccounts();
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

    public static boolean IdDistributor(Account account) throws IOException {
        // send out available ID base on database account list's size()
        // pull account list
        List<Account> accountsList = fetchAccounts();
        // assigning ID
        account.setId(Integer.toString(accountsList.size()));
        return (account.getId() != null) ? true : false;
    }

    public static boolean accountValidate(Account account) throws IOException {
        List<Account> accountsList = fetchAccounts();
        for (Account a : accountsList) {
            if (a.getUsername().equals(account.getUsername()) && a.getPassword().equals(account.getPassword())) {
                return true;
            }
        }
        return false;
    }

    private static List<Account> fetchAccounts() throws IOException {
        try (FileReader reader = new FileReader(accountsBank)) {
            Gson gson = builder.create();
            List<Account> accountsList = gson.fromJson(reader, new TypeToken<List<Account>>() {
            }.getType());
            return accountsList;
        } catch (FileNotFoundException e) {
            System.out.println("AccountsBank.JSON not found.");
            return null;
        }
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
