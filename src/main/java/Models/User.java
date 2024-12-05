package Models;

import java.util.*;// for the list<> structure

public class User {
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

    /**
     * TODO feature choices
     * + toUserProfile(User) : boolean
     * + toVehicleList(List<Vehiclde>) : boolean
     * + toRequestFromt(String, String, &list<Vehicle>)
     * + toDisplayRequest(list<Request>) : void
     * + toDisplayReport(list<Report>) : void
     */

    public void save() {
        // TODO save user from JSON
    }

    public void reConstruct() {
        // TODO reconstruct user from JSON
    }
}
