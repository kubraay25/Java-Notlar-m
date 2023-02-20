package day36Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//t-> ifadesi lambda expression olarak ifade edilir.
//Lambada kullanirken ya method referance:: ya da lambda expression t-> kullanilir.
////removeif streamsz kullanilir.
public class Lambda01 {
    //Create a method to find the half of the elements greater than 5,distinct,in reverse order in a list
    public static void main(String[] args) {


        List<Double> mylist = new ArrayList<>();
        mylist.add(12.0);
        mylist.add(4.0);
        mylist.add(7.0);
        mylist.add(3.6);
        mylist.add(26.8);
        mylist.add(38.4);

        List<Double> half = getHalfElementsGreaterThanFiveDistinctReversed(mylist);
        System.out.println(half);

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);
        System.out.println();
        printAllSortWithLengthUpperDistinct1(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct1(list);
        System.out.println();
        System.out.println(removeElementIfTheLengthGreaterThanFive(list));
        System.out.println();
        System.out.println(removeElementIfStarsWithAOrEndWithD(list));
        System.out.println();
        System.out.println(printLengthSquare(list));
        System.out.println(list);

    }//main

    public static List<Double> getHalfElementsGreaterThanFiveDistinctReversed(List<Double> myList) {
        return myList.
                stream().
                distinct().
                filter(t -> t > 5).
                map(t -> t / 2).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

    }

    public static void printAllAlphabeticallyUpperDistinct(List<String> list) {
        list.stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }

    public static void printAllAlphabeticallyLowerDistinct(List<String> list) {
        list.stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));
    }

    public static void printAllSortWithLengthUpperDistinct1(List<String> list) {
        list.stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));
    }
    public static void printAllSortWithLengthUpperDistinct2(List<String> list) {
        list.
                stream().
                distinct().
                map(String::toUpperCase).//String::toUpperCase yapisina "method reference" denir.
                sorted(Comparator.comparing(String::length).
                thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
    }
    public static void printAllSortWithLastCharUpperDistinct1(List<String> list) {
        list.stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));
    }
  public static void   printAllSortWithLastCharUpperDistinct2(List<String>list){
        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastchar).
                        reversed()).
                forEach(Utils::printInTheSameLineWithSace);
    }

    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String> list) {
        list.
                stream().
                distinct().
                sorted(Comparator.comparing(String::length).//String :: yapisina method referans denir
                        thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
    }
    public static List<String> removeElementIfTheLengthGreaterThanFive(List<String> list) {
       list.
                removeIf(t-> t.length()>5);//removeif streamsz kullanilir.
       return list;

    }

    public static List<String> removeElementIfStarsWithAOrEndWithD(List<String> list) {
        list.
                removeIf(t-> t.startsWith("A")||t.endsWith("d"));//removeif streamsz kullanilir.
        return list.stream().collect(Collectors.toList());
//removeif kullaninca stream kullanamiyoruz.Ama removeifden liste stream yapip liste cevirebiliriz.
    }

    public static List<Integer> printLengthSquare(List<String> list){
    return     list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());

    }
    public static List<String>printElementsLengthEven(List<String>list){
        return list.stream().filter(Utils::isLengthEven).collect(Collectors.toList());
    }


}
