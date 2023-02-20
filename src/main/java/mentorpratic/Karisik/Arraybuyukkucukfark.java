package mentorpratic.Karisik;

import java.util.Arrays;
import java.util.Scanner;

public class Arraybuyukkucukfark {
    public static void main(String[] args) {
        /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Arrayin eleman sayisini giriniz");
        int a=input.nextInt();
        int arr[]=new int[a];

        for (int i =1; i<=a ; i++) {
            System.out.println(i+". rakami giriniz");
           int eleman= input.nextInt();
           arr[i-1]=eleman;

        }
        System.out.println(Arrays.toString(arr));

     Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]+arr[arr.length-1]);
    }//main
}
