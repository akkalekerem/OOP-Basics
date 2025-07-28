package abstraction;

public abstract class Vehicle {
    String brand; //Ortak özellik.

    //Soyut metod -> alt sınıflar mutlaka override etmek zorunda.
    public abstract void move();

    //Normal method alt sınıflar isterse kullanabilir.
    public void start(){
        System.out.println("Araç çalıştırılıyor....");
    }
}
