package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Bir Stringdeki sesli harflerin syisini bulan kodu yaziniz?
        String s="Java brings you money";

                                      //1.YOL
        int vowels=s.replaceAll("[^aeiouAEIOU]","").length();//nin disindakileri hiclik ile degistik.
        System.out.println(vowels);


                                     //2.YOL
              String letters[]=s.split("");//hiclik ile her harf oncesini parcaladik.
        System.out.println(Arrays.toString(letters));//[J,a,v,a, ,b,r,i,n,g,s, ,Y,o,u, ,m,o,n,e,y]
           //split metodu bize array verir.
         int counter=0;
        for (String w:letters){
            switch (w.toLowerCase()){
                case"a":
                case"e":
                case"i":
                case"o":
                case"u":
                    counter++;
            }//switch

        }//for
        System.out.println(counter);

    }//main
}
