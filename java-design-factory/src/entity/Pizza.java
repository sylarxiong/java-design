package entity;

public abstract class Pizza {
    private String name;
    Sauce sauce; //酱
    Dough dough;//面

    public abstract void prepare();

    public void bake(){

    }

    public void cut(){

    }

    public void box(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
