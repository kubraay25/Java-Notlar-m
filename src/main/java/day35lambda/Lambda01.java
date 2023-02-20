package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
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

        printElements1(nums);
        System.out.println();
        printElement2(nums);
        System.out.println();
        printEvenElement1(nums);
        System.out.println();
        printEvenElement2(nums);
        System.out.println();
        printSquareofElements1(nums);
        printCubeofDistinctOfElements2(nums);
        printSumOfSquaresOfDistinctEvenElements(nums);
        printProductOfSquareOfDistinctEvenElements(nums);


    }

    //Create a method to print the list elements on the console in the same line with a space between two consecutive element
//(Structured)
    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }

    //(Functional)
    public static void printElement2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));
    }
//Create a method to print the even list elements on the console in the
// same line with a space between two consecutive elements.(Structured)

    public static void printEvenElement1(List<Integer> nums) {

        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    public static void printEvenElement2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }
//teksayilarin karesini bul

    public static void printSquareofElements1(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).//degeri methodu degistirmek icin kullandik
                forEach(t -> System.out.print(t + " "));
    }

    //Listte tek olan ve tekrarsiz olanlarin kupunu yaziniz
    public static void printCubeofDistinctOfElements2(List<Integer> nums) {
        nums.
                stream().
                distinct().//distinct benzersiz eleman verir.streamdan sonra koyarsak daha az elemanla ugrasiriz.
                filter(t -> t % 2 != 0).//filtreleme yapar
                map(t -> t * t * t).//degeri methodu degistirmek icin kullandik
                forEach(t -> System.out.print(t + " "));
        //Once elemeler yapilir sonra islem yapilir.Islem yapip elemek javayi yavaslatir.
    }

    //cift tekrarsizlarin kareleri toplamini ver.
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        Integer sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);//u degerini streamdan alir.t ise ilk deger identity sonra t+u dan alir.
        System.out.println();
        System.out.println(sum);

    }
    //8)Create a method to calculate the "product" of the "cubes" of "distinct" "even" elements
    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums) {
       Integer product =nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t*t).
                reduce(1, (t, u) -> t * u);
        System.out.println();
        System.out.println(product);

    }


}
