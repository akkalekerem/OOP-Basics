import inheritance.Animal;
import inheritance.Dog;
public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Animal polyDog = new Dog();

        genericAnimal.speak();
        dog.speak();
        polyDog.speak();
    }
}