package day04memorykullanımwrapperclass;

public class CO2_ASCIIDegerleri {
    //Bilgisayar 2 li sistem olduğu için her şey, 0 ve 1 le bilir.Her karakterin bir sayısı var.
    //Bunlara ASCII(Amerikan Standart Kodlama Sistemi) değerleri diyoruz.
    //Ezberlemeye gerek yok.Googldan bulabiliriz.
    //Klavyede kullandığımız harf ve sembollerin Char data türündeki değerinin ASCII daki karşılığı esas alınır.
    //Karakterlerin cebirsel karşılığını bulmak için ortaya çıkmmıştır.
    //Haflerin ASCII değerleri küçük harf büyük harfe göre de değişir.
    //Mesela büyük A harfin ascii değeri 65 küçük a harfininki 97dir.
    public static void main(String[] args) {
        //Bir tamsayı ile bir harfi toplayınız?
        int deger=20;
        char harf='a';
        //Nasıl toplarız?
        //1.yol
        int sum=deger+harf;
        System.out.println("toplam="+sum);
        //2.Yol
        System.out.println("Toplam="+(deger+harf));
        //Örnekler
        char rakam1='3';
        System.out.println("rakam1 = " + rakam1);//3 verir
        char rakam2='8';
        System.out.println("rakam2 = " + rakam2);//8 verir
        char rakam3='1';
        System.out.println("rakam3 = " + rakam3);//1 verir
        System.out.println("Rakamların Toplamı="+rakam1+rakam2+rakam3);//381 verir.Nüçün Parante yok.
        System.out.println("rakamların Toplamı="+(rakam1+rakam2+rakam3));//ASCII değer toplamını verir.Char diye
        //Sistemde ASCIı değeri bulma
        char Harf='A';
        char sembol='>';
        System.out.println("A'nın ASCII değeri="+(Harf+0));
        System.out.println(">'nın ASCII değeri="+(sembol+0));
        System.out.println("harf>sembol==>"+(Harf>sembol));//Karsılastırma işlemleri boillan verir.

        //Bir ifadeyi charla belirtirsen 2 değeri olur.
        //1-İlki resim değeridir. Nasıl yazdıysan öyle görünür.
        //2-Char değerini matematiksel bir işleme sokarsan ifadenin  Ascıı'daki integer değerini verir.
        char space=' ';
        System.out.println("space = " + (space+0));
        //ASCII değerini matematik işlemine sokmadan yapabilir miyiz?
        //Char la değil de in ile atama yaparsak olabilir.
        int hrf='m';
        System.out.println("hrf = " + hrf);//Matematik işlemi yapmadım çünkü int.
        char hrf2='m';
        System.out.println("hrf2 = " + (hrf2+0));//Matematik işlemi yaptım Çünkü Char


    }
}
