package Models;

public abstract class Model {

    public void save() {
        DataBase.eat(this);
    };

    public void reconstuct() {
        DataBase.vormit(this);
    };
    
}
