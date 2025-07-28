import inheritance.Animal;
import inheritance.Dog;
import encapsulation.Person;
import abstraction.Vehicle;
import abstraction.Car;

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Animal polyDog = new Dog();

        genericAnimal.speak();
        dog.speak();
        polyDog.speak();

       // Encapsulation örneği
        Person newPerson = new Person();
        newPerson.setName("Kerem");
        newPerson.setAge(22);

        System.out.println("Adı: "+ newPerson.getName());
        System.out.println("Yaşı: " + newPerson.getAge());

        // Abstraction örneği
        Vehicle car = new Car();
        car.start(); //Soyut sınıftaki hazır metod.
        car.move(); //Alt sınıftaki override edilen metod.
    }
}