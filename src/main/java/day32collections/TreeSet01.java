package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    /*TreeSet--> elemanları "naturel order"(küçükten büyüğe veya alfabetik sıraya göre)
    dizer, TreeSet naturel order yaparken çok zaman harcar
    o yüzden en yavaş settir
    tekrarlı elemana müsade etmezler

    --> currentTimeMillis():Sipesifik bir kodun ne kadar sürede
    çalıştığını görebilmek için kulllanırız

    --> ****interwiev sorusu****
    TreSet in yavaşlığından şu şekilde kurtulurum
    HashSetle önce eleman eklerim sonra onu TreeSete çevirir

    --> TreeSet eleman eklemede çook yavaştır
        HashSet ise çok hızlıdır
        TreeSetin bu negatif yönünden kurtulmak için:Hashset oluşturur elemanları ekler
        ve sonra HashSeti TreSete çeviririz

    */

    public static void main(String[] args) {
        long one=System.currentTimeMillis()   ;
    TreeSet<Integer> ts =new TreeSet<>();

    ts.add(12);
    ts.add(25);
    ts.add(8);
    ts.add(32);
    ts.add(3);

    System.out.println(ts);//[3, 8, 12, 25, 32]
                           //küçükten büyüğe
         long two = System.currentTimeMillis();
        HashSet<Integer> hs =new HashSet<>();

        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        //burda aşağıdakini sonradan ekledim
        //amacım HashSet'le eleman eklemek sonrasında TreeSete çevirmek.
        TreeSet<Integer> hts = new TreeSet<>(hs);

        System.out.println(hts);//[3, 8, 12, 25, 32]
                               //random--> rastgele dizdi
        long tree = System.currentTimeMillis();

        System.out.println("TreeSet in uygulama suresi:" + (two-one));
        System.out.println("HashSet in uygulama suresi:" + (tree-two));

        int first = ts.first();  //ilk elemanı verir
        System.out.println(first);//3

        int last = ts.last();    //son elemanı verir
        System.out.println(last);//3

          /* floor()=zemin demek bu methodda kullanabileceğimiz sayı en küçük
        elemandan az olamaz mesela 2 verirsek hata alırız  */

        int floor = ts.floor(15);//15elemanlardan birisi değil bu yüzden 15den bir önceki elemanı yazdırdı
        System.out.println(floor);//12

        int floor1 = ts.floor(12);
        System.out.println(floor1);//12elemanlardan birisi bu yüzden yazdırdı

        /* ceiling()=çatı demek bu methodda kullanabileceğimiz sayıda en büyük
        sayıdan daha büyük olmaz, eğer verdiğimiz eleman yoksa o elemana en yakın
         ve en büyük olan sayıyı yazdırr*/

         /* mesela şöyle sorularda kullanılabilir 1000e eşit veya 1000den büyük değerler için
        veya 1000e eşit 1000den küçük değerler için şunu hesapla dediğinde
        normalde foorlooplada çözebiliriz fakat Javada bir method verilmişse
        onu kullanmak daha mantıklıdır */

        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1);//25-->15 elemanlardan biri değil o yüzden 15den bir sonraki eleman yazdırıldı

       /* tail=kuyruk demek.Yani o eleman ve o elemandan sonraki elemanları alır
        SortedSet return typedır tailSetin üzerine ctrl yaptığımızda görürüz zaten */

        SortedSet<Integer> tailSet1 = ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32]

         /* tailSet(Integer fromElement, boolean inclusive) methodunda demek istediği
        elemanı bana ver verdiğin eleman dahil olsun mu olmasın mı diye sorar */

        SortedSet<Integer> tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2);//[25, 32]

        /* normalde 12 elemanı olduğu halde göstermedi çünkü ben false yaptım
        NavigableSet yazmamın sebebi tailset() methodunun return typesi bu
        olduğu için bunuda şurdan anlıyorum tailSet methodunun üzerine geliyorum
        methodun anlamına bakıyorum ctrl tuşu ile orada ne döndürdüğü yazıyor bana */

        NavigableSet<Integer> tailSet3 = ts.tailSet(12,false);
        System.out.println(tailSet3);//[25, 32]

        /* headSet methodu 12yi dahil etmeden 12den öncesini alır */

        SortedSet<Integer> headSet1=ts.headSet(12);
        System.out.println(headSet1);//[3, 8]

        SortedSet<Integer> headSet2=ts.headSet(12, true);
        System.out.println(headSet2);//[3, 8, 12]-->12yi dahil etmesini sağlayabiliriz

        /* subSet() bir elemandan bir elemana kadar olan kısmı almak
        istersek bu methodu kullanırım. ilk eleman dahil iknci olan hariç */

        /* "ctrl" ile fareyi keywördün üzerinde tuttuğumuzda orada
        public E higher(E e) {
        buradaki E lerin manası şudur;
        parantezin içindeki E ne ise publicin yanındaki E onu return eder
        ben parantezin içine int koyarsam dişindaki E int verir
        ben parantezin içine string koyarsam dışındaki E bana string verir

        -->GENERİC method:Normal methodlar parametrelerde belirtilen data typelarıyla çalışırlar
                          Generic methodlar ise verilen her türlü data type ile çalışma becerisine
                          sahiptirler */

        /* higher(hayır)-->üstü demek yani verdiğimiz değerden bir sonra gelen değer
        yani aşagıda 12 den bir sonraki elemanı aldı */

        Integer higher1 = ts.higher(12);
        System.out.println(higher1);//25

        /* lower(lovır)-->bir altı demek verdiğimiz elemanın bir altındaki elemanı al demek */

        /* Integer yazmamızın sebebi en başta treeSet leri tanımlarken data
        type olarak Integer belirlememizdi. Bunun yerine int te yazabiliriz
        hata vermez*/


        Integer lower1 = ts.lower(12);
        System.out.println(lower1);//8



























    }
}
