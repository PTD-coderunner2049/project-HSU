package Models;

@SuppressWarnings("unused")
public class Account {
    private String username;
    private String password;
    private User currentUser = null;
    private String id = null;

    private boolean isValid = false;
    private boolean isAdmin = false;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        if (isValid())
            currentUser = new User(id);
    }

    public boolean getValidate() {
        return isValid;
    }

    // public boolean getAdminRight() {
    // return isAdmin;
    // }

    public void setValidate(boolean isValid) {
        this.isValid = isValid;
    }

    public void setAdminRight(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public User getCurrentUser() {
        return currentUser;
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

    public boolean isValid() {
        // TODO search for the match of already existed account on database
        // ngl, amma just makeit auto valid rn;
        if (true) {
            return isValid = true;
        } else {
            return isValid = false;
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

}
