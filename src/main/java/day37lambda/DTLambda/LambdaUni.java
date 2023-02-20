package day37lambda.DTLambda;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaUni {
    public static void main(String[] args) {

        Universite u1 = new Universite("hacettepe","fizik",1200,88);
        Universite u2 = new Universite("bogazici","qa",1000,90);
        Universite u3 = new Universite("odtu","dev",900,95);
        Universite u4 = new Universite("marmara","matematik",3000,60);
        Universite u5 = new Universite("ege","elektrik-elektronik",2000,83);

        List<Universite> unv = new ArrayList<>(Arrays.asList(u1,u2,u3,u4,u5));
        System.out.println(notOrt75tenByk(unv));
        System.out.println();
        System.out.println(mtkVrmYkm(unv));//true
        System.out.println();

    }//main

    // Task 01 : Butun universitelerin not ortalamasinin 75'ten buyuk oldugun gosteren bir program olusturunuz.
    public static boolean notOrt75tenByk(List<Universite> unv){
        return  unv.
                stream().
                allMatch(t->t.getNotOrtalamasi()>75);

    }

    // Task 02 : Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden bir program olusturunuz.
    public static boolean mtkVrmYkm(List<Universite> unv){
        return  unv.
                stream().
                anyMatch(t->t.getBolum().equalsIgnoreCase("matematik"));

    }

        // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayan bir program olusturunuz.
    public static List<Universite> ogrncSykarByktnKc(List<Universite> unv){
        return unv.
                stream().
                sorted(Comparator.comparing(Universite::getOgrenciSayisi).reversed()).
                collect(Collectors.toList());//stream yapisindaki datalari list yaptim

    }
        //Task 04-->"matematik" bolumlerinin sayisini  print ediniz.
        public static long MatBlmSys(List<Universite> unv){
            return unv.
                    stream().
                    filter(t-> t.getBolum().equals("Matematik")).
                    count();//Sayma Islemi Yapar

        }

        //Task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
        public static OptionalInt OgrncSys500denFazla(List<Universite> unv){
            return unv.
                    stream().
                    filter(t->t.getOgrenciSayisi()>550).
                    mapToInt(t->t.getNotOrtalamasi()).//degeri guncelledik.
                    max();//methodun null gelme ihtimali var.OptionalInt yaptik
        }



        //Task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
        public static OptionalInt OgrncSys1050denAz(List<Universite> unv){
            return unv.
                    stream().
                    filter(t->t.getOgrenciSayisi()<1050).
            //maxmin onceden map icindeydi artik degil.Mapint de vs var.
                    mapToInt(t->t.getNotOrtalamasi()).//degeri guncelledik.
                            min();//methodun null gelme ihtimali var.OptionalInt yaptik
        }

}
