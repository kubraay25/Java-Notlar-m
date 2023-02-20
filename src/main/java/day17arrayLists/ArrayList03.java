package day17arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Rize");
        cities.add("Trabzon");
        cities.add("Konya");
        cities.add("Van");
        cities.add("Konya");

        //remove object ve remove indeks ilk elemana gore digeri indeze gore siler.
        cities.remove(1);//1. index trabzon silinir.Yerine bosluk gelmez.Eleman azalir.
        cities.remove("Van");//Van silindi.Artik list de van yok.Eleman sayisi bos olmaz.Eksilir.
        cities.remove("Konya");//Iki konya var ikisi de mi silinir.Hayir sadece ilk goruneni silinir.
        System.out.println(cities);//once trabzonu sonra vani sonra konyalardan birini sildik.

        //remove indexi yazdirirsak sout sildigi elemani yansitir.
        String sil=cities.remove(1);
        System.out.println(sil);//Konya yaziyor.Yani konya silindi diyor.
        boolean sil2= cities.remove("Rize");//Remove obje de ise sildim ya da silmedim icin true false verir.
        System.out.println(sil2);//True verir.Olmayan elemanda da false verir.



    }//main
}
