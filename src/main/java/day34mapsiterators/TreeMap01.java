package day34mapsiterators;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /* 1.) TreeMap entry'leri "key"lere göre "natural order"a koyar
       2.) TreeMap çooook yavaştır cunku "natural order" yapmak çoook zaman ister
       3.) TreMap "thread-safe" ve "synchronized" degildir.
       4.) TreeMap'lerin "key"lerinde "null" kullanılamaz ama "value"lerde istediğiniz kadar kullanabilirsiniz

     */

    public static void main(String[] args) {

        long one = System.nanoTime();

        TreeMap<String, Integer> stdAges1 = new TreeMap<>();
        stdAges1.put("Ali",21);
        stdAges1.put("Kemal",19);
        stdAges1.put("Ayşe",25);
        stdAges1.put("Murat",22);
        System.out.println(stdAges1);//{Ali=21, Ayşe=25, Kemal=19, Murat=22}
                                    //"key"lere göre alfabetik sıra yaptı
        long two = System.nanoTime();

        HashMap<String,Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Ali",21);
        stdAges2.put("Kemal",19);
        stdAges2.put("Ayşe",25);
        stdAges2.put("Murat",22);
        System.out.println(stdAges2);

        long three = System.nanoTime();

        HashMap<String,Integer> stdAges3 = new HashMap<>();
        stdAges3.put("Ali",21);
        stdAges3.put("Kemal",19);
        stdAges3.put("Ayşe",25);
        stdAges3.put("Murat",22);
        System.out.println(stdAges3);

        TreeMap<String,Integer> stdAges4 = new TreeMap<>(stdAges3);
        System.out.println(stdAges4);

        long four = System.nanoTime();

        System.out.println("TeeMap: "+(two-one));TeeMap:// 1639600
        System.out.println("HashMap: "+(three-two));HashMap:// 342200
        System.out.println("HashMap --> TreeMap: "+(four-three));//HashMap --> TreeMap: 329600




    }
}
