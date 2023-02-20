package ssgkonular.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list3 {
    public static void main(String[] args) {
        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir list  olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,3,2,3};
        System.out.println(istenmeyenisil(3, arr));//[4, 2, 5, 7, 8, 2]
        int []t=new int[3];
        t[2]=5 ;


    }//main
public static List<Integer> istenmeyenisil(int x,int[]arr){
    List<Integer> yenilist=new ArrayList<>();

    for (int w:arr){
        if (x!=w){
            yenilist.add(w);
        }
    }
        return yenilist;


    }


}//class
