package alloop;

public abstract class Shop {

    private String type;
    private String adress;
    private String name;

    public Shop(String name, String adress, String type) {
        this.adress = adress;
        this.name = name;
        this.type = type;
    }

    public abstract void sale();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
