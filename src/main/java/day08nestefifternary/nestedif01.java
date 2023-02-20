package day08nestefifternary;

import java.util.Scanner;

public class nestedif01 {
    public static void main(String[] args) {
     //nestedif icice gecmis ifler demek.Bir if baska bir ifin icine girer
     //icerdeki if e inner if disaridakine auter if denir.
     //kullanicidan uc sayi al ucgen mi bak eger ucgense eskenar mi diye bak.Once ucgen mi incelenecek
     //ucgen olma sarti:iki kenar toplami 3.den buyuk bir ikenar 2kenar farkindan kucuk olmali
     //Java nested if calistirirken cok zamana ihtiyac duyar.
     //Bunun icin nested if son terch olmalidir.
     //Iyi kod kisa koddurOnce nestedsiz dusun.Olmuyorsa nested.
     Scanner input=new Scanner(System.in);
        System.out.println("Uctane kenar uzunlugu giriniz");
        double a=Math.abs(input.nextDouble());
        double b=Math.abs(input.nextDouble());
        double c=Math.abs(input.nextDouble());
       if ((a+b>c && c>Math.abs(a-b)) && a+c>b && c>Math.abs(a-c) && b+c>a && a>Math.abs(b-c))
       {if (a==b && a==c && b==c){System.out.println("Ucgen ve eskenar ucgen");}
       else {System.out.println("ucgen ama eskenar degil");}
       }//Auter if
       else{System.out.println("ucgen degilsin");}





    }//main
}//class
