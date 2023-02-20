package day34mapsiterators;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTable01 {

  /*  1.) HashTable "thread-safe" ve "synchronized" dir
          HashTable entry'leri rastgele siralar .
          HashTable'lar HashMap'lere göre daha yavaştırlar.
          HashTable'lar "key"lerde ve "value"lerde "null" kullanılmasına musaade etmezler

          Note:"multi thread" ve "synchornization" kullanmanız gerekirse, "key"lerde ve
          "value"lerde "null" kullanmak yasak ise HashTable kullanmak gerekir.


   */

    public static void main(String[] args) {

        Hashtable<Integer,Integer> ht = new Hashtable<>();

        ht.put(1,2);// 1 ve -1  --> 1'in kaç tane böleni vardır
        ht.put(2,4);// 1,-1, 2, -2
        ht.put(6,8);// 1, 2, 3, 6, -1, -2, -3, -6

        System.out.println(ht);//{6=8, 2=4, 1=2}


    }
}
