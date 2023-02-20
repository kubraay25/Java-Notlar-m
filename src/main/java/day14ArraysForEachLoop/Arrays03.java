package day14ArraysForEachLoop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //EXAMPLE String array olustur.6 eleman yerlestir.Karakter sayisi 5 den cok olan elemanlari sil.
        String colors[]=new String[6];
        colors[0]="red";
        colors[1]="orange";
        colors[2]="blue";
        colors[3]="yellow";
        colors[4]="green";
        colors[5]="brown";
        //Yeni bir array olusturacagiz.Eleman sayisi 5 den buyuk degilse bu yeni arraya atacagiz.
        // Yeni Stringde kac eleman olacagini yazmaliyiz.O zaman kactane aktaracagimizi bilmeliyiz.
        //Array olustumak icin 2 sey bilinmeldir:ELEMAN DATA TIPI VE ELEMAN SAYiSI

        int counter=0;
        for (String w:colors){
            if (w.length()<=5){
                counter++;
            }//Kac elemanin 6 dan kucuk oldugunu bulduk.Yeni arraya atalim.
        }

        String newcolors[]=new String[counter];
        int idx=0;
        for (String w:colors){
            if (w.length()<=5){
                newcolors[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newcolors));




    }//Main
}
