package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

    }

    //  Create a method to find the "maximum value" from the list elements
    public static void getMaxValue(List<Integer> nums) {
        Integer maxValue = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println("maxValue = " + maxValue);
        //u butun degerini streamden alir.
        //t ilk degerini min-Valueden diger degerlerini t den alir.
    }

    //2.yol
    public static void getMaxValue2(List<Integer> nums) {
        Integer maxValue = nums.
                stream().
                distinct().
                reduce(nums.get(0), (t, u) -> t > u ? t : u);//Ama tercih edilmez.Ilave get islemi yapar.
        System.out.println("maxValue = " + maxValue);

    }

    //3.Yol
    public static void getMaxValue3(List<Integer> nums) {
        Integer maxValue = nums.
                stream().
                distinct().
                sorted().
                reduce((t, u) -> u).//Kucukten buyuge siraladim.2. olani ver dedim.Cunku hep oradaki daha buyuk
                        get();
        System.out.println("maxValue = " + maxValue);

    }

    /*
    maximum degeri ararken Integer.MIN_VALUE kullanmak genel pratiktir.
    minimum degeri ararken Integer.MAX_VALUE kullanmak genel pratiktir.
     */
    public static void getMinValue1(List<Integer> nums) {
        Integer minValue = nums.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("minValue = " + minValue);
    }

    public static void getMinValue2(List<Integer> nums) {
        Integer minValue = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).//Tersten siraladim
                        reduce((t, u) -> u).get();
        System.out.println("minValue = " + minValue);
    }

    public static void getMinValue3(List<Integer> nums) {
        Integer minValue = nums.
                stream().
                distinct().
                reduce((t, u) -> Math.min(t, u)).
                get();
        System.out.println("minValue = " + minValue);
    }

    public static void getMinGreaterThanSevenEven(List<Integer> nums) {
        Integer rtr = nums.
                stream().
                distinct().
                filter(t -> t > 7 && t % 2 == 0).
                sorted().
                reduce((t, u) -> t).
                get();
        System.out.println(rtr);
    }


}

