package practice.nighttime02;

import java.util.Scanner;

public class C01_Scanner {
    /*TechProEd spor salonu icin kayit yapiyoruz.Isim,Soyisim,yas,kilo,boy,devam suresini alip
    aylik 20$ alip toplam ucreti yazdiriniz.
     */
    public static void main(String[] args) {


        System.out.println("TechProEd Spor Salonuna Hosgeldiniz");
        Scanner input=new Scanner(System.in);
        System.out.println("Adinizi Soyadinizi Giriniz");
        String adSoyad=input.nextLine();

        System.out.println("Yasinizi Giriniz");
        Byte yas=input.nextByte();

        System.out.println("Kilonuzu  Giriniz");
        int kilo=input.nextInt();


        System.out.println("Boyunuzu Giriniz");
        double boy=input.nextDouble();

        System.out.println("Aylik ucret=20%");
        System.out.println("Kac aylik uye olacaksiniz");
        byte uyelik=input.nextByte();

        int aylikUcret=20;
        int toplamtutar=aylikUcret*uyelik;
        System.out.println("AdSoyad="+adSoyad+"\nYas+"+yas+"\nKilo="+kilo+"\nBoy="+boy+"\nSure="+uyelik+"\nTutar="+toplamtutar+"$");

    }
}
