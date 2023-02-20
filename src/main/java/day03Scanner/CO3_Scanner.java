package day03Scanner;

import java.util.Scanner;

public class CO3_Scanner {
    public static void main(String[] args) {
        //Kullanıcıdan sayılar olarak kodlama işlemei yapan kodu yazınız?
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        Double sayı1 = input.nextDouble();
        System.out.println("İkinci Sayıyı Giriniz");
        Double sayı2 = input.nextDouble();
        System.out.println("Toplam=" + (sayı1 + sayı2));


    }
}
