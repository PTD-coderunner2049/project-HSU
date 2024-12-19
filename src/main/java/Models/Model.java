package Models;

public abstract class Model {
    private String id = null;

    public final boolean save() {
        return DataBase.eat(this);
    };

    public final boolean reconstuct() {
        return DataBase.vormit(this);
    };

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


}
