package practice.nigthttime04;

import java.util.Scanner;

public class C02_ifstatement {
    public static void main(String[] args) {
        //iki sayiyi kullanicidan sectireceginiz dort islemden biriyle isleme koy
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen 2 tam sayi girisi yapiniz");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("carpim icin 1 bolme icin 2 top icin 3 cikarma icin 4 yaziniz");
        int islem=input.nextInt();
        if (islem==1){
            System.out.println(a*b);

            } else if (islem==2) {
            System.out.println(a/b);
        } else if (islem==3) {
            System.out.println(a+b);

        } else if (islem==4) {
            System.out.println(-b);

        }else {
            System.out.println("tekrar giris yapiniz");
        }


    }//main
}
