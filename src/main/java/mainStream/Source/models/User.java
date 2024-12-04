package mainStream.Source.models;

import java.util.*;

public class User {
    private String fullName;
    private String id;
    private String dateOfBirth;
    // https://www.geeksforgeeks.org/list-interface-java-examples/
    private List<Request> requests;
    private List<Report> reports;
    private List<Vehicle> vehicles;

    public User(String id) {
        this.id = id;
        getFullName();
        getRequests();
        getReports();
        getVehicles();
    }

    public String getFullName() {
        // TODO get name from database using ID
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    }
}
