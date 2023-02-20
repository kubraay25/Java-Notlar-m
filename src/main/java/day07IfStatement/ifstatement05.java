package day07IfStatement;

import java.util.Scanner;

public class ifstatement05 {
    public static void main(String[] args) {
        //Ayin isimleri girilince kacinci ay oldugunu yazin
        Scanner input=new Scanner(System.in);
        System.out.println();
        String ay=input.next();
        if (ay.equalsIgnoreCase("ocak")){System.out.println("1.");}
        if (ay.equalsIgnoreCase("Subat")){System.out.println("2.");}
        if (ay.equalsIgnoreCase("Mart")){System.out.println("3.");}
        if (ay.equalsIgnoreCase("Nisan")){System.out.println("4.");}
        if (ay.equalsIgnoreCase("Mayis")){System.out.println("5.");}
        if (ay.equalsIgnoreCase("Haziran")){System.out.println("6.");}
        if (ay.equalsIgnoreCase("Temmuz")){System.out.println("7.");}
        if (ay.equalsIgnoreCase("Agustos")){System.out.println("8.");}
        if (ay.equalsIgnoreCase("Eylul")){System.out.println("9.");}
        if (ay.equalsIgnoreCase("Ekim")){System.out.println("10.");}
        if (ay.equalsIgnoreCase("Kasim")){System.out.println("11.");}
        if (ay.equalsIgnoreCase("Aralik")){System.out.println("12.");}
        else{System.out.println("Lutfen Tekrar Deneyiniz");}
        //Stringleri equals ile esitleriz.Harf kuuklugune duyarsiz kalmasi icin equalsignoreCase
    }//main
}//class
