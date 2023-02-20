package day17arrayLists;

import java.util.Arrays;

public class bos {
    public static void main(String[] args) {
        String str = "Kemal Can Kuzu   ";
        String arr[]=str.split(" ");
        System.out.println(Arrays.deepToString(arr));
        String tersstring="";
        for (int i = arr.length-1; i >=0 ; i--) {
           tersstring+=arr[i]+" ";
            
        }
        System.out.println(tersstring);
        System.out.println(tersstring.trim());//Kuzu arraydan alirken bozluktan sonra aldigi icin onunde boluk yoktu.

    }

}
