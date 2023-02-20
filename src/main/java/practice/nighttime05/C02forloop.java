package practice.nighttime05;

import java.util.Scanner;

public class C02forloop {
    public static void main(String[] args) {
        //"" ve a harfi haric tum harfleri alt alta yaz.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Bir Metin Giriniz");
        String str=input.nextLine();
        for (int i =0; i <str.length() ; i++) {
           if (str.charAt(i)=='a' || str.charAt(i)==' '){
               continue;//es gec demek.
            }
            System.out.println(str.charAt(i));
        }//for
    }//main
}
