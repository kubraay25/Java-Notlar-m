package day32collections;

import java.util.LinkedHashSet;

public class LinkesHashSet01 {
    /*LinkedHashSet--> LinkedHashSet elemanları "insertion order"a göre dizer
    belli bir sıralamaya göre dizer
    tekrarlı elemana müsade etmezler
     */
    public static void main(String[] args) {

       LinkedHashSet<String> artist = new LinkedHashSet<>();
       artist.add("Ajda");
       artist.add("Tom");
       artist.add("Brad");
       artist.add("Angelina");
        /* -->setler tekrarsız eleman içerirler
           -->siz aynı elemanı tekrar tekrar eklerseniz Java hata vermez, ama tekrarlı
        eklenen elemanı "Set"e sadece bir kere koyar
        */
       artist.add("Tom");
       //burda Tomu iki kere eklememe rağmen hata vermedi çünkü elemanı yazarken
        // hata vermiyor,sisteme eklerken en sonki Tomu ekliyor
        //yüz tane dahi eklesek onu bir kere gösterir
        //en sonli elemani gösterme işlemine ("override"==> üstüne yazma işlemi) denir
        System.out.println(args);//[Ajda, Tom, Brad, Angelina]

        LinkedHashSet<String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        //burda erkekleri görmek isteyip bayanları görmek istemessek
        //removeAll(actress) methoduyla bayan sanatçılar tüm sanatçılardan çıkartılacak
        //tekrarlı eleman kullanamayız burada çünkü sette tekrar eden bir eleman kullanamayız
        artist.removeAll(actress);
        System.out.println(artist);//[Tom, Brad]

        /* --> retainOll() methodu farklı olanları siliyordu
               kalanları veriyordu
        */








    }


 }