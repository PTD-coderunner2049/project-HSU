package Models;

public enum WaterVessel {
    CARGO_SHIP('L'),
    CONTAINER_SHIP('L'),
    BULK_SHIP('L'),
    TANKER_SHIP('L'),
    CRUISE_SHIP('L'),
    FERRY('M'),
    BOAT('S'),
    TUGBOAT('S'),
    BARGE('M'),
    YATCH('S');

    private final char size;

    WaterVessel(char size) {
        this.size = size;
    }

    char getSize() {
        return size;
    }
}
