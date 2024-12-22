package Models;

import java.util.LinkedList;
import java.util.List;

public class User extends Model {
    private static User instance;

    private boolean isAdmin = false;
    private String fullName;
    private Time dateOfBirth;
    private LinkedList<Request> requests = new LinkedList<>();
    private LinkedList<Report> reports = new LinkedList<>();
    private LinkedList<Vehicle> vehicles = new LinkedList<>();

    public User(User user) {
        if (user.getId() != null) {
            setId(user.getId());
            this.isAdmin = (user.getAdminRight());
            setDateOfBirth(user.getDateOfBirth());
            setFullName(user.getFullName());
            setRequests(user.getRequests());
            setVehicles(user.getVehicles());
            setReports(user.getReports());
        }
    }

    public User(String id) {// create empty user obj
        setId(id);
    }

    private User() {
        dateOfBirth = new Time();
        setId(Account.getInstance().getId());// prebuilt user base on account
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

    public boolean initUser(String fullName, Time dateOfBirth, boolean isAdmin) {
        setFullName(fullName);
        this.dateOfBirth.setHour(0);
        this.dateOfBirth.setMinute(0);
        this.dateOfBirth.setDay(dateOfBirth.getDay());
        this.dateOfBirth.setMonth(dateOfBirth.getMonth());
        this.dateOfBirth.setYear(dateOfBirth.getYear());
        this.isAdmin = isAdmin;
        if (isAdmin)
            setId(getId() + ":admin");
        save();
        return false;
    }

    // getter setter-----------------------------------

    public boolean getAdminRight() {
        return isAdmin;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(Time dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Time getDateOfBirth() {
        return dateOfBirth;
    }

    public LinkedList<Report> getReports() {
        return reports;
    }

    public LinkedList<Request> getRequests() {
        return requests;
    }

    public LinkedList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setReports(List<Report> reports) {
        this.reports.clear();
        this.reports.addAll(reports);
    }

    public void setRequests(List<Request> requests) {
        this.requests.clear();
        this.requests.addAll(requests);
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles.clear();
        this.vehicles.addAll(vehicles);
    }
}
