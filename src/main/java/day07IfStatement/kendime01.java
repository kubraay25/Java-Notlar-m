package day07IfStatement;

import java.util.Scanner;

public class kendime01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=input.nextInt();
        if (sayi%2==0){
            System.out.println("Cift Sayi");} else{
            System.out.println("Tek Sayi");
        }
        //Verilen sayi 300den kucukse yada 1200den buyukse harika sayi yazdirin.
         Scanner input2=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi2=input2.nextInt();
        if (sayi2<300 || sayi2>1200){
            System.out.println("Harika Sayi");

        }//IF
        else {
            System.out.println("Harika Sayi Degil");

        }//else
          // Iki tane string datanin birbirine esitligini == ile degil equals() ile yapariz.
          //equals()==>buyuk kucuk harf onemser.Ancak equalsIgnoreCase() buyuk kucuk harfi ayni kanbiul eder.
          //Kullanicidan alinan gun isminin haftaicimi haftasonumu oldugunu yaxdiriniz.
        }//main
    }//class
