package Models;

import java.io.IOException;
import java.util.*;// for the list<> structure

public class User {
    private boolean isAdmin = false;
    private String fullName;
    private String id = null;
    private String dateOfBirth;
    // https://www.geeksforgeeks.org/list-interface-java-examples/
    private List<Request> requests;
    private List<Report> reports;
    private List<Vehicle> vehicles;

    public User(String id, String fullName, String dateOfBirth) {
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
     * 
     * @throws IOException
     */

    public void save() throws IOException {
        DataBase.eat(this);
    }
    // WARNING: LEGACY CODE, replaced by database.vormit()
    // public void reConstruct() {
    // }
}
