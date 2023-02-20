package day10Switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Ulke ismini Giriniz");
        String country=input.next().toLowerCase();
        switch (country){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "franca":
                System.out.println("FR");
                break;
            default:
                System.out.println("Tanimlanmamis Alan");


        }//switch
    }
}
