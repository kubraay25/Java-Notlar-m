package day17arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        List<Character> initials = new ArrayList<>();//Sag tarafa ArrayList demek zorunluyken sola List de diyebiliriz.
        //Bunun farki var mi?
        // Dikkat et iki ayri classdan import yaptik.
        //ArrayListde daha ozel tanimlama yapariz.Muslimin oglu
        //Listde daha genel tanimlama yapariz.Hz. Ademin oglu
        // Collectinda detayli anlatilacak.

        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');
        //String ve Arraykerdeki lenth metodunu List de size karsilar.Kac elemani oldugunu verir.
        //Arraylerin length`i Listlerin size`i ifadesini kullanalim.
        int num = initials.size();
        System.out.println(num);//4
        //Bir listten istenen bir eleman nasil alinir.
        char u = initials.get(2);//2. indeksi al dedik "M" gorunur.Index ile calisir

        //verilen string listteki tum elemanlarin toplam karakter sayisini bulunuz.
        List<String> cities = new ArrayList<>();
        cities.add("rize");
        cities.add("Trabzon");
        cities.add("Konya");
        cities.add("Van");

        //1. YOL
        int sum = 0;
        for (String w : cities) {
            sum = sum + w.length();//Alininan veri artik list degil.Listin elemani


        }
        System.out.println(sum);//19

        //2.YOL
        int top = 0;
        for (int i = 0; i < cities.size(); i++) {
            top = top + cities.get(i).length();//Nicin length alinan veri artik list degil.Listin elemani
        }
        System.out.println(top);//19
        //Bir listteki istenen bir lemani nasil degistiririz.Set metodu ile.
        cities.set(3, "Diyarbakir");//3. indeksi Diyarbakir yap.Artik Van yok.
        //Replace metodu gibi islev gorur.Cok kullanilir.Maas listindeki ucretleri set ile degistiririz.

        //EXP Maas listi olustur ve maaslara yuzde 20 zam yapin.
        List<Double> salary = new ArrayList<>();
        salary.add(19.500);
        salary.add(9.00);
        salary.add(22.500);
        salary.add(7.600);

                                    //1.YOl
       int idx=0;
       for (double w:salary){
           salary.set(idx,w*1.20);//set ile degistirdik.
           idx++;
       }
        System.out.println(salary);

                                       //2.yol

        for (int i =0; i<salary.size() ; i++) {
          salary.set(i,salary.get(i)*1.20);//get ilk kisimda indexs verir.Sonra get ile index aldik.
        }
        System.out.println(salary);


    }//Main
}
