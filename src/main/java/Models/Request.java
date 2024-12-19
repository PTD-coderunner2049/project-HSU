package Models;

public class Request extends Document {

    private boolean isAccepted;

    public Request() {
    }

    public Request(String userID, String vehicleID, Time requestedTime, Time submittedTime,
            String type) {
        super(userID, vehicleID, requestedTime, submittedTime, type);
        isAccepted = false;
    }

    public void setStatus(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public boolean getStatus() {
        return isAccepted;
    }
}
