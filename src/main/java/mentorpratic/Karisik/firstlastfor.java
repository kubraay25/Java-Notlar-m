package mentorpratic.Karisik;

import java.util.Scanner;

public class firstlastfor {
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER AN EXPRESSION");
        Scanner input=new Scanner(System.in);
        String expression=input.nextLine().toLowerCase();
        System.out.println("PLEASE ENTER NUMBER OF REPEATS");
        int repeat=input.nextInt();

        char ch=expression.charAt(0);
        char chson=expression.charAt(expression.length()-1);
        for (int i=1;i<=repeat ;i++){
            System.out.println(""+ch+chson);
        }


    }
}
