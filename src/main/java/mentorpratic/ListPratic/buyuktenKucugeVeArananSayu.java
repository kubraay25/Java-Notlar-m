package mentorpratic.ListPratic;

import java.util.Arrays;

public class buyuktenKucugeVeArananSayu {
    public static void main(String[] args) {
        // Verilen bir array i buyukten kucuge siralayip yazdiran bir method olusturun
        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

sirala(arr);

        //bir elelmentin var olup olamdıgını true false olarak yazdirarak gosteren bir method olusturun
        System.out.println();
    varmi(7,arr);



    }//main

        public static void sirala ( int[] a){
            Arrays.sort(a);
            for (int i = a.length - 1; i >= 0; i--) {
                System.out.print(a[i]+" ");

            }
        }
public static boolean varmi(int aranansayi,int[] a){
    boolean sonuc=false;
        for (int w:a){
            if (aranansayi==w){
                sonuc=true;
                break;
            }

    }System.out.println(sonuc);

return true;
    }



}
