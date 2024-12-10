package Models;

public class Report extends Document {

    private boolean isDone;

    public Report(String userID, String vehicleID, Time requestedTime, Time submittedTime,
            String type) {
        super(userID, vehicleID, requestedTime, submittedTime, type);
        isDone = false;
    }

    public void setStatus(boolean isDone) {
        this.isDone = isDone;
    }

    public boolean getStatus() {
        return isDone;
    }
}
