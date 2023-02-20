package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Array diziler demek.
        //Bir yapinin icine sadece bir data depolanabilir.
        //Bazen bir yapi icerisinde coklu data depolamak gerekebilir.
        //Bunun icin java array olusturmustur.
        // Array birden fazla datayi bir yapida depolama imkani verir.

                         //ARRAY NASIL OLUSUR

             String stdName[]=new String[5];//Data tipi soylenmeli ve kac eleman koyacagimiz soylenmeli burada 5
                                            //Sayisini bilmiyorak array olusturamayiz.
                                            //5 dedik stdname yapisin 5 tane null atadi.
        System.out.println(stdName);//stack deki adres gozukur.
                                    // Adresi degil de arrayi gormek istersek arrydan to string ve array ismi
        System.out.println(Arrays.toString(stdName));//Su an 5tane null gozukur.Cunku henuz atama yapmadik/
                                                     //toString olmadan java arrayin adresini gosterir.

      String myfriends[]=new String[5];//yine 5 data verdik.Datalari girelim artik.
                                       //Stringdeki elemanlar da index kullanir.Su an 4 indeks var.
       myfriends[2]="AJDA";    //2. indeksi yani 3. elemani AJDA yaptik
       myfriends[0]="Cuneyt"; //0. indeks 1. eleman
       myfriends[1]="Kemal"; //2. eleman
       myfriends[3]="Ezel";  //4.eleman
       myfriends[4]="Besir"; //5.eleman
        System.out.println(Arrays.toString(myfriends));//Butun isimler gozukur.cuneyt/kemal AJDA ezel besir
                                                       //ozel elemani nasil aliriz.
        System.out.println(myfriends[2]);//Ozel elemani istedik.AJDA
        //myfriends de her elemani al sonuna !koy.
        for (int i = 0; i <myfriends.length; i++) {//stringlerde length de parantez kullanidik.Array da yok
            System.out.print(myfriends[i]+"!");
        }

    }//main
}
