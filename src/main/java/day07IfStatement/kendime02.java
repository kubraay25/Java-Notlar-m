package day07IfStatement;

import java.util.Scanner;

public class kendime02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz");
        int yas=input.nextInt();

       if(yas<0){
            System.out.println("Lutfen Gecerli Bir Yas Giriniz");
        } else if (yas>0 && yas<5) {System.out.println("Bebek");}
       else if (yas>4 && yas<15) {System.out.println("Cocuk");}
       else if (yas>14 && yas<21) {System.out.println("Ergen");}
       else if (yas>20 && yas<41) {System.out.println("Genc");}
       else if (yas>40 && yas<61) {System.out.println("Ortayasli");}
       else if (yas>60) {
           System.out.println("yasli");}
       Scanner input2=new Scanner(System.in);
        System.out.println("Lutfen Gun Giriniz");
        String gun=input2.nextLine();
        if (gun.equalsIgnoreCase("Pazar")|| gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Haftasonu");
        } else {
            System.out.println("Haftaici");

        }
    }
    }


