package alloop;

public class PotatoTomato extends Shop implements WorkPorgram {

    private String nameOfProduct;

    public PotatoTomato(String name, String type, String adress, String nameOfProduct) {
        super(name, type, adress);
        this.nameOfProduct = nameOfProduct;
    }

    public void cashPayment() {
        System.out.println("Dear people, you can purchase our product only for cash!");
    }

    @Override
    public void sale() {
        String[] array = {"Potato", "Tommato", " Carrots", "Cherry", "Apple", "Lemon"};
        for (int i = 0; i < array.length - 1; i = i + 2) {
            System.out.println(array[i] + " - sale 25 %");
        }

    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
