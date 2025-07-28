package abstraction;

public class Car extends Vehicle {
    //abstract metodu override ediyoruz.

    @Override
    public void move() {
        System.out.println("Araba yolda ilerliyor...");
    }
}
