package day08nestefifternary;

import java.util.Scanner;

public class nestedif03 {
    public static void main(String[] args) {
        //Password al ilk harfi buyuk harf ise 'A' oldugunda gecerli ilk harf kucuk harf ise 'z' oldugunda gecerli

        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String pwd=input.nextLine();
        char firstChar=pwd.charAt(0);
        if (firstChar>='A' && firstChar<='Z') {
            if (firstChar=='A'){
                System.out.println("Gecerli Password");
            }else{System.out.println("Gecersiz Password");
            }
        }//autor if
        else if (firstChar>='a' && firstChar<='z') {
            if (firstChar=='z'){
                System.out.println("Gecerli Password");
            }
            else{
                System.out.println("Gecersiz Pasword");
            }

        }


    }//main
}//class
