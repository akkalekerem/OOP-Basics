package encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        } else {
            System.out.println("Name is empty");
        }

    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        // Yaş negatif olamaz
        if(age >= 0){
            this.age = age;
        } else {
            System.out.println("Yaş negatif olamaz!");
        }

    }
}
