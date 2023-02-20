package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    /* -->Iterators(=yineleyici) "loop"lar gibidir elemanı alır işleme sokar
    elemanı alır işleme sokar eleman bitincede loopu kırar. Java aynı işi yapan iki yapıyı
    neden oluşturmuştur:
    1."ıteration" yeni bir yapıdır looplar eskimişitr
    2."loopların" sonsuz loopa düşme ihtimali vardır ama "ıteration"larda böyle
    ihtimal yoktur
    3."ıteration" ile "loopların" performans olarak pek farkları yoktur yani hız açısından
    4."ıteration"lar eleman silmede ve elemanı uptade etmede daha başarılıdırlar
    5.Java'ın "ıterator"leri ortaya çıkarmasının sebebi sonsuz loop riskini
    bitirmektir(infinite=sonsuz)
    6. Iterator'lar Java tarafından oluşturulmuşlardır be loop'ların yaptıkları
    bütün işlemleri yapabilirler

    7. iki tip Iterator vardır
       i.)-->Iterator: Sadece eleman'ları remove edebilirsiniz
                       Elemanları "uptade" etmeye asla müsade etmez sadece silme fonksiyonu vardır
                       Sadece soldan sağa çalışır yani tek yönlüdür


       ii.)-->ListIterator: Elemanı "remove etme" ve "uptade etme" ve "add" yapabilirsiniz
                            Hem sol'dan saga hem de sag'dan sola calısabilir yani cift yonludur

     */

    public static void main(String[] args) {

           /* listler "mutable"dir orijinal değer değişebilir
           altta "remove" methodunu kullanınca orjinal list değişti */


        /* ****************   ITERATOR    *************** */

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");        /*   -->[Ali, Can, Aliye] bu normal list yapısı   */
        list1.add("Aliye");
        Iterator<String> itr1 = list1.iterator();   /* ****** list1.iterator *******
                                                      listi "ıtratore" cevir deriz burda */

        while(itr1.hasNext()){   //hasNext:(sonrasında eleman var mı) demek.. yani elemanlar bitene kadar tek tek alacak

            itr1.next();      //next() methodu pointeri bir sonraki elemanın önüne itekler
                              //bize eleman verecek önce "Ali"yi sonra "Can"ı sonra "Aliye"yi verecek

            itr1.remove();    //  remove() methodu next() methodunun vermiş olduğu elemanı imha ediyor
                              // önce "Ali"yi siler sonra "Ccan"ı siler sonra "Aliye"yi siler
        }
        System.out.println(list1);//[]

          /* **************  LİST ITERATOR  *************** */

        //Example 1
        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);
        ListIterator<String> listItr = list2.listIterator();

        while (listItr.hasNext()){
            String el = listItr.next();
            listItr.set(el + "!");
        }
        System.out.println(list2);//[Ali!, Can!, Aliye!]




        //Example 2
        //burda tersten çalışacağız
        //"hasPrevious"--> pointeri en sona iter sondaki elemanlardan almaya başlarız
        //"previous"--> pointeri en sondan sırasıyla bir önceki elemana getirecek
        //
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);
        ListIterator<String > lisItr2 = list3.listIterator();

        // Asagıdaki loop "pointer"i en saga almak icin yazildi
        while (lisItr2.hasNext()){
            lisItr2.next();
        }
        // Asagıdaki loop elemanları en sondan en basa dogru yazdirmak icin yazildi
        while (lisItr2.hasPrevious()){
            String el = lisItr2.previous();
            System.out.println(el+ " <==");// Aliye <==
                                           // Can <==
                                           // Ali <==

        }
    }
}
