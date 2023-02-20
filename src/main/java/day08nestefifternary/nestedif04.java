package day08nestefifternary;

import java.util.Scanner;

public class nestedif04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        String gender= input.next();
        System.out.println("Yasinizi Girniz");
        byte age=input.nextByte();
        if (gender.equalsIgnoreCase("kadin")){
            if (age>60){
                System.out.println("Emekli Olabilir");
            }else {
                System.out.println("Calismali");
            }

        }else if (gender.equalsIgnoreCase("erkek")){if (age>65){
            System.out.println("Emekli Olablir");
        }else {
            System.out.println("Kesinlikle Calimali");
        }
        }//auto
        else {
            System.out.println("Tanimlanmadi");
        }





    }//main
}
