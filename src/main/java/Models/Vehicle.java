package Models;

public class Vehicle extends Model {
    private String userID;
    // id from model
    private String occupiedPosition;
    private String vehicleLicensedPlate;
    private String type; // "Land, Water"
    private String size; // "S L M"

    /**
     * Land Vehicles
     * 
     * Motorcycles:
     * Motorcycles
     * Scooters
     * Cars:
     * Sedans
     * Hatchbacks
     * SUVs
     * Vans
     * Trucks:
     * Box trucks
     * Flatbed trucks
     * Refrigerated trucks
     * Tanker trucks
     * Dump trucks
     * Heavy Equipment:
     * Forklifts
     * Cranes
     * Tractors
     * Bulldozers
     * Special Purpose Vehicles:
     * Ambulances
     * Fire trucks
     * Armored vehicles
     * 
     * Sea Vehicles
     * 
     * Ships:
     * Cargo ships
     * Container ships
     * Bulk carriers
     * Tankers
     * Cruise ships
     * Ferry boats
     * Boats:
     * Fishing boats
     * Tugboats
     * Barges
     * Yachts
     */
    // private String[] approvedType = {};

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

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
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
