package day07IfStatement;

import java.util.Scanner;

public class sil {

    public static void main(String[] args) {


            Scanner input=new Scanner(System.in);
            System.out.println("Lutfen Kilonuzu ve Boyunuzu Giriniz");
            double weight=input.nextDouble();
            double height=input.nextDouble();
            double bodymassindex=weight/(height*height);
        System.out.println(bodymassindex);
            if (bodymassindex<18.5) {
                System.err.println("weak");
            } else if(bodymassindex<25){
                System.err.println("ideal");
            }else if(bodymassindex<30){
                System.err.println("fat");
            }else if(bodymassindex>30){
                System.err.println("obese");
            }



    }





    }

