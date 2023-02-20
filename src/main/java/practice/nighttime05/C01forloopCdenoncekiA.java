package practice.nighttime05;

import java.util.Scanner;

public class C01forloopCdenoncekiA {
    public static void main(String[] args) {
      //Ilk c den once kac a var yazdiriniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin yaziniz");
        String str= input.nextLine();
       int counter=0;
       if (str.contains("a")&& str.contains("c")){
           for (int i = 0; i <str.indexOf("c") ; i++) {
           if (str.charAt(i)=='a'){
               counter++;
           }

       }System.out.println("c`den onceki a`larin sayisi="+counter);

       }else {
           System.out.println("Lutfen a ve c harfi iceren metin giriniz.");
       }

    }//Main
}//Class


