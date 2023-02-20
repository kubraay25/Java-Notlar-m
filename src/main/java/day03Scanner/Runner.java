package day03Scanner;

public class Runner {
    public static void main(String[] args) {
        student ahmetSAAT=new student();
        System.out.println(ahmetSAAT.name);
        System.out.println(ahmetSAAT.age);
        System.out.println(ahmetSAAT.address);
        ahmetSAAT.study();
        ahmetSAAT.feed();
        Car myhonda=new Car();
        System.out.println("Fiyat="+myhonda.fiyat);
        System.out.println("Marka="+myhonda.marka);
        myhonda.hareket();
        myhonda.dur();

    }
}
