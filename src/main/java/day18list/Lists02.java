package day18list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);
   //Birbirine en yakin iki elemani yazdir.
//Math.min metodu iki degeri kiyaslayip kuxugunu alirdi.
        Collections.sort(nums);

        int mindifference= nums.get(1)-nums.get(0);//0 deseydik hep 0 olurdu.List icinden bir deger alip kiyaslamaliyiz.

        for (int i =1; i<nums.size(); i++) {
            mindifference=Math.min(mindifference, nums.get(i)- nums.get(i-1));

        }

        for (int i =1; i<nums.size() ; i++) {
            if(nums.get(i)-nums.get(i-1)==mindifference){
                System.out.println(nums.get(i-1)+" and "+ nums.get(i));
            }
        }

    }//Main
}
