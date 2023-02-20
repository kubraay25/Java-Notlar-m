package day03Scanner;

import java.util.Scanner;

public class CO2_Scanner {
    //Sacnner kullanıcı ile iletişime geçmemizi sağlar.
    //Scanner bir classtır.Java util kütüphanesinden getirildiği için import ister.
    public static void main(String[] args) {
        //Kullanıcıdan data almak için
        //1.Adım=>Scanner Classından obje oluşturun.
        Scanner input=new Scanner(System.in);
        //İnput yerine scan da yazabilirsiniz.Farklı isimler de yazılabilir.Ama bunlar tercih edilir.
        //2.Adım=>Kullanıcıya ne yapacağını söyle
        System.out.println("Lütfen Yaşınızı Giriniz");
        //3.Adım=>Kullanıcıdan aldığınız datayı variable içine koyun
        byte age=input.nextByte();
        //Örnek:Kullanıcıya ad, memleket, boyunu soran program yazınız.
        Scanner input1=new Scanner(System.in);
        System.out.println("Adınızı giriniz");
        String ad=input1.nextLine();
        Scanner input2=new Scanner(System.in);
        System.out.println("Memleketinizi Giriniz");
        String memleket=input2.next();
        Scanner input3=new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz");
        Float boy=input3.nextFloat();
        Scanner input4=new Scanner(System.in);
        System.out.println("Yaşadığınız yeri seviyor musunuz");
        System.out.println("memleket = " + memleket);
        String True_False=input4.next();

    }
}
