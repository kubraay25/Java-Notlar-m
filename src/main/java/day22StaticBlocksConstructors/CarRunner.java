package day22StaticBlocksConstructors;

public class CarRunner {
    public static void main(String[] args) {
        Car c1=new Car("BMW","M4",2023,false);
        Car c2=new Car("Audi","r8",2022,true);
        Car c3=new Car("Honda","City",2022,true);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }//Constructorda to string yapinca icerisi gozukur.Yoksa adresleri gozukur.


}
