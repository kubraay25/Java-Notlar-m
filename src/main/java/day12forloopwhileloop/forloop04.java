package day12forloopwhileloop;

import java.util.Scanner;

public class forloop04 {
    public static void main(String[] args) {
        //baslangic degeri ve bitis degeri giriniz aradaki cift sayilari yaziniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz");
        int start=input.nextInt();
        System.out.println("Bitis degeri giriniz");
        int finish=input.nextInt();
        if (start>finish){
            System.out.println("Baslangic Degeri Bitis Dgerinden Buyuk Olamaz");
        }
        else {for (int i =start; i <=finish; i++) {if (i%2==0){
            System.out.print(i+" ");
        }
        }
            //eger baslangic degeri bitis degerinden buyuk olursa bu loop calismadan kirilir.
            //Nasil engelleriz bunu
        }
    }
}
