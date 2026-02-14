package mostenire;

public class Child extends Parent{
    private String sex;
    private String nameOfCild;
    private int age;

    public Child(String sex, String nameOfCild, int age, String familyName, String streesAdress, String carModel){
        super(familyName, streesAdress, carModel);
        this.age=age;
        this.carModel=carModel;
        this.nameOfCild=nameOfCild;
    }

    @Override
    public void hug() {
        super.hug();
    }
}
