package day20passbyvalueoverloading;

import java.util.Arrays;

public class PassByValueArray {public static void main(String[] args) {

      /*
		 bir array oluşturalım.
		 sonra array elemanlarını  elemanDegistir methodu yazıp orada
		 array elemanlarından bazılarını degiştirelim.
		 method void olsun.
		 main methoda döndükten sonra yeniden array'i yazdıralım
		 */
    int sayilar[]={3,4,5,6};

    System.out.println("sayilar[] "+ Arrays.toString(sayilar));

    elemanDegistir(sayilar);//Bir elemani degistirdik.Array degismemis korunmus oldu.Dolayisiyla eleman degisebilir.

    System.out.println(" main icinde Eleman degisince sayilar[] = " + Arrays.toString(sayilar));
    // main icinde Eleman degisince sayilar[] = [10, 4, 5, 6]

    arrayiDegistir(sayilar);//eleman sayisi degisirse array degisir.Dolayisiyla arrayi korur.
    System.out.println("main icindeki arrayi degistir " + Arrays.toString(sayilar));//[10, 4, 5, 6]

}//main

    private static void arrayiDegistir(int[] sayilar) {
        sayilar= new int[6];
        System.out.println("method icinde arrayidegistir = " + Arrays.toString(sayilar));//[0, 0, 0, 0, 0, 0]

    }

    private static void elemanDegistir(int[] sayilar) {
        sayilar[0] =10;
        System.out.println(" method icinde Eleman degisince sayilar[] = " + Arrays.toString(sayilar));
        // [10, 4, 5, 6]
    }

}
