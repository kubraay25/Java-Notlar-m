package day19Listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lists02 {
    public static void main(String[] args) {

      /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
        1. Kullanicidan ismini isteyelim
        2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
        3. Kullanici adinin alinabilir olup olmadigina bakalim.
        4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
        5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.*/

        List<String> databaseIsim = new ArrayList<>();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");
        databaseIsim.add("BETUL15");
        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen Kullanici Adinizi Giriniz");
        String ad=input.nextLine().toUpperCase().trim();//listdeki hepsi buyuk harf uyum sagla
       int random=(int)(Math.random()*100);
       while (databaseIsim.contains(ad+random)){
           random=(int)(Math.random()*100);
       }

        if(databaseIsim.contains(ad) || databaseIsim.contains(ad+random)){
            System.out.println(ad+ " Kullanici adi zaten var.Tekrar Kullanilamaz");
            databaseIsim.add(ad+random);

        } else {
            System.out.println(ad+" Kullanici Adi Kullanilabilir");
            databaseIsim.add(ad);


        }
        System.out.println(databaseIsim);


//randow yapmanin 2/ yolu
        int newrandom=new Random().nextInt(100);//Yuze kadar random yap dedik
        //diger yol deydi
        int random3=(int)(Math.random()*100);//math random 0 ile 1 arasi verir.Ben de 100 ile carptim.
        //Cok virgullu verir.Int yaptim.

    }//main
}
