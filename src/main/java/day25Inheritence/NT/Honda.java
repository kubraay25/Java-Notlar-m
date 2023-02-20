package day25Inheritence.NT;

public class Honda extends Car {
    public Honda(){
        super("City");
        System.out.println("Honda 1");
    }
    public Honda(String model,int year){
        System.out.println("Honda 2 "+model+" "+year);
    }

}
