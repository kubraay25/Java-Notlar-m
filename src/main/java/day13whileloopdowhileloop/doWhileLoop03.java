package day13whileloopdowhileloop;

import java.util.Scanner;

public class doWhileLoop03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int counter=0;



        do {if (counter==4) {
            System.out.println("Hesabiniz bLoke Olmustur");
            break;
        }
            System.out.println("Username Giriniz");
            String userName =input.next();

            System.out.println("Passwordu Giriniz");
            String password =input.next();

         if (userName.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniza Hosgeldiniz");
                break;
            }
            counter++;

        } while (true);//While icine true yazarsan sonsuz loop olur.O zaman icerde break koymak lazim
                       //Icerde kirma yaptigimiz icin sarta da gerek kalmiyor.


    }//Main
}
