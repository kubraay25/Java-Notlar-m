package day10Switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");
        double a=input.nextDouble();
        double b=input.nextDouble();
        System.out.println("Lutfen carpim icin * bolme icin / toplam icin + cikarma icin - Giriniz");
        char islem=input.next().charAt(0);//Neden char cunku tek karakter.
        switch (islem){//Double switch icine koymadim.Switc ici double almaz.
            case '*':
                System.out.println(a +"*" + b +"="+ (a*b));//Sembolu nicin '' degil de"" yaptik.
                                                           //Cunku '' ascii degeri yapar.
                                                           //""Concat yapar.
                break;
            case '+':
                System.out.println(a +"+" + b +"="+ (a+b));
                break;
            case '/':
                System.out.println(a +"/" + b +"="+ (a/b));
                break;
            case '-':
                System.out.println(a +"-" + b +"="+ (a-b));
                break;
            case '%':
                System.out.println(a +"%" + b +"="+ (a%b));
                break;
            default:
                System.out.println("Gecerli degerler giriniz");

        }//switch

    }
}
