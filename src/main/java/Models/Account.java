package Models;

// @SuppressWarnings("unused")
public class Account extends Model {
    private static Account instance;

    private String username;
    private String password;

    private Account() {
    }

    // only one Account the entire time
    public static Account getInstance() {
        return (instance == null) ? instance = new Account() : instance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public boolean userBond() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'userBond'");
    }

    // public boolean isExist() {
    // return DataBase.accountValidate(this);
    // }

    // public boolean isAdmin() {
    // if (true) {
    // return isAdmin = true;
    // } else {
    // return isAdmin = false;
    // }
    // }

    // WARNING: LEGACY CODE replaced by database.vormit()
    // public boolean earnId() {
    //
    // return (this.id != null) ? true : false;
    // }

    // public boolean recoverId() {
    // // for existed account to recover ID
    // if (isExist) {
    // }
    // return (this.id != null) ? true : false;
    // }
}
