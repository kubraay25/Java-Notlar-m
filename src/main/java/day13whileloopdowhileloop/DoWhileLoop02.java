package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        //Kullanicidan alinan tamsayi 100 den kucuk ise kullaniciya kaybettiniz mesaji vererek oyunu sonlandir.
        //Sayi 100 ve daha buyuk ise kazandiniz veriniz.
        Scanner input=new Scanner(System.in);
        //NOT.Olusturulan variable olusturuldugu suslu parantez disinda kullanilmaz.(SCOPE?Kapsam)
        //Kullanmak istiyorsak yeniden olustururuz.
       //Mesela bunu do icinde yapsaydik while icinde okunmazdi.
       int a=0;
        do {
            System.out.println("Lutfen Bir Sayi Giriniz");
             a=input.nextInt();
            if (a>=100){
                System.out.println("Kazandiniz");
            }
        }while (a>=100);
        System.out.println("Kaybettiniz");
    }
}
