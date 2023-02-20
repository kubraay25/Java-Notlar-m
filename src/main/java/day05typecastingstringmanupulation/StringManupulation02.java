package day05typecastingstringmanupulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManupulation02 {
    public static void main(String[] args) {
        /*Example1:Aşağıdaki kurallara göre kullanıcının girdiği passwordü konrol ediniz.
        Kurallar.
        1-En az 8 karakter olsun
        2-Space olmasın
        3-En az 1 tane büyük harf olsun
        4-En az 1 tane küçük harf olsun
        5-En az 1 tane sembol olsun
        6-En az 1 tane rakam olsun
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Password Giriniz");
        String pwd=input.nextLine();
        boolean first=pwd.length()>7;
        boolean second=!pwd.contains(" ");//baştaki ! işareti mesin olumsuz anlama gelir.Yani boşluk içermesin.
        // Büyük harf olmayanları sil kalanın karakterine bak.
        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;//Büyük harf haricini sil geriye kalanı say.
        boolean forth=pwd.replaceAll("[^a-z]","").length()>0;//Küçük harf haricini sil geriye kalanı say.
        boolean fifth=pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        boolean sixth=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("Password Geçerli mi="+(first && second && third && forth && fifth && sixth));


    }
}
