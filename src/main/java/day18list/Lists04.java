package day18list;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {
    //Listlerde get eleman getirir.Set var olan elemani degistirir.

        List<String> names=new ArrayList<>();
        names.add("AJDA");
        names.add("CUNEYT");
        names.add("MAHSUN");
        names.add("MUSLUM");
        names.add("ORHAN");
         List<String>female=new ArrayList<>();
         female.add("AJDA");
         female.add("EMEL");

        boolean soru=names.containsAll(female);//ContainsAll icinde list ister
        boolean soru1=names.contains("AJDA");//contain obje ister
        System.out.println(soru);//hepsi varsa true hepsi de yoksa false.
        System.out.println(soru1);//true



      List<String> altkume =names.subList(1,4);//bir listin alt listini seceriz.Verilen elemanlari bana ver deriz.son dahil degil
        System.out.println(altkume);

//javada eger iki index kullaniyorsak genellikle ikinci index dahil degildir.
        //sublist(1,4) bize 1, 2 ve 3verir.4 dahil olmaz.


        names.retainAll(female);//ilk verilen listde ikinc verilen listde olmayan elemanlari siler.
        //Yani iki list arasindaki ortak elemanlari gormek icin kullanilir.
        //Ilk list degisir.Ikinci degismez.
        System.out.println(names);//AJDA=>Ilk listde sadece ortak elemanla kalir.
        System.out.println(female);//AJDA EMEL=>Ikinci list degismez


        System.out.println(names.hashCode());//Heapdeki verinin slackdeki adresi essiz olmalidir.
        //names listi heapda olur.Bu list icin slackda adres olusur.HashCode bu adresi verir.
        //

    }//main
}
