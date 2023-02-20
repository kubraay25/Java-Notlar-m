package day07IfStatement;

import java.util.Scanner;

public class ifstatement04 {
    public static void main(String[] args) {
        //Gun sayisini verdiginizde gun smini versin
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Kacinci Gunde Oldugumuzu Giriniz");
        byte dayno=input.nextByte();
        if(dayno==1){System.out.println("sunday");}
        else if (dayno==2) {System.out.println("Monday");}
        else if (dayno==3) {System.out.println("Tuesday");}
        else if (dayno==4) {System.out.println("Wednesday");}
        else if (dayno==5) {System.out.println("Thursday");}
        else if (dayno==6) {System.out.println("Friday");}
        else if (dayno==7) {System.out.println("Saturdaysday");}
        else{System.out.println("Lutfen 1 ile 7 Arasinda Bir Sayi Giriniz");}
    }//main
}//class
//Boundry Value Analysis(BVE) sinir deger analizi+ Yukaridaki ornekte 0-7 ve alt ve ust degeri test et.