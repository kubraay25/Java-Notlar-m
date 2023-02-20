package day08nestefifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //turnery if else ayni isi yapar fakat soz dizimi farkli.
        //turnery if else gore daha kisadir.
        //turnery de sarti yazdiktanson
        //iki sayi aliniz buyuk olmayani yazdiriniz/

        Scanner input=new Scanner(System.in);
        System.out.println("Iki sayi Giriniz");
        double a=input.nextDouble();
        double b=input.nextDouble();
     //                    operator       conditional      ?      dogruysa       :       yanlissa    ;
        Double result           =          a<b             ?          a          :          b        ;

        System.out.println(result);




    }//main
}
