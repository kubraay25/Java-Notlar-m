package day18list;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {
       //7 haric tum degerlerini 3 artiriniz.
      //1.yol
        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(7);
        nums.add(12);
        nums.add(35);
        for (int w:nums){
            if (w==7){
               continue;//devamindaki kodlari calistirmadan birsey yapmadan diger elemana gecer..
            }
        nums.set(nums.indexOf(w),w+3 );
        }
        System.out.println(nums);//set ile yeni deger atadk.

 //Iki 12 var once ilk 12 nin indeksini alir 15 yapar.Sonra diger 12 yi gorudunde ilk 12 15 olmustur.Sikinti olmaz.
 //Fakat degisen bir elemanla degismeyen ayni olursa ilk indexi verecegi icin siknti olur/
 //Bi risk oldugu icin index kullanacaksak arraylerde bile foreachloop kullanmamaliyiz.

    //2.yol

        for (int i = 0; i <nums.size() ; i++) {
            if (nums.get(i)==7){
                continue;
            }
            nums.set(i,nums.get(i)+3);
        }
        System.out.println(nums);




    }//main
}
