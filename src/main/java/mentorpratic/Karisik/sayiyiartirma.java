package mentorpratic.Karisik;

import java.util.Scanner;

public class sayiyiartirma {
    public static void main(String[] args) {
        /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20

        bir int oluştur, int 100'den küçükken yap, sayıyı 5 artır, örneğin: 0 5 10 15 20
     */
        Scanner input=new Scanner(System.in);
        int num=0;
      do {
          System.out.println("Bir sayi giriniz");
          num= input.nextInt();
             {for (int i = num; i <96; i+=5) {
                 num+=5;
                 System.out.print(num+" ");
             }
            }

      }while(num<96);{
            System.out.println("Yapilacak islem yok");
        }


    }///main
}
