package day07IfStatement;

import java.util.Scanner;

public class ifstatement03 {
    public static void main(String[] args) {
        //Verilen sayinin pozitif mi negatif mi oldugunu yaziniz
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int sayi=input.nextInt();
        if(sayi>0){System.out.println("Pozitif Sayi");}
        else if (sayi<0) {System.out.println("Negatif Tam sayi");}
        else {System.out.println("Notr");}
    }//Main
}//Class
