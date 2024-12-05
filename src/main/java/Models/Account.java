package Models;

import java.io.IOException;

@SuppressWarnings("unused")
public class Account {

    private String username;
    private String password;
    private String id = null;
    private boolean isExist = false;

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

    public void setValidate(boolean isValid) {
        this.isExist = isValid;
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

    public void setId(String id) {
        this.id = id;
    }

    public boolean isExist() throws IOException {
        DataBase.accountValidate(this);
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

    public void save() throws IOException {
        DataBase.eat(this);
    }

    public boolean initUser(String fullName, String dateOfBirth) throws IOException {
        User user = new User(this.id, fullName, dateOfBirth);
        user.save();
        return (user.getId() != null) ? true : false;
    }

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
