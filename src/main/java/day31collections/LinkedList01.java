package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

 /*
             1)interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
             2)Abstract Class'lardan object olusturulamaz, constructor'lari vardir ama constructor object olusturmada kullanilamaz.
             3)interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden sonra kullanilamaz.
             4)*class --> class ==> extends
              class --> interface ==> implements
              *interface --> interface ==> extends
              interface --> class ==> Bu mumkun degildir.
             5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
             yapilacaksa ArrayList kullanmak tavsiye edilmez.
             6)LinkedList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
             leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
             durumlarda LinkList kullanmak tavsiye edilir.
             7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
             8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
             bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.
     */

    //COLLECTİONLAR-->
    //hepsi non-primitive kullanırlar
    //çoklu eleman depolamaya yararlar
    //Aşağıdakiler çoklu eleman depolamaya yarayan collection classlarıdır
    //ArrayList:-->arama işlemi yaparken
    //LinkedList:-->ekleme ve silmede
    //PriorityQueue
    //HashSet
    //LinkedHashSet
    //TreSet
    //her birini neye göre depolayacağız onu öğreneceğiz
    //hangi opsiyonu hangi senaryoda kullanacağız



    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        List<String> cityNames = new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");                //şimdi bunu yazdıralım sout yapalım
        names.add("Raj");                 //add(); methodu burda arraylerdeki gibi görev yapar benim koyduğum sıraya göre isimleri yazdırırır
        names.add("Megan");               //add(); methodu herzaman sona ekleyerek ilerler
        names.add("Brandon");             //inser order--> sipariş ekle (add methodu)*/

        System.out.println(names);//[Steve, Ajda, Raj, Megan, Brandon]

        //normalde arraylistlerde dört tane add methodu vardır ama linked listlerde add
        //addFirs addLast gibi methodlarda mevcuttur çünkü index kullanmadığından bazen en başa ekleme ihtiyacı hissederiz
        //addLast olmasada olur zaten sona ekliyor ama okunurluğu arttırmak için
        names.addFirst("Cuneyt");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        // Last(); methodu sona ekleme yapar add(); methoduyla aynı işlevi görür
        names.addLast("Ajda");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        //normalde LinkedListlerde index yoktu fakat bu methodun içerisine developerlar mod eklemiş
        //mod numarasını verdiğimizde koymasını istediğimiz ismi ekliyoruz o indexten itibaren ismi oraya ekliyor
        //yani index yok sadece index mantığıyla çalışması var 3 dersek 3. indexin yerine koyarak ekleme yapar
        //LinkedListlerde index li kullanım olsa bile index yoktur :))
        names.add(3,"Süleyman");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Süleyman, Raj, Megan, Brandon, Ajda]

        //clear(); elemanların hepsini siler

        //remove(Object e)--> objeyi ver sileyim
        //aynı isim olduğunda ilk görünümü siler yani ilk ajdayı sonra loopu kırar
        names.remove("Ajda");
        System.out.println(names);//[Cuneyt, Steve, Süleyman, Raj, Megan, Brandon, Ajda]

        //remove(int index)-->indexi ver sileyim
        // arkada java bu indexi nod5 olarak kabul ediyor
        names.remove(4);
        System.out.println(names);//[Cuneyt, Steve, Süleyman, Raj, Brandon, Ajda]


        names.add("Süleyman");
        names.add("Süleyman");
        System.out.println(names);//[Cuneyt, Steve, Süleyman, Raj, Brandon, Ajda, Süleyman, Süleyman]

        //remove() methodunda içi parametresiz olduğunda sadece ilk elemanı siler
        //names.remove();bu normalde sadece ilk elamanı siler
        //String r1=names.remove();--> bunu sout yaptığımızda sildiği elemanı verir bize

        String r1 = names.remove();
        System.out.println(r1);//Cuneyt
        System.out.println(names);//[Steve, Süleyman, Raj, Brandon, Ajda, Süleyman, Süleyman]

       //names.removeLast();//son elemanı siler

        //occurence:ökırıns--> görünüm demek
        //removeFirsOccurence:"verdiğim Stringli ifadenin ilk görümünü sil" demek
        names.removeFirstOccurrence("Süleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Süleyman, Süleyman]

        //removeLastOccurrence()--> son görünümü siler
        names.removeLastOccurrence("Süleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Süleyman]

        //getFirst()-->ilk elemanı getir demek
        //getLast()-->son elemanı getir
        //Bu methodları String konteynırı içine koyarız sout yaparız

        //String g1=names.getFirst();
        //System.out.println(g1);//Steve

        //indexOf-->bir elemanın ilk görünümünün indexini verir
        //lastIndexOf-->bir elemanın son görünümünün indexini verir

        //ilk elemanı silmeden bize verir hatta buna copy-paste deriz
        names.peek();
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Süleyman]

        String k1=names.peek(); //bize ilk elemanı verir
        System.out.println(k1);//Steve

        //remove() ve peek() methodunun farkı şudur
        //remove()-->elemanı silip verir--> cut-paste
        //peek()-->elemanı silmeden verir--> copy paste

        //ilk eleman silinir --> remove() "boş linkedListe" kullanılırsa hata verir
        //poll()--> "boş linkedListte" kullanılırsa "null" verir
        names.poll();

        //(cut-paste) --> ilk elemanı bize verir
        names.pop();


    }
}
