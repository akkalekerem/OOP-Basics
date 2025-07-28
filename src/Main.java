import inheritance.Animal;

import interfaces.Vehicle;
import interfaces.Car;
import interfaces.Bicycle;


import interfaces.*;

public class Main {
    public static void main(String[] args) {
        interfaces.Vehicle car = new Car();
        interfaces.Vehicle bicycle = new Bicycle();

        car.start();
        bicycle.start();









        /*Animal genericAnimal = new Animal();
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
        car.move(); //Alt sınıftaki override edilen metod.*/
    }
}