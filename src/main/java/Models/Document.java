package Models;

public abstract class Document extends UserData {

    private String vehicleID;
    private Time requestedTime;
    private Time submittedTime;
    private String type;// IN & OUT
    private boolean aborted;

    public Document() {
    }

    public Document(String id) {
        this.setId(id);
    }

    public Document(String userID, String vehicleID, Time requestedTime, Time submittedTime,
            String type) {
        if (DataBase.IdDistributor(this)) {
            this.setUserID(userID);
            this.setVehicleID(vehicleID);
            this.setRequestedTime(requestedTime);
            this.setSubmittedTime(submittedTime);
            this.setType(type);
            this.aborted = false;
        }
        return;
    }

    public Time getRequestedTime() {
        return requestedTime;
    }

    public Time getSubmittedTime() {
        return submittedTime;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getType() {
        return type;
    }

    public boolean aborted() {
        return aborted;
    }

    public void abort(boolean aborted) {
        this.aborted = aborted;
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

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }
}