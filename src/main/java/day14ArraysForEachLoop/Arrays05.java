package day14ArraysForEachLoop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
      //Arraysda sort metodu sayisal degerleri kucukten buyuge siralar.(ascending order)
      //Arraysda sort metodu String degerleri alfabetik olarak siralar.(alphabetic order)
        //alphabetic order+ ascending order=naturel order
        //sort metodu array elemanlarini natural ordera gore siralar.
        //Arraylarda binarySearch methodu bir elemanin stringde olup olmadigini arastirir.Contain gibi.
        //binearySearch metodunu kullanmadan once sort metodunu kullanmaliyiz.Yoksa hata verebilir.
    //exaple
        String color[]=new String[6];
        color[0]="red";
        color[1]="orange";
        color[2]="blue";
        color[3]="yellow";
        color[4]="green";
        color[5]="brown";
        Arrays.sort(color);//alphabetic siralama yapti.
        int num=Arrays.binarySearch(color,"blue");
        System.out.println(num);//o verir.Cunu sort ile indeksi 0 oldu.
        int num2=Arrays.binarySearch(color,"orange");
        System.out.println(num2);//o verir.Cunu sort ile indeksi 3 oldu.
        int num3=Arrays.binarySearch(color,"gry");
        System.out.println(num3);//-6 cikar.Array de - o eleman yok demektir.Sonraki sayi da olsaydi o sayi olurdu demek.
        //Yani color arrayinda "gry" elemani yok.   Olsaydi 6. eleman olurdu.Index degil elemn gosterir.DIKKAT
        //Arraylar cok kullanilir.Interview de cok sorulur.Primitivdir.
        // Arraylerde kendi mantigimizi kullanmak zorundayiz.Listlerde eleman silme varken Arraylerde yoktur.
        //
    }
}
