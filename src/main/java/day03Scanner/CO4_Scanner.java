package day03Scanner;

import java.util.Scanner;

public class  CO4_Scanner {
    public static void main(String[] args) {
        //Kullanıcıdan alınan 5 basamaklı sayının ilk iki rakam ve son iki rakamı toplamı?
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 5 Basamaklı Bir Sayı Giriniz");
        int number=input.nextInt();
        int firstTwoNumber=number/1000;
        int firsTwoNumberTotal=(firstTwoNumber/10)+(firstTwoNumber%10);
        int lastTwoNumber=number%100;
        int lastTwoNumberTotal=(lastTwoNumber/10)+(lastTwoNumber%10);
        System.out.println("SONUÇ="+(firsTwoNumberTotal+lastTwoNumberTotal));
    }
}
