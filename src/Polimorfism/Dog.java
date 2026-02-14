package Polimorfism;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Brat, di si nu dai din coada?");
    }

    public void voice(String ss){
        System.out.println(ss);
    }
}
