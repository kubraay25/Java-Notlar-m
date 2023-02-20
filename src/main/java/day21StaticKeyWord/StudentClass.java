package day21StaticKeyWord;

public class StudentClass {

    /*
    1-static variable veya static methodlar(class member) tum objectler icin ortak elemandir.
    2-Static class memberlar uzerinde yapilan tum degisiklikler tum objektleri etkiler.
    3-static class memberlar classa instance memberlar objectlere monte edilir.
    4-Bir classdan 100 obje olustugunda static olan 1 instance olan 100 kere olusur/
    5-static class memberlara ulamak icin object olusturmaya gerek yok.Instance icin gereklidir/
    */
//Static olmasi memory miktarini etkilemez.Memory data tipine gore degisir.
    //Bazi veriler herkesle paylasilmaz ozeldir.Bu yuzden her veri static degil.
    //static variable, class variable olarak da adlandirilir.
    //instance variable, object variable olarak da adlandirilir.
    public static String stdname = "Tom Hanks";
    public int age = 13;
    //bu classdaki bu verileri stdrunner yani runner classda kullanacagiz.Oraya bak simdi.





}//class
