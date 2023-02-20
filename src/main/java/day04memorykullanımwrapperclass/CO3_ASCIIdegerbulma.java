package day04memorykullanımwrapperclass;

public class CO3_ASCIIdegerbulma {
    public static void main(String[] args) {
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
        System.out.println("hrf2 = " + (hrf2+0));//Matematik işlemi yaptım Çünkü Char.
    }
}
