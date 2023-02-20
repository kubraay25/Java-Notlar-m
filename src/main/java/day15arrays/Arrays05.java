package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        //EX1-String Array elemanlarini uzunlugun gore kucukten buyuge sirala
        String arr[]={"Michael","Ajda","Thomas","Tom"};//sort alfbetik siraya dizer.
        // Biz karakter sayisina gore sira istiyoruz.
        //Bunun icin sort  comprtor
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.comparingInt(String::length));//iki nokta method referansdir.Stringdeki length i kullan dedik.
        System.out.println(Arrays.toString(arr));

        //EX2-String elemanlarini karakter sirasina gore buyukten kucuge sirala
        String brr[]={"Michael","Ajda","Thomas","Tom","Cuneyt"};
        System.out.println(brr);
        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed());
     //exp arrayi char sayisina gore buyukten kucuge diz
        //ayni char alnlari daalfbetik siraya koy
        String crr[]={"Michael","Ajda","Thomas","Tom","cin","Cuneyt"};
  Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));


    }//main
}
