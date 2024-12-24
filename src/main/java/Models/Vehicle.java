package Models;

public class Vehicle extends UserData {
    // id from model
    private String occupiedPosition;
    private String vehicleLicensedPlate;
    private String hangarType; // "Land, Water"
    private char size; // "S L M"
    private eVesselType type;

    public Vehicle() {
    }

    public Vehicle(String id) {
        setId(id);// veh id is plate number
    }

    public Vehicle(String userID, String vehicleLicensedPlate,
            String hangarType, char size, eVesselType type) {
        if (DataBase.IdDistributor(this)) {
            setUserID(userID);
            setVehicleLicensedPlate(vehicleLicensedPlate);
            setHangarType(hangarType);
            setSize(size);
            setType(type);
            setOccupiedPosition(false);
            DataBase.userBond(this, false);
            this.save();
        }
        return;
    }

    public void setOccupiedPosition(boolean isHangared) {
        if (isHangared) {
            String t = (hangarType.equals("Water")) ? "W" : "G";
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

    public String getVehicleLicensedPlate() {
        return vehicleLicensedPlate;
    }

    public String getHangarType() {
        return hangarType;
    }
}
