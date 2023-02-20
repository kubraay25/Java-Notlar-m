package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {

    /* Map kullanıp kullanmayacağımıza istediğimiz çıktının data yapısına
       bakarak karar vereceğiz
        */

    public static void main(String[] args) {

        /* Example 1: Size verilen bir cümledeki her bir kelimenin kaçar kere
        kullanıldığını gösteren kodu yazınız

        "Java is easy. Java is OOP. OOP mekes Java easy."
         ==> Java=3, is=2 easy=2, OOP=2 makes=1 */

        HashMap<String,Integer> wordsMap = new HashMap<>();

        /* javaya göre (easy.) != (easy), (OOP.) != (OOP)
        dolayısıyla önce noktalama işaretlerini silelim "replace()" methodunu kullanarak */

        String sentence = "Java is easy. Java is OOP. OOP mekes Java easy.";
        System.out.println(sentence);//Java is easy. Java is OOP. OOP mekes Java easy.

        /*sentence.replaceAll("\\p{Punct}","");  //bütün noktalama işaretlerini hiçbir şey yap
          System.out.println(sentence);//
          önce hoca bunu yaptı fakat noktalama işsretleri gitmedi ve şöyle bir açıklama yaptı
          "çünkü Stringler immutabledir methodlar(replace()) orjinal Stringi değiştiremezler illa
          değiştirmek istiyorsan değişmiş halini  orjinal Stringe assign etmemiz(atamamız) gerekir
          yani "sentence"nin içine koymamız gerekir */

        sentence = sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);//Java is easy Java is OOP OOP mekes Java easy

        //şimdi artık bu kelimeleri birer birer alıp sayabiliriz
        //"split" methodu bize array verir

        String[] wordsArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));//[Java, is, easy, Java, is, OOP, OOP, mekes, Java, easy]

        /* biz arraylerde "for iç loop" kullanabiliyoruz şimdi tekrar den kelimelerin sayısını bulalım
        aşağıda yapacağımız işlem "boş Mape git w'nun valuesini bana ver demek"*/

        for (String w: wordsArray){

            Integer numOfOccurrence = wordsMap.get(w);  /* burda her kelimeyi alır tek tek wordsMapin içinde var mı
                                                         diye bakar eğer o kelime yoksa get methodu "null" ataması yapar*/
            if(numOfOccurrence==null){
                wordsMap.put(w,1);     /*kelimeyi Mape koy valuesini 1 yap demek yani "java=1" gibi*/

            }else{
                wordsMap.put(w,numOfOccurrence+1); //burda "replace()" methoduda kullanılabilir
            }

        }
        System.out.println(wordsMap);//{Java=3, OOP=2, is=2, easy=2, mekes=1}












    }
}
