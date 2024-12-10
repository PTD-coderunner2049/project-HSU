package Models;

public abstract class Document extends Model {
    private String userID;
    private String vehicleID;
    private Time requestedTime;
    private Time submittedTime;
    private String type;

    public Document(String userID, String vehicleID, Time requestedTime, Time submittedTime,
            String type) {
        DataBase.IdDistributor(this);
        setUserID(userID);
        setVehicleID(vehicleID);
        setRequestedTime(requestedTime);
        setSubmittedTime(submittedTime);
        setType(type);

        User user = User.getInstance();
        if (this.getClass() == Request.class) {
            user.getRequests().add((Request) this);
        } else if (this.getClass() == Report.class) {
            user.getReports().add((Report) this);
        }
        save();
    }

    public Time getRequestedTime() {
        return requestedTime;
    }

    public Time getSubmittedTime() {
        return submittedTime;
    }

    public String getUserID() {
        return userID;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getType() {
        return type;
    }

    public void setRequestedTime(Time requestedTime) {
        this.requestedTime = requestedTime;
    }

    public void setSubmittedTime(Time submittedTime) {
        this.submittedTime = submittedTime;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }
}