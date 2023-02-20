package mentorpratic.ListPratic;

import java.util.Arrays;

public class arraydeElementSilMethod {
    //Verilen bir Arrayden istenen elemeneti silip kalanlari yeni bir array olarak yazdiran yeni bir method olusturun

    public static void elementsil(int silenecekEleman, int[] a) {

        int silineceksayi = 0;
        for (int i : a) {
            if (i == silenecekEleman) {
                silineceksayi++;
            }
        }
        int[] yeniarr = new int[a.length - silineceksayi];

        int idex = 0;
        for (int w : a) {
            if (w != silenecekEleman) {
                yeniarr[idex] = w;
                idex++;
            }
        }
        System.out.println(Arrays.toString(yeniarr));

    }

    public static void main(String[] args) {
        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        elementsil(4,arr);
    }
}