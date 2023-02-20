package ssgkonular.Scannernestedloop;

import java.util.Scanner;

public class scanner01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Verilen Sayi Tek mi Cif mi Bulunuz?
        System.out.println("Lutfen Tam Sayi Giriniz");
        int sayi=input.nextInt();
        if (sayi%2==0){
            System.out.println(sayi+"=" +"Cift Sayi");
        } else if (sayi%2!=0) {
            System.out.println(sayi+"=" +"Tek Sayi");

        }else {
            System.out.println(sayi+ "="+"Gecersiz Ifade");
        }

    }
}
