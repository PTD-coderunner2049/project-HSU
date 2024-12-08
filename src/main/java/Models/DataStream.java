package Models;

public abstract class DataStream {
    private static int id = 0;


    public static void setId(int id) {
        DataStream.id = id;
    }
    public static int getId() {
        return id;
    }
}
