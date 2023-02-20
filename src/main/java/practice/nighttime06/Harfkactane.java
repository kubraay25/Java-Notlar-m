package practice.nighttime06;

import java.util.Arrays;
import java.util.Scanner;

public class Harfkactane {
    public static void main(String[] args) {
        //kullanicidan string al hr karakterden ne kadar varsa yazdir.
        Scanner input=new Scanner(System.in);
        System.out.println("Bir String Giriniz");
        String str=input.nextLine();
        String arr[]=str.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
         int counter=0;
        for (int i =1; i <arr.length; i++) {
            if (arr[i-1].equals(arr[i])){//sort yaptik ayni lanlar yan yanadir zaten.
                counter++;//Ayni olanlar icin bir artir.
            }else {
                System.out.println(arr[i-1]+ " karakterinin sayisi "+ (counter+1)+" kez kullanilmistir.");
                counter=0;
            }
      if (i==arr.length-1){
          System.out.println(arr[i]+ " karakterinin sayisi "+ (counter+1)+" kez kullanilmistir.");
          //Son datayi neyle kiyaslayacagim.Bu onun icin.
      }
        }//for







    }//main
}
