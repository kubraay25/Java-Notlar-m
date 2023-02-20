package mentorpratic.ListPratic;

import java.util.List;
import java.util.Scanner;

public class KelimeSayisiBul {
    public static void main(String[] args) {
       // Soru 5:Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Cumle Giriniz");
        String cumle=input.nextLine();
        String [] arr=cumle.split(" ");
       int sayac=0;
        for (String w:arr){
            sayac++;

        }
        System.out.println("Kelime Sayisi = "+sayac);





    }
}
