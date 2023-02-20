package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //Kullanici ile beraber array olusturun.
        Scanner input=new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numOfElemants=input.nextInt();
        System.out.println("Girisi sonlandirmak icin Q `ye basin");
       String stdnames[]=new String[numOfElemants];
        for (int i =1;i<=numOfElemants ; i++) {
            System.out.println("lutfen "+i+". ogrencinin adini giriniz");
            String stdname=input.next();
           if (stdname.equalsIgnoreCase("Q")){
               break;
           }
            stdnames[i-1]=stdname;//nicin i-1 cunku 0.indekse gitmeliyiz.
        }
        System.out.println(Arrays.toString(stdnames));
    }
}
