package Models;

public abstract class DataStream {
    private static int BankId = 0;


    public static void setBankId(int id) {
        DataStream.BankId = id;
    }
    public static int getBankId() {
        return BankId;
    }
}
