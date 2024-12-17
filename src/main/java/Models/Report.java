package Models;

public class Report extends Document {

    private boolean isDone;

    public Report(String userID, String vehicleID, Time requestedTime, Time submittedTime,
            String type) {
        super(userID, vehicleID, requestedTime, submittedTime, type);
        this.setStatus(false);// pending the rep
    }

    public Report(Request request, Time providedTime) {// provided time by the system after accounting
        super(request.getUserID(), request.getVehicleID(), request.getSubmittedTime(), providedTime, request.getType());
        if (this.getId() != null) {
            request.setStatus(true);// accepted the req
            this.setStatus(false);// pending the rep
        }
    }

    public void setStatus(boolean isDone) {
        this.isDone = isDone;
    }

    public boolean getStatus() {
        return isDone;
    }

}
