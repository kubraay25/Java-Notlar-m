package day25Inheritence.NT;

public class Car extends Vehicle {
    public Car(){
        super(700000);
        System.out.println("Car 1");
    }
    public Car(String make){
        System.out.println("Car 2"+make);
    }

}
