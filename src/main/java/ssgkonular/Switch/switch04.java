package ssgkonular.Switch;

import java.util.Scanner;

public class switch04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir ingilizce harfi yaziniz");
        char ch=input.next().toLowerCase().charAt(0);
        switch (ch){
        case 'A':
        case 'E':
        case 'O':
        case 'U':
        case 'I':
            System.out.println("UNLU HARF");
            break;
        default:
            System.out.println("Unsuz Harf");

    }










    }







}
