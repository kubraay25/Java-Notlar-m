package ssgkonular.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list4 {
    public static void main(String[] args) {
        //verilen bir array'i listeye cevirin
        String arr[] = {"A", "B", "C"};
        List<String> yenilist = new ArrayList<>();
        for (String w : arr) {
            yenilist.add(w);
        }
        System.out.println(yenilist);//[A, B, C]

        //2 yol
        List<String> arraydenList = Arrays.asList(arr);

        System.out.println(arraydenList);//[A, B, C]

        List<String> arraydenList2 = new ArrayList<> (List.of(arr));
        System.out.println(arraydenList2);//[A, B, C]
    }//main

}