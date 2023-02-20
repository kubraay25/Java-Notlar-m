package day08nestefifternary;

import java.util.Scanner;

public class nestedif02 {
    public static void main(String[] args) {
   //Ucgen uzunlugunu alip eskenar ikizkenar cesitknar yazdirin.
   Scanner input=new Scanner(System.in);
        System.out.println("Uc adet uzunluk giriniz");
        double a=Math.abs(input.nextDouble());
        double b=Math.abs(input.nextDouble());
        double c=Math.abs(input.nextDouble());
        boolean ucgenmi=(a+b>c && c>Math.abs(a-b)) && (a+c>b && c>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));
        if(ucgenmi){if (a==b && b==c && a==c){System.out.println("Eskenar");}
        else if (a==b || b==c || a==c) {System.out.println("Ikizkenar");}
        else {System.out.println("Cesitkenar");}}//auter if
        else {System.out.println("Degil");}


    }//Main
}//Class
