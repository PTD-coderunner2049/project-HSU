package Models;

import java.util.LinkedList;
import java.util.List;

public class User extends Model {
    private static User instance;

    private boolean isAdmin = false;
    private String fullName;
    private String dateOfBirth;
    private List<Request> requests = new LinkedList<>();
    private List<Report> reports = new LinkedList<>();
    private List<Vehicle> vehicles = new LinkedList<>();

    private User() {
        Account account = Account.getInstance();
        setId(account.getId());// prebuilt user base on account
        // if we reconstruct right away here, at first time this is reaches, the
        // instance need to wait for user to reconstuct so it never updated, and during
        // reconstruct sequence it need to call instance result in a deep nest of nest
        // of instances waiting to get a memory block asign result in stackoverflow
    };

    // only one User the entire time
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
            instance.reconstuct();
        }
        return instance;
    }

    public boolean initUser(String fullName, String dateOfBirth) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        save();
        return false;
    }

    // getter setter-----------------------------------

    public void setAdminRight(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean getAdminRight() {
        return isAdmin;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<Report> getReports() {
        return reports;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setReports(List<Report> reports) {
        this.reports.addAll(reports);
    }

    public void setRequests(List<Request> requests) {
        this.requests.addAll(requests);
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles.addAll(vehicles);
    }
}
