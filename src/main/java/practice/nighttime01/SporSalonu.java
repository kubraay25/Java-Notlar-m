package practice.nighttime01;

import java.util.Scanner;

public class SporSalonu {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Adınız Soyadınız=");
        String nameSurName = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Yaşınız=");
        Integer age = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Kilonuz=");
        Integer weight = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.println("Boyunuz=");
        Float heigt = input4.nextFloat();

        Scanner input5 = new Scanner(System.in);
        System.out.println("Kaç Ay Kalacaksınız=");
        Integer mounth = input5.nextInt();

        System.out.println("Adınız Soyadınız=" + nameSurName);
        System.out.println("Yaşınız=" + age);
        System.out.println("Kilonuz=" + weight);
        System.out.println("Boyunuz=" + heigt);
        System.out.println("Toplam Ücretiniz=" + mounth * 20 + "TL");


    }


}
