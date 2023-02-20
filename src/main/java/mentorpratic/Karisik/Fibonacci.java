package mentorpratic.Karisik;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Please Enter A NUMBER");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int a=1;                             /////0 1  1   2  3 5 7 12 19
                                                //  a  b   c
        int b=1;                                //     a   b   c
                                                //         a   b  c
        int c;
        System.out.print("0"+" "+a +" "+b);
        for(int i=1;i<number;i++){              //0 1 1 2 3 5 8
            c=a+b;
            a=b;//1 2 3 5
            b=c;//2 3 5 8
            System.out.print(" "+c+" ");
        }

    }
}
