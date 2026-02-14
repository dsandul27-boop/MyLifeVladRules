package mostenire;

public class Parent {
    public String familyName;
    public String streetAdress;
    public String carModel;

    public Parent(String familyName, String streetAdress, String carModel){
        this.carModel=carModel;
        this.streetAdress=streetAdress;
        this.familyName=familyName;
    }

    Parent(){}

    public void hug(){
        System.out.println("Hug me, please");
    }
}
