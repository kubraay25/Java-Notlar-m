package day07IfStatement;

import java.util.Scanner;

public class ifstatement02 {
    public static void main(String[] args) {
        //Kullanicidan alinan sayinin tek mi cift mi oldugunu yazdir
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int sayi=input.nextInt();
        if(sayi%2==0){System.out.println("Cift Sayi");}//if
        else {System.out.println("Tek Sayi");}//else

    }//main
}//class
