package mentorpratic.Karisik;

import java.util.Scanner;

public class sayitopla {
    public static void main(String[] args) {
       //Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.341 olmali

       int sayi=341,top;

       top=(sayi%10)+((sayi/10)%10)+((sayi/100)%10);
        System.out.println("top = " + top);


    int num=333355784,sum=0;
        for (int i =num; i>0 ; i/=10) {
            sum+=num%10;

        }
    }
}
