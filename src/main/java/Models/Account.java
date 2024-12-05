package Models;

@SuppressWarnings("unused")
public class Account {

    private String username;
    private String password;
    private User bondedUser;
    private String id = null;// TODO static ID generator

    private boolean isExist = false;
    private boolean isAdmin = false;

    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean getValidate() {
        return isExist;
    }

    // public boolean getAdminRight() {
    // return isAdmin;
    // }
    public User getBondedUser() {
        return bondedUser;
    }

    public void setValidate(boolean isValid) {
        this.isExist = isValid;
    }

    public void setAdminRight(boolean isAdmin) {
        this.isAdmin = isAdmin;
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

    public String getId() {
        return id;
    }

    public boolean isExist() {
        // TODO search for the match of already existed account on database
        // ngl, amma just makeit auto valid rn;
        if (true) {
            return this.isExist = true;
        } else {
            return this.isExist = false;
        }
    }

    // public boolean isAdmin() {
    // if (true) {
    // return isAdmin = true;
    // } else {
    // return isAdmin = false;
    // }
    // }

    public void save() {
        // TODO save to database
        // account's ID is used as User ID, save username, password and ID only.
    }

    public boolean initUser(String fullName, String dateOfBirth) {
        bondedUser = new User(this.id, fullName, dateOfBirth);
        return (bondedUser.getId() != null) ? true : false;
    }

    public boolean earnId() {
        // TÓDO ID generator.
        return (this.id != null) ? true : false;
    }
}
