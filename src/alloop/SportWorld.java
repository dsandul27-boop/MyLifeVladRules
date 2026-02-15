package alloop;

public class SportWorld extends Shop implements WorkPorgram {

    private int price;

    public SportWorld(String name, String adress, String type, int price) {
        super(name, adress, type);
        this.price=price;
    }

    @Override
    public void sale() {
        System.out.println("Sorry, no one product for sale");

    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public void sale (int price){
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {
        System.out.println("Work program at 09:00 - 21:00");

    }
}
