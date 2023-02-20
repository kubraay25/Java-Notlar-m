package day12forloopwhileloop;

import java.util.Scanner;

public class forloop01 {
    public static void main(String[] args) {
        /*     x x x x x
               x x x x x
               x x x x x
                seklini yansitin*/
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Row");
        int row=input.nextInt();
        System.out.println("Please Enter Column");
        int column=input.nextInt();
        System.out.println("Your Output=");//For icine yazsaydik her seriden once yazardi.
        for (int i = 1; i <=row; i++) {//row(satir)
            for (int j = 1; j <=column; j++) {//columnn(sutun)
                System.out.print("x ");//ln olsa alta yazardi. Bosluk olmasa bitisik yazardi.

            }
            System.out.println();//inner for dongusu bittiginde alt atar.Her Auter dongusunde calisir

        }
    }
}
