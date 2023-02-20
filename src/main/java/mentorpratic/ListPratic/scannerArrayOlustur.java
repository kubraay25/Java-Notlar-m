package mentorpratic.ListPratic;

import java.util.Arrays;
import java.util.Scanner;

public class scannerArrayOlustur {
    public static void main(String[] args) {
       // Soru 4:Kullaniciya kac elementlik bir array olusturacagini sorun
        //arrayi olusturup elementlei kullanicidan alip array atayin
        Scanner input=new Scanner(System.in);
        System.out.println("Arrayiniz Kac Elemanli Olacak");
        int elemansayisi=input.nextInt();
        int []arr=new int[elemansayisi];
        for (int i= 0; i<elemansayisi ; i++) {
            System.out.println((i+1)+". Elemani Giriniz");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));


    }
}
