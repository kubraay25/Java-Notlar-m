package day03Scanner;

import java.util.Scanner;

public class CO10_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sırasıyla Adınızı Sayadınızı Boyunuzu ve Kilonuzu Yazınız");
        String adSoyad=input.nextLine();
        Float boy=input.nextFloat();
        int kilo=input.nextInt();
        System.out.println("Sayın   "+adSoyad  +"    Boy Kilo Endeksiniz="+(kilo/(boy*boy)));
    }
}
