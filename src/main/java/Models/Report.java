package Models;

public class Report extends Document {

    private boolean isDone;
    private Time expectedTime;// Time that this should be done!

    public Report() {
    }

    public Report(String userID, String vehicleID, Time requestedTime, Time submittedTime,
            String type) {
        super(userID, vehicleID, requestedTime, submittedTime, type);
        this.setStatus(false);// pending the rep
    }

    public Report(Request request, Time requestedTime) {// provided time by the system after accounting

        super(request.getUserID(), request.getVehicleID(),
                requestedTime, request.getSubmittedTime(), request.getType());

        // status change
        request.setStatus(true);// accepted the req
        this.setStatus(false);// pending the rep

        // TODO edit expected Time base on density from database.
        expectedTime = requestedTime; // get everything
        expectedTime.setHour(expectedTime.getHour() + 1); // for now automatically increate it by 1.
        // rebond in this demo, you should have this fully set before
        // super() call userBond().
        DataBase.userBond(this, false);
        DataBase.userBond(request, false);
        request.save();
        this.save();
    }

    public void setStatus(boolean isDone) {
        this.isDone = isDone;
    }

    public boolean getStatus() {
        return isDone;
    }

    public void setExpectedTime(Time expectedTime) {
        this.expectedTime = expectedTime;
    }

    public Time getExpectedTime() {
        return expectedTime;
    }

}
