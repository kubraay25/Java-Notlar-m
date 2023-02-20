package practice.practiceDTNT;

import java.util.Scanner;

public class ornekcarpim {
    //Kullanicidan aldiginiz sayinin carpim tablosunu yazdiriniz?

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Carpim Tablosunu Gormek Icin Bir Sayi Giriniz");
        int deger=input.nextInt();

        for (int i = 1; i <11; i++) {
           int carpim=deger*i;
            System.out.println(deger+"×"+i+" = "+carpim);
        }


    }
}
