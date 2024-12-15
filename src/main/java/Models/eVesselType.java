package Models;

public enum eVesselType {
    // Water
    CARGO_SHIP('L',
            "Water"),
    CONTAINER_SHIP('L',
            "Water"),
    BULK_SHIP('L',
            "Water"),
    TANKER_SHIP('L',
            "Water"),
    CRUISE_SHIP('L',
            "Water"),
    FERRY('M',
            "Water"),
    BOAT('S',
            "Water"),
    TUGBOAT('S',
            "Water"),
    BARGE('M',
            "Water"),
    YATCH('S',
            "Water"),
    // Land
    CAR('M',
            "Land"),
    SEDAN('M',
            "Land"),
    HATCHBACK('S',
            "Land"),
    SUV('L',
            "Land"),
    VAN('L',
            "Land"),
    TRUCK('L',
            "Land"),
    HAULER_TRUCK('L',
            "Land"),
    DUMP_TRUCK('L',
            "Land"),
    FLATBED('L',
            "Land"),
    TANKER_TRUCK('L',
            "Land"),
    BOX_TRUCK('L',
            "Land"),
    FORKLIFT('M',
            "Land");

    private final char size;
    private final String hangarType;

    eVesselType(char size, String hangarType) {
        this.size = size;
        this.hangarType = hangarType;
    }

    public char getSize() {
        return size;
    }

    public String getHangarType() {
        return hangarType;
    }
}
