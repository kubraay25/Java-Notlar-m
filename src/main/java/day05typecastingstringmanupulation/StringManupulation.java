package day05typecastingstringmanupulation;

public class StringManupulation {
    //String hem non-primitive data type'dır hem de Classdır.
    //Non-primitive dataların içinde de Classların içinde de methodlar vardır.
    public static void main(String[] args) {
        String ornek="Java is easy";
        //"ornek" String'İndeki tüm karakterleri büyük harf yapınız.
        //String  yeni data oluştur yandan aktar adını yazınız . basınız gelen metodlardan tıUpperCase büyükharf yapar.
        String ornekUpper=ornek.toUpperCase();
        System.out.println(ornekUpper);//"JAVA İS EASY"

        //Örnek 2 tüm karakterleri küçük yaz
        String ornekLower=ornek.toLowerCase();
        System.out.println(ornekLower);//java is easy"

        //String deki ilk karakteri al=Java index karakter soldan 0 ile başlar.Boşluk da karakterdir.
        //Stringdeki karakter için "CharAt" metodu kullanılır.Tek karakter alırken bunu kullanırız.
        char firstchar=ornek.charAt(0);
        System.out.println(firstchar);//"J"
        char secondchar=ornek.charAt(2);
        System.out.println(secondchar);//"v"
        char fifthchar=ornek.charAt(4);
        System.out.println(fifthchar);//"" boşluk karakteri
        System.out.println(""+firstchar+secondchar);//"" neden koydum.Java soldan gelir.Concat yaptık Birleştirdik.
        //Kaçtane harf olduğunu  hangi metod ver. "Length" 1 den başlar.Boşluk sayılmaz.
        int ornekLength=ornek.length();
        System.out.println(ornekLength);//12 karakter var.
        // Örnek=>Ornek stringindeki ilk dört karakteri alınız
        //substring de ilk index dahil son index hariçtir.(0,4) 0+1+2+3 4. karakter yok.
         String orneksub=ornek.substring(0,4);
        System.out.println(orneksub);//"Java" verir.
        //ornek=> ornek stringindeki "is" kelimesini alınız.
        String ornekis=ornek.substring(5,7);//"is" verir.
        System.out.println(ornekis);
        String ornekeasy=ornek.substring(8,12);
        System.out.println(ornekeasy);//"easy" verir.
        //substring 'n 2. bir kullanımı daha var.ilk sayıyı yazıp 2. yazmazsan ilkinden başlayıp sona gider.
        String ornekiseasy=ornek.substring(5);
        System.out.println(ornekiseasy);//"is easy"
        //Ornek data sında money kelimesi var mı?
        boolean ornekmoney=ornek.contains("money");
        System.out.println(ornekmoney);//false
        boolean ornekav=ornek.contains("av");
        System.out.println(ornekav);//true
        //ornek string'inin belli bir harfle başlayıp başlamadığını kontrol et
        boolean ornekbas=ornek.startsWith("Java");
        System.out.println(ornekbas);//true
        //ornek Stringinin 6. karakterden itibaran belli harfle başlayp başlamadığı kontrol et.
        boolean ornek6=ornek.startsWith("i",5);//"i" aradığım ifade 5 bakılmayacak (offset)çöp kısım.
        //Example ornek String de "easyé "nice" yap
        String ornekrep=ornek.replace("easy","nice");//"Java is nice"
        System.out.println(ornekrep);
        //Examle a harfini * yap
        String orneka=ornek.replace('a','*');
        //replace metodunda çoklu karakterde " tek karakterde hem " hem de' olur.Ama ikiside aynı olmalı." ' olmaz
        System.out.println(orneka);//J*v* is e*sy//
        //Example ornek String deki tüm "e" harflerini siliniz.
        String ornekdel=ornek.replace("e","");//Boş bırak space koyma Silme de " ullamılır.' olmaz.
        System.out.println(ornekdel);
        //Yeni String oluştur.
        String t="Ahmet 30 Yaşındadır";
        //t stringindeki tüm rakamları * yap.
        String trep=t.replaceAll(("[0-9]"),"*");//Bir grupdata değişecekse replaceAll
        //Grupdatalar Rakam[0-9], küçükharfler[a-z],büyük harfler[A-Z]

                         //BİLİNMESİ GEREKEN REGEX'LER

        //1-Tüm rakamlar=>[0-9]
        //2-Tüm küçük harfler=>[a-z]
        //3-Tüm büyük harfler=>[A-Z]
        //4-Tüm küçük harfler vebüyük harfler=>[a-zA-Z]
        //5-Tüm harfler ve tüm rakamlar=>[azA-Z0-9]
        //6-Tüm noktalama işretleri=> //p{Punct}
        //7-Tüm sesli harfer=>[aeiouAEIO]
        //8-x,q,w harfleri=>[xqw]
        //9-Küçük karakterler hariç tüm karakterler=>[^a-z]

        //Example t stringindeki tüm rakam ve harfleri ! yap
        String t2=t.replaceAll("[a-zA-Z0-9]","!");//Hepsi ünlem oldu.
        //Example t Stringindeki tüm sesli harfleri ? yap
        String t3=t.replaceAll("[aeioAEIO]","?");//Sesli harfler ? oldu
        //Example t Stringinde küçük harfler hariç hepsini * yap
        String t4=t.replaceAll("[^a-z]","*");
        //Bir metodu öğrenirken 3 şeyi öğren
        //1.Metodun ne iş yaptığını öğren
        //2.Metodun farklı kullanım alanlarını öğrenin.
        //3.Metodun bize ne return(sonuç)edeceğini öğrenin.
        //length=>int                    substring=>String                contains=>boolean
        //toUpperCase=>String            toLowerCase=>String              charAt=>char
        //startsWith=>Boolean            endsWith=boolean                 replace=>String
        // return eder.

        //Ne öğrendik "charAt","toUpperCase", "toLowerCase", "length","substring","contains","starsWith",
        //"endsWith",



    }
}
