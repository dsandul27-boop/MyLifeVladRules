import Polimorfism.Dog;
import alloop.PotatoTomato;
import alloop.SportWorld;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PotatoTomato product = new PotatoTomato("PotatoTomato", "Product Shop", "Voice, 23", "Cucumbers");
        System.out.println("The name of shop is "+ product.getName() +" ,located at " + product.getAdress() +" street "+ "and we a "+ product.getType());
        product.sale();
        SportWorld sportShop = new SportWorld("Omega3", "grinea vieru", "sport shop", 245);
        sportShop.sale();
        sportShop.close();
    }

}


//git add .
//git commit -m "Incapsulare"
//git push