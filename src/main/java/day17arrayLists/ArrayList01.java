package day17arrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        ArrayList`lere kisaca list de derler.
        ArrayList`ler coklu data depolamak icin kullanilir.
        Array`lerde coklu data depolardi.Farklari ne?

        1.
        -ArrayList`ler non-primitive data tipindeki coklu datalari depolamak icin kullanilir.
        -Array`lere ise primitive data ve reference koyabaliriz.

        2.
        -Arraylist`ler olusturulurken icine koyulacak eleman sayisinin baslangicta belirtilmelmesi gerekmez.
        -Array`lerde ise data tipi ve eleman sayisini belirtmek gerekir.
        -ArrayList`ler eleman sayisi bakimindan esnekken(flexible) Array`ler esnek degildir.

        SORU=Arrayler flexible olmamasina ragmen nicin kullaniliyor?
        -Gun sayisi eyalet sayisi gibi eleman sayisi belli olan durumlar icin kullanilabilir.
        -Eleman sayisi belli olanlar list`lere de konulabilir AMA Arrayler daha hizli calisir ve memory`de daha az yer kaplar.
        */

        //List Nasil Olusturulur?

        ArrayList<Integer>ages=new ArrayList<>();//Integer dedik cunk primitive data kabul etmez.
        System.out.println(ages);//[]cikar.Bos verir.Arrayde verilmeyen elemanlar null ya da 0 yapardi.
        //Ayrica Array.toString(ages) demiyoruz.Dogrudan arraylistin datasini verir.

        //list`lere eleman nasil eklenir.
        ages.add(12);//[12]olur
        ages.add(9);//[12,9] verir.O zaman elemanlari bizim verdigimiz siraya gore listeye koyar.
        //add metodu ile eleman ekleriz.Add methodu verdigimiz siraya gore elemanlari liste ekler.
        //Buna insertion Order denir.
       ages.add(10);//[12,3,10] olur.
        ages.add(1,656);//Bu metotda ise indekse atama yapariz.[12,656,3,10] olur
        ages.add(3,77);
        //Liste coklu eleman nasil eklenir.
        //Bunun icin bu elemanlari once bir list icine koymaliyiz.Yani iki listi birlestirmis oluruz.
        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        ages.addAll(newAges);//newages listesini ages listesinin en sonuna ekledik.
        System.out.println(ages);//[12, 656, 9, 77, 10, 8, 9, 10]
        ages.addAll(2,newAges);//newages listesini 2. indeksden baslatmak icin kullanilan metod.
        System.out.println(ages);//[12, 656, 8, 9, 10, 9, 77, 10, 8, 9, 10]
        //add metodu en sona birer birer ekler.
        //indeksli add metodu istedigimiz yerden birer birer ekler.
        //addall metodu yeni bir listi en sondan ekler.
        //indeksli addall metodu istedigimiz yerden yeni bir list ekler.

        //ages.clear(); bu metod hepsini siler.[] boyle olur.
        //ages.toArray(); arraye cevirir.Nicin?List bitti eleman sayisi daha degismeyecek.Hizdan faydalanalim.
       boolean r= ages.contains(5);//5 list de var mi yok mu?
        boolean t=ages.equals(newAges);//Bir listin baska list ile ayni olup olmadigina bakar.
        System.out.println(r);//false
        System.out.println(t);//false Listlerin esit olmasi icin ayni indexde ayni elemanlar olmalidir.

        //EXP verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol et.Esit demiyoruz.
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        a.add(5);
        a.add(9);
        a.add(0);
        b.add(9);
        b.add(0);
        b.add(5);
        Collections.sort(a);//Kucukken buyuge dizdik
        Collections.sort(b);//Kucukken buyuge dizdik.Artik esit degillerse elemanlar ayni degil demektir.
        boolean c=a.equals(b);
        System.out.println(c);//True
    //Listler Collection yapisinin bir parcasidir.Bu yizden list de collection yapisina gidip yeni metodlar buluruz.

    }//main
}
