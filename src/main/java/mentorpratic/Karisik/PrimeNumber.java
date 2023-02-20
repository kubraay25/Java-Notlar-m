package mentorpratic.Karisik;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER A POSITIVE NUMBER");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int sum=0;

        if (number<1){
            System.out.println(number+"\tIS NOT VALID NUMBER");
        }
        else if (number==1) {
            System.out.println("NON PRIME NUMBER");
        }
        else {
            for(int i = 2; i<number; i++){
        if (number%i==0)
        { sum++;}
        }//for
            if(sum==0){
            System.out.println("PRIME NUMBER ");
        } else {
            System.out.println("NON PRIME NUMBER");
        }
        }

    }//main
}
