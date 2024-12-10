package Models;

public abstract class Model {
    private String id = null;
    public void save() {
        DataBase.eat(this);
    };

    public void reconstuct() {
        DataBase.vormit(this);
    };

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
