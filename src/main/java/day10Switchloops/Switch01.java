package day10Switchloops;

import java.util.Scanner;

public class Switch01 {
    //switch de string, int, short, ve char, kullanilabilir.
    //Long,boolean,float,double switch de kullanilmaz.
    // durumdan fazla icin switch kullanilir.Ohalde boolean kullnilmaz.
    //switch long kadar fazla veriyi almasi mantiksiz.
    //Switch ondalik sayilari da kullanmaz.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz");
        int numOfMonth=input.nextInt();

        switch (numOfMonth){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("february");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("Jun");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
                break;//Break nereye koyarsan orada durur.5 yazarsan 8 e kadar gelir.
            //Break demek switchin disina cik demek.
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
            break;
            default:
                System.out.println("Lutfen gecerli bir ay giriniz");

        }






    }//main
}
