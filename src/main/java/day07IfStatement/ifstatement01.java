package day07IfStatement;

import java.util.Scanner;

public class ifstatement01 {
    public static void main(String[] args) {
        //Killanicidan alinan karakter buyukse ekrana buyuk yazdir.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Bir Karakter Giriniz");
        char harf=input.next().charAt(0);
                         //1.YOL
        if(harf>='A'&& harf<='Z'){
            System.out.println("Sayiniz Buyuk Harftir");
        }//If
        if(harf>='a'&& harf<='z') {
            System.out.println("Kucuk Harf");
        }//IF
                            //2.YOL

        if(harf>='A'&& harf<='Z'){
            System.out.println("Sayiniz Buyuk Harftir");}//if
        else if (harf>='a'&& harf<='z'){
            System.out.println("Kucuk Harf");
        }//else if
        else {System.out.println("Harf Degil");}//else
    }//Main
}//class
