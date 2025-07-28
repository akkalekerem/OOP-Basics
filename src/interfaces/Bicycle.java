package interfaces;

public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle ride started.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle ride stopped.");
    }
}
