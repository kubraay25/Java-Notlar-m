package day14ArraysForEachLoop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //EXAMPLE 2 int array olustur.Icine 6 eleman koy.Elemanlarin en kucug ile en buyugu toplami yansit
        int ages[]=new int[6];//int[]ages=new int[6]; seklinde de olur.
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(ages);//adresini yazdirir./
        System.out.println(Arrays.toString(ages));//Arrays.toString ile arraye gittim.Artik elemanlari gosteriyor.

                                               //1. yol
        Arrays.sort(ages);//Artik elemanlari kucukten buyuge dizdi.sort bu ise yarar.Fakat javayi cok yorar.
        System.out.println(ages[0]+ages[ages.length-1]);//ilk eleman en kucugu son eleman da en buyugu oldu.


                                 //2.yol
        int minumun=ages[0];//herhangi birini koyabilirim.Ilkini koydum.Digerleri ile tek tek kiyaslayacagiz.
        int maximum=ages[0];
        for (int w:ages){
        minumun=Math.min(minumun,w);//Math metodunda min kucugunu bul demek.
                                    // Parantezde min ile w yi karsilastirip kucugunu min e ekledik.
                                   // w son elemana kadar gittigi icin tum elemanlari karsilastirmis olduk.
      maximum=Math.max(maximum,w);
}
        System.out.println(minumun+maximum);



    }//main
}//class
