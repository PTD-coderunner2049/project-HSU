package Models;

public class Report extends Document {

    private boolean isDone;
    @SuppressWarnings("unused")
    private Time expectedTime;

    public Report(String userID, String vehicleID, Time requestedTime, Time submittedTime,
            String type) {
        super(userID, vehicleID, requestedTime, submittedTime, type);
        this.setStatus(false);// pending the rep
    }

    public Report(Request request, Time requestedTime) {// provided time by the system after accounting
        super(request.getUserID(), request.getVehicleID(), request.getSubmittedTime(),
                requestedTime, request.getType());
        if (this.getId() != null) {
            request.setStatus(true);// accepted the req
            this.setStatus(false);// pending the rep
        }
        // TODO edit expectedTime base on density
        expectedTime = requestedTime;
        expectedTime.setHour(expectedTime.getHour() + 5);
        expectedTime.setHour(expectedTime.getHour() + 5);
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
