package day25Inheritence.NT;

public class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle 1");
    }
    public Vehicle(int price) {
        System.out.println("Vehicle 2 "+price);
    }


}
/*Child Classtan bir obje olusturdugumuzda constructarlar en usteki e parent classdan baslatilarak alta dogru calistirilir.
 */