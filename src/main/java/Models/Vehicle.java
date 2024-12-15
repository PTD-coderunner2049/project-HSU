package Models;

public class Vehicle extends Model {
    private String userID;
    // id from model
    private String occupiedPosition;
    private String vehicleLicensedPlate;
    private String type; // "Land, Water"
    private char size; // "S L M"

    public Vehicle() {

    }

    public Vehicle(String id) {
        setId(id);// veh id is plate number
    }

    public void setOccupiedPosition(String occupiedPosition) {
        this.occupiedPosition = occupiedPosition;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVehicleLicensedPlate(String vehicleLicensedPlate) {
        this.vehicleLicensedPlate = vehicleLicensedPlate;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getOccupiedPosition() {
        return occupiedPosition;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getUserID() {
        return userID;
    }

    public String getVehicleLicensedPlate() {
        return vehicleLicensedPlate;
    }
}
