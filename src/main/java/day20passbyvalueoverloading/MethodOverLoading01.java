package day20passbyvalueoverloading;

public class MethodOverLoading01 {
    public static void main(String[] args) {
//isimleri ayni islevleri farkli olan metodlar overLoading Methodtur.
        String s = "Java";
        add(5, 2);//add 2 tane int topla
        add(2.4, 5.8);//add double topla
        add(5, 2.5);//add int ile double topla
        add(2, 8, 5);//add 3 tane int topla

//ikisi de add metodu ama biri int biri double parametreleri ile calisir.
        /* Method overloading nasil yapilir?
        1-Parametrelerin data tipleri degistirilebilir.
        2-Parametrelerin sayisi degistirilebilir.
        3-Farkli data tipine sahip parametrelerin yerleri degistirilebilir.
        4-method ismi degistirilmez.Degisirse baska method olur.
        5-return type ve access modifier  degismesi overloading ile alakali degildir.
        6-Metod body degisse de overloading olmaz.Ayni metod kabul eder.
        7-Java icin isim ve parmetreleri ayni olan metodlar tamamiyla aynidir.Java bunu kabul etmez.
        8-"isim" ve "parametre" "Method Signature" olarak adlandirilir.
        9=Privite Metodlar da overload edilebilir.Cunku method overloading sadece bir class icinde olusturulur.
        -Privite ise baska classlara gidildiginde sikinti olusturur.
        -ilerde override gorecegiz.Privite lar override yapilamayacak.
        10-Static metodlar overload edilebilirler.        */
        ///Diyelim ki int int metodu yok.Ama double double int double ve double int var.Biz add icin 2 int girdik ne olacak
        // Java double double icin 2 Autowiding yapar.int double ve double icin 1 AW yapar.
        //2 Aw yi siler.Digerlerinden hangisine gidecek.Java kendisi gitmez.Secmezsek compile time verir.
        //int int metodunda 0 AW oldugu icin zaten digerlerine gecmez.
        //ayni olay double yazip int ekoyarken olmaz cunku java exnarrowWining kendisi yapmaz.


    }//main

    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

}
