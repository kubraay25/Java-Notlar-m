package day31collections;

import java.util.HashSet;
/*HashSet--> süper hızlıdır, çünkü HashSet'lere verdiğiniz elemanları
        sıralamak için vakit kaybetmez yani HashSet'lere eklenen
        elemanlar rastgele sıralanırlar,elemanlarının sırasıbnın hiçbir önemi yoktur
        mesela öğranci maillerini alfabetik sıraya koymaya gerek yoktur
        -->HashSetler tekrarlı elemana müsade etmezler
        -->HashSetler sadece bir tane "null"ı eleman olarak kabul ederler

 */
public class HashSet01 {
    /* hash--> bir tekniktir biz bu tekniği kullanarak datalar üretiriz
               benzersiz data üretir yani yünik yani quene

    202238170013
    Yıl-Unikod-Bölümkod-Bölümegirişsırası-->Hashing Technique (tekniği)

    HashCode-Hashing Technique
    138-abc
    102-abc
    567-bnh
    rakamlar HashCode
    harfler Technique

    -->harfler aynı olabilir ama kodlar aynı olamaz
    -->Hashing Technique aynı olabilir ama HashCode aynı olamaz
    --> mail adresi için en iyi opsiyon settir

    javaya gider derizki bana hashcodemu ver oda bana bilgilerimi verir */

    /* set--> benzersiz data demektir,arrayliist ve linkedlistler tekrarlı datayı
              kabul edebilirler setler etmezler
       set-->tekrarsız datayı depolamak için set kullanırım
       set 3'e ayrılırlar:-->1.)HashSet--> süper hızlıdır, çünkü HashSet'lere verdiğiniz elemanları
                                        sıralamak için vakit kaybetmez yani HashSet'lere eklenen
                                        elemanlar rastgele sıralanırlar,elemanlarının sırasıbnın hiçbir önemi yoktur
                                        mesela öğranci maillerini alfabetik sıraya koymaya gerek yoktur
                                       -->HashSetler tekrarlı elemana müsade etmezler
                                       -->HashSetler sadece bir tane "null"ı eleman olarak kabul ederler

                             2.)LinkedHashSet--> LinkedHashSet elemanları "insertion order"a göre dizer
                                                 belli bir sıralamaya göre dizer
                                                 tekrarlı elemana müsade etmezler
                             3.)TreeSet--> elemanları "naturel order"(küçükten büyüğe veya alfabetik sıraya göre dizmek)
                                           göre dizer, TreeSet naturel order yaparken çok zaman harcar
                                           o yüzden en yavaş settir
                                           tekrarlı elemana müsade etmezler

    */
    public static void main(String[] args) {

        HashSet<Integer> hs =new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        System.out.println(hs);//[5, 234, 12, 78]
                               //random:yani rastgele sıralama yaptı

        int hc = hs.hashCode();
        System.out.println(hc);//329
                               //hs nin kodunu verdi bize
                               //ama mantıken bilmeliyiz ki "hs HashCode" içinde barındırdığı
                               //elemanlarının her biirisininde hashcodesi olduğudur
    }
}
