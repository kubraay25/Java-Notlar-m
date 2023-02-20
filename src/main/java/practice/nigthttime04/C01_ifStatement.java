package practice.nigthttime04;

import java.util.Scanner;

public class C01_ifStatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Gun Ismi Giriniz");
        String gun=input.next().toUpperCase();
        if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin Kutsal Gun");    
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Yahudiler icin Kutsal Gun");}
        else if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");

        }else {
            System.out.println("Kutsal Gun degil");
        }




    }//main
}
