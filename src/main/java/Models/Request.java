package Models;

public class Request extends Document {

    private boolean isAccepted;

    public Request(String docID, String userID, String vehicleID, Time requestedTime, Time submittedTime,
            boolean type) {

        super(docID, userID, vehicleID, requestedTime, submittedTime, type);
        isAccepted = false;
    }

    public void setStatus(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public boolean getStatus() {
        return isAccepted;
    }
}
