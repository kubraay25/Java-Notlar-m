package day03Scanner;

public class Car {
    //Variablesler( pasif özellikler)==>object(ürün,kek)
    // Metodlar(aktif özellikler)

    public String marka = "Honda";//pasif özellik variables
    public int fiyat = 200000;


    public static void main(String[] args) {//aktif özellikler metodla
        //Obje nasıl oluşturulur?
        //Clas İsmi          Obje İsmi       Atama Operatörü         "new" keyword          Constructor(Yapan)
        Car                    myHonda              =                      new                     Car();
        //Constructor yoksa obje oluşmaz.Constroctur nasıl oluşur.Class ismi+ ()
        System.out.println(myHonda.marka);
        System.out.println(myHonda.fiyat);
        myHonda.hareket();
        myHonda.dur();

    }

    public void hareket() {
        System.out.println("Honda hızlı hareket eder.");

    }

    public void dur() {
        System.out.println("Honda Güvenle Durur");
    }

}
