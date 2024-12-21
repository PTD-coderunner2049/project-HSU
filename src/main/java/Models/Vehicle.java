package Models;

public class Vehicle extends Model {
    private String userID;
    // id from model
    private String occupiedPosition;
    private String vehicleLicensedPlate;
    private String hangarType; // "Land, Water"
    private char size; // "S L M"
    private eVesselType type;

    public Vehicle() {
    }

    public Vehicle(String id) {
        this.setId(id);// veh id is plate number
    }

    public Vehicle(String userID, String vehicleLicensedPlate,
            String hangarType, char size, eVesselType type) {
        if (DataBase.IdDistributor(this)) {
            this.userID = userID;
            this.vehicleLicensedPlate = vehicleLicensedPlate;
            this.hangarType = hangarType;
            this.size = size;
            this.type = type;
            setOccupiedPosition(false);
            DataBase.userBond(this);
            save();
        } else {
            return;
        }

    }

    public void setOccupiedPosition(boolean isHangared) {
        if (isHangared) {
            String t = (hangarType == "Water") ? "W" : "G";
            occupiedPosition = "[" + t + size + "-" + getId() + "]";
        } else {
            occupiedPosition = "Unhangared";
        }
    }

    public void setOccupiedPosition(String occupiedPosition) {
        this.occupiedPosition = occupiedPosition;
    }

    public void setType(eVesselType type) {
        this.type = type;
    }

    public void setHangarType(String hangarType) {
        this.hangarType = hangarType;
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

    public eVesselType getType() {
        return type;
    }

    public String getUserID() {
        return userID;
    }

    public String getVehicleLicensedPlate() {
        return vehicleLicensedPlate;
    }

    public String getHangarType() {
        return hangarType;
    }
}
