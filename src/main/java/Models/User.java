package Models;

import java.util.List;

public class User extends Model {
    private static User instance;

    private boolean isAdmin = false;
    private String fullName;
    private String id = null;
    private String dateOfBirth;
    private List<Request> requests;
    private List<Report> reports;
    private List<Vehicle> vehicles;

    private User() {
    };

    private User(String id, String fullName, String dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        // Warning: LEGACY CODE - replaced by database.vormit()
        // load user with ID.
        // pullFullName();
        // pullRequests();
        // pullReports();
        // pullVehicles();
    }

    // only one User the entire time
    public static User getInstance() {
        return (instance == null) ? instance = new User() : instance;
    }

    public boolean initUser(String id, String fullName, String dateOfBirth) {
        if (id != null) {
            this.id = id;
            this.fullName = fullName;
            this.dateOfBirth = dateOfBirth;
        }
        save();
        return false;
    }

    // getter setter-----------------------------------
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

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
        return reports;// TODO update list<Report> from database with ID
    }

    public List<Request> getRequests() {
        return requests;// TODO update list<Request> from database with ID
    }

    public List<Vehicle> getVehicles() {
        return vehicles;// TODO update list<Vehicles> from database with ID
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * TODO feature choices. to have User exist within Dashboard, and these funtions
     * run as button command.
     * + toUserProfile(User) : boolean
     * + toVehicleList(List<Vehiclde>) : boolean
     * + toRequestFromt(String, String, &list<Vehicle>)
     * + toDisplayRequest(list<Request>) : void
     * + toDisplayReport(list<Report>) : void
     */
}
