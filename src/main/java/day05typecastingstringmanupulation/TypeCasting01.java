package day05typecastingstringmanupulation;

public class TypeCasting01 {
    //Numeric primitive data typelerinin birbirine dönüştürülmesine "Type Casting" denir.
    //Numeric data type==>byte,short,int,long,float,double
    //boolean ve char numeric değil
    //Küçük datayı büyüğe çevirmeyi java kendisi otomatik olarak yapabilir.
    // Bu işleme "AutoWidening"(otomatik genişletme) denir.
    //Büyük datayı küçüğe cevirmek risklidir.Java risk alamaz.Büyük kutuyu küçük kutuya koymaz.
    // Büyük datayı küçüğe çevirmek için kod yazmalıyız.
    // Bu işleme "ExplicitNarrowing"(Açıktan daraltma) denir.



    public static void main(String[] args) {
        //byte datayı int dataya çevir?
        //byte datasını int datasına aktarırsanız AutoWidening yapmış oluruz.
        byte age=13;
        int ageint=age;
        //Long datayı short dataya çevir?
        //Java risk almaz.Açıkça riski ben almalyım.O zaman küçük datayı açıkça göstermeliyim
        long weight=234;
        short weightshort=(short)weight;
        //Örnek- int datayı  float yap(Yeni veri ondalıklı yansır.Çünkü float)
        int population=700000;
        float populationfloat=(int)population;
        System.out.println(populationfloat);//700000.0 gösterir.Float ondalıktır.
        //Double datayı short data yap
        double sayı=100.90;
        short shortsayı=(short)sayı;
        System.out.println(shortsayı);//100 gösterir.Short ondalık almaz.Java yuvarlamaz siler atar.
        //Örnek- short
        short num=260;
        byte numbyte=(byte)num;
        System.out.println(numbyte);//4 gösterir.byte sınırını aşan sayısı byte çeviriseniz.
        //Java verilen sayıyı byte toplam verisine böler kalanı verir.
        //byte -128...+127(256 sayı)260/256 kalan 4 yapar.
        //Büyük kutunun küçük kutuyu konulmasında böyle bir ihtimal var. Hesaba katarak risk al.
        //NOT-Dönüşüm yaptığınız sayı dönüşeceğiniz data tipinin sınırları dışında ise java mod yapar.
        //Mod kalanı yarıdan fazlaysa - li kalan kullannır java
        short n=1023;
        byte byten=(byte)n;
        System.out.println(byten);//sonuç 255 olmalı ama kalan bölüm 256 ya yakın o zaman -1 yazar.


    }
}
