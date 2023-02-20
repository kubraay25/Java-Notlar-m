package day07IfStatement;

import java.util.Scanner;

public class isstatement06 {
    public static void main(String[] args) {
        //Kullanicidan yas degeri al 0=4 bebek 5-12 cocuk 13-20 genec 21-30-yetiskin ve tanimlanmamis evre
    Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Bir Yas Giriniz");
        byte yas=input.nextByte();
        if(yas<0){System.out.println("Gecerli Bir yas Giriniz");}
        else if(yas<4){System.out.println("Bebek");}
        else if(yas<13){System.out.println("Cocuk");}
        else if(yas<21){System.out.println("Genc");}
        else if(yas<31){System.out.println("yetiskin");}
        else{System.out.println("Tanimlanmamis Aralik");}
    }//main
}//class
