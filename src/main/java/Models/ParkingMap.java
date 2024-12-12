package Models;

import java.util.ArrayList;
import java.util.List;

public class ParkingMap {
    private static ParkingMap instance;
    private static List<ParkingPlot> parkMap = new ArrayList<>();

    public static ParkingMap getInstance() {
        return (instance == null) ? instance = new ParkingMap() : instance;
    }

    public static List<ParkingPlot> getParkMap() {
        return parkMap;
    }// unlimited hangar size for now :)
}