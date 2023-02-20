package ssgkonular.List;

import java.util.ArrayList;
import java.util.List;

public class listt2 {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        System.out.println(sayilar);//[1, 3, 5, 3, 5, 6, 1, 7]
        System.out.println(tekrarsizlist(sayilar));//[1, 3, 5, 6, 7]


    }//main
    public static List<Integer>tekrarsizlist(List<Integer>sayilar){
        List<Integer> tekrarsizlist = new ArrayList<>();
        for (int w:sayilar){
            if (!tekrarsizlist.contains(w)){
                tekrarsizlist.add(w);
            }
        }
        return tekrarsizlist;
    }


}
