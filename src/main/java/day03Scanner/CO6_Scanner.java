package day03Scanner;

import java.util.Scanner;

public class CO6_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Bir Karakter Giriniz");
        char ch=input.next().charAt(0);
        System.out.println("       "+ch+"  ");
        System.out.println("     "+ch+"   "+ch);
        System.out.println("    "+ch+"  "+ch+"  "+ch+"  ");
    }
}
