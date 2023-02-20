package day34mapsiterators;

import java.util.HashMap;

public class HashMapMechanism {

    /* 1.) Siz HashMap oluşturmak için "HashMap<String, Integer>hm=new HashMap<>();" kodunu
    yazdığınızda java 16 tane "bucket(kova)" oluşturur ve bu "bucket"ları 0 dan 15e kadar index'ler.
       2.) Siz "entry" eklemek için "hm.put("Istanbul", 17000000);" kodunu yazdığınızda Java;
           -->"key" için "hashCode" uretir
           -->"hashCode"u 16ya böler
           -->kalani index olarak kullanıp, index'i kalana eşit olan bucket'a bu "entry"i yerlestirir
           -->eğer bir bucket'a birden fazla "entry" eklenecekse, Java o bucket icinde "LİnkedList"
           yapısını kullanır
     */
    public static void main(String[] args) {

    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("Istanbul", 17000000);
    hm.put("Miami", 5000000);
    hm.put("Moscow", 18000000);
    hm.put("New Delhi", 31000000);

    System.out.println(hm);//{New Delhi=31000000, Istanbul=17000000, Moscow=18000000, Miami=5000000}

    }
}