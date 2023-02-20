package day36Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaNt {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>(Arrays.asList("Ayse","ibrahim","Okan","Ada","Semih","Gulsen","Ali","Zeynep","semih","Zeynep"));

    xIleBiten(isimler);

    }



    public static void alfBykTkrsz(List<String> isimler){
        isimler.
                stream().
                distinct().
                map(String:: toUpperCase).
                sorted().
                forEach(t-> System.out.print(t+" "));
    }

    public static void krktrSysyTrsSrl(List<String> isimler){
        isimler.
                stream().
                distinct().
                map(String:: length).
                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.print(t+" "));
    }


//3List elemanlarini, character sayisina gore kckten byk e gore print ediniz..
public static void krktrSysykcktnByg(List<String> isimler){
    isimler.
            stream().
            map(String:: length).
            sorted().
            forEach(t-> System.out.print(t+" "));
}




    // Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void krktrSys7Az(List<String> isimler){
        isimler.
                stream().
                map(String:: length).
                filter(t-> t<7).
                forEach(t->  System.out.print(t+" "));
    }




    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.

    public static void wIleBaslayan(List<String> isimler){
        System.out.println(isimler.
                stream().
                distinct().
                noneMatch(t -> t.startsWith("w")));


    }




    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mı kontrol ediniz.

    public static void xIleBiten(List<String> isimler){
        System.out.println(isimler.
                stream().
                distinct().
                anyMatch(t-> t.endsWith("x")));


    }



    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void krakterEnByk(List<String> isimler){
       int maxValue=isimler.
                stream().
                distinct().
                map(String :: length).
               reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
               System.out.println(maxValue);
    }



    // Task-8 : list elemanlarini son harfine göre siralayıp ilk
    // eleman hariç kalan elemanlari print ediniz.



    // Task-9 : Karakter sayilari cift olan elemanlarin karakter sayilarinin karelerini hesaplayan;
    // tekrarli olanlari sadece bir kere buyukten kucuge  yazdiran programi yaziniz



}
