import inheritance.Animal;
import inheritance.Dog;
import encapsulation.Person;

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Animal polyDog = new Dog();

        Person newPerson = new Person();

        genericAnimal.speak();
        dog.speak();
        polyDog.speak();

        newPerson.setName("Kerem");
        newPerson.setAge(22);

        System.out.println("Adı: "+ newPerson.getName());
        System.out.println("Yaşı: " + newPerson.getAge());

        newPerson.setAge(-10);
        newPerson.setName("");


    }
}