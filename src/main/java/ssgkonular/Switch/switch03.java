package ssgkonular.Switch;

import java.util.Scanner;

public class switch03 {
    public static void main(String[] args) {
// Ayakkabi Boyutu kontrol etmek için Java Programı
// switch...case ifadesini kullanarak
//Boyyutu icin size ler: small -Medium- Large- Extra -Large-unKnow
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ayakkabi numaranizi giriniz");
        int no=input.nextInt();
        switch (no){
            case 36:
            case 37:
            case 38:

                System.out.println("small");
                break;
            case 40:
            case 41:
            case 42:
                System.out.println("medium");
                break;
            case 43:
            case 44:
            case 45:
            case 46:
                System.out.println("large");
                break;
            case 47:
            case 48:
            case 49:
            case 50:
                System.out.println("eksta large");
                break;
            default:
                System.out.println("gecersiz");
        }







    }//main
}
