package Models;

public class Request extends Document {

    private boolean isAccepted;

    public Request() {
    }

    public Request(String userID, String vehicleID, Time requestedTime, Time submittedTime,
            String type) {
        super(userID, vehicleID, requestedTime, submittedTime, type);
        setStatus(false);

        DataBase.userBond(this, false);
        this.save();
        System.out.println("Request [" + getId() + "] has been created on 'Pending'");
    }

    public void setStatus(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public boolean getStatus() {
        return isAccepted;
    }
}
