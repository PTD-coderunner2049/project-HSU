package Models;

public class Request extends Document {

    private boolean isAccepted;

    public Request() {
    }

    public Request(String userID, String vehicleID, Time requestedTime, Time submittedTime,
            String type) {
        super(userID, vehicleID, requestedTime, submittedTime, type);
        setStatus(false);
        
        DataBase.userBond(this);
        this.save();
    }

    public void setStatus(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public boolean getStatus() {
        return isAccepted;
    }
}
