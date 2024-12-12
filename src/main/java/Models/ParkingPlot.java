package Models;

public class ParkingPlot {
    private int id;
    private String size;
    private boolean isOccupied = false;

    public boolean bookPlot(Vehicle vehicle) {
        if (isOccupied == false) {
            vehicle.setOccupiedPosition("[" + size + "-" + id + "]");
            return isOccupied = true;
        }
        return false;
    }

    public void freePlot() {// call when user press finish on an OUT report, aka leaved
        isOccupied = false;
        System.out.println("Plot " + size + id + " is freed");
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}
