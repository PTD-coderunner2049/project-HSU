package Models;

public class Vehicle extends Model {
    private String userID;
    // id from model
    private String occupiedPosition = "Unhangared";
    private String vehicleLicensedPlate;
    private String hangarType; // "Land, Water"
    private char size; // "S L M"
    private eVesselType type;

    public Vehicle() {
    }

    public Vehicle(String id) {
        this.setId(id);// veh id is plate number
    }

    public Vehicle(String id, String userID, String occupiedPosition, String vehicleLicensedPlate,
            String hangarType, char size, eVesselType type) {
        setId(id);
        this.userID = userID;
        this.occupiedPosition = occupiedPosition;
        this.vehicleLicensedPlate = vehicleLicensedPlate;
        this.hangarType = hangarType;
        this.size = size;
        this.type = type;
    }

    @Override
    public void save() {
        super.save();
        User user = User.getInstance();
        user.getVehicles().add(this);
        user.save();
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
