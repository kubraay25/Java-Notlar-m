package day03Scanner;

import java.util.Scanner;

public class CO7_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Adınızı Giriniz");
        String name=input.next();
        System.out.println("Soyadınızı Giriniz");
        String soyad=input.next();
        System.out.println("Adınız Soyadınız="+name+soyad);

    }
}
