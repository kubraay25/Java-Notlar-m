package day16multidmensionalarray;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
    //EX1 Bir int mdarray olustur.toplam eleman sayisini yazdir.
    //Bu yontemle arraydeki inner arrayleri farli yapabliliriz.
    int a[][]={{12,23,4},{12,87},{4,7,1,9},{99}};
        System.out.println(Arrays.deepToString(a));

        int sum=0;
        for(int[] w:a){//bu foru outer array icin yazdim.Alacagim yer array oldugu icin intten sonr [] koydum.
        //foreachloop ta w den once elemanin data tipi yazilir.Burada tip int arraydir.(int[])
        //w icine arrayler gelecek.
        sum=sum+w.length;

        }
        System.out.println(sum);


    }//main
}
