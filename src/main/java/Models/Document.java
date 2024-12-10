package Models;

public abstract class Document extends Model {
    private String docID;
    private String userID;
    private String vehicleID;
    private Time requestedTime;
    private Time submittedTime;
    private Boolean type;

    public Document(String docID, String userID, String vehicleID, Time requestedTime, Time submittedTime,
            boolean type) {
        setDocID(docID);
        setUserID(userID);
        setVehicleID(vehicleID);
        setRequestedTime(requestedTime);
        setSubmittedTime(submittedTime);
        setType(type);
    }

    public String getDocID() {
        return docID;
    }

    public Time getRequestedTime() {
        return requestedTime;
    }

    public Time getSubmittedTime() {
        return submittedTime;
    }

    public Boolean getType() {
        return type;
    }

    public String getUserID() {
        return userID;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public void setRequestedTime(Time requestedTime) {
        this.requestedTime = requestedTime;
    }

    public void setSubmittedTime(Time submittedTime) {
        this.submittedTime = submittedTime;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }
}