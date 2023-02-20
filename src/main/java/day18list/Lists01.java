package day18list;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
//EXP.Liste 5 eleman ele sonra bu elemanlardan 12 yi sil
        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);
        // ages.remove(12);//Index 12 sinir disi diyor.
        //java yazilan tamsayi degerini otomatik olarak primitive kabul eder.12 yi obje olarak giremiyorum.
        //Cunku primitiv kabul ediyor.Object secsem ile tamsayiyi index yapiyor.
        //Bunun icin yazilan tamsayinin primitiv olmadigini anlatmaliyiz.Silecegimiz degeri nonprimitive yapmaliyiz.
        // Integer nonprimitive=12;
        // ages.remove(nonprimitive);

        //Tam sayiyi eleman olarak gostermenin birkac yolu vardir.

        //Ilkini yaptk tamsayiyi bir degere atadik.
        //  Integer ornek1=12;//sadece ilk gordugu 12 yi siler.
        //diger islemi remove metoduyla yapariz.List oldugunu vurgulariz.
        ages.remove((Integer) 12);//ilk 12 yi siler.//EN IDEALI BU TEK METOD VE YENI DATA OLUSTURMADK.
        //ya da remove metoduyla integer oldugunu vurgular valueof kullniriz.
        //   ages.remove(Integer.valueOf(12));//ilk 12 yi siler.
        //Ya da tamsayiyi bulup indexini alabiliriz.Sonra o indeksi sileriz.
        //  ages.remove(ages.indexOf(12));//ilk gordugunun indeksini verecegi icin sadece ilkini siler.

       //Bir elemanin tum gorunumunu silmek istiyorsak removeall kullanmaliyiz.
        // Fakat removeAll parantez icine list adi ister.O zaman silinecekler listi olusturmaliyiz.

        System.out.println(ages);




        //EXP2.Bu elemanlardan tum 12 leri siliniz.


        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);
     List <Integer>silinecekler=new ArrayList<>();
     silinecekler.add(12);//Daha fazla eleman da ekleyebiliriz. O zaman onlar da silinir.
    nums.removeAll(silinecekler);//Icine list almasi lazim.Bunun icin yeni bir list olusturduk.
        //Bu listede silecegiz elemanlari koyduk.Adini da silinecekler koyduk.Hepsi silinecek.
        System.out.println(nums);




    }//main
}
