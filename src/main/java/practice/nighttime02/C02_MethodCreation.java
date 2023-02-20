package practice.nighttime02;

import java.io.PrintStream;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //Dikdortgenin alanini hesaplayan kodu yaziniz.
        //Methodlar Mainin disinda yazilir.Mainin icine gidilip metod cagrilir.
        //Metod adini yaz.Degerleri gir.Yazdirmak icin sout icine yaz.
        //Metodun kapanis parantezi disinda noktaya basip sout diyebilirsin
        System.out.println("Dikdortgenin Alani="+dikdortgenAlani(8, 15));
        System.out.println("Dikdortgenin Cevresi="+dikdortgenCevre(7, 8));
        kareninAlani(9);


    }//Main
    //Static neden yazilir.Vip musteri gibidir.Yani herkes main methodtan iceri giremez.
    //Access modifier+static+data type+metod ismi+(parametreler)+{return}
    public static int dikdortgenAlani(int a,int b){return a*b;}
    public static int dikdortgenCevre(int a, int b){return 2*(a+b);}
    //void birsey dondurmez.Bunun icin return yazamam.Yani void degilse return yapmalisin.
    //Asagidaki gibi yapip yukarida sadece method cagirsan yeter.
    public static void kareninAlani(int a){
        System.out.println("Karenin Alani="+a*a);}
}//Class
