package day03Scanner;

import java.util.Scanner;

public class CO9_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("iki sayı giriniz");
       double ilkSayı =input.nextDouble();
       double diğerSayı =input.nextDouble();
        System.out.println("Çarpım Sonucu="+(ilkSayı*diğerSayı));
        System.out.println("Toplam Sonucu="+(ilkSayı+diğerSayı));
        System.out.println("Fark Sonucu="+(ilkSayı-diğerSayı));
        System.out.println("Bölüm Sonucu="+(ilkSayı/diğerSayı));

    }
}
