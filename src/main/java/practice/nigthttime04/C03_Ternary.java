package practice.nigthttime04;

import java.util.Scanner;

public class C03_Ternary {
    //sifirdan buyuk pozitif tam sayi iste pozitif tamsayi 3 basamakli ise 3 basamakli 3 masabakli degilse
    //cift mi degil mi bak cift ise 3 basamakli cift sayi yazdir degilse 3 bsamakli olmayan tek sayi yazdir.
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi=input.nextInt();
        if (sayi>0) {
            boolean ucbas = sayi > 99 && sayi < 1000;
            boolean ucbasdegilcift = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;
         if (ucbas){
             System.out.println("3basamakli sayi");
         } else if (ucbasdegilcift) {
             System.out.println("uc basamakli degil ama cift sayi");

         }else {
             System.out.println("3 basamakli degil ama tek sayi");
         }

        }//aut
        else {
            System.out.println("Pozitif sayi degil");
        }
                //2.yol
        boolean ucbaster = sayi > 99 && sayi < 1000;
        boolean ucbasdegilciftter = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;

       String sonuc= sayi>0 && ucbaster ? ("Uc basamakli sayi"):ucbasdegilciftter ?("3 basamakli olmayan cift sayi"):("3 basamakli olmayan teksayi");
        System.out.println(sonuc);
    }//main
}//class
