package day37lambda.NTLambda;


import day36Lambda.Utils;
import day37lambda.DTLambda.Utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);
        System.out.println();
        System.out.println(getSumOfAllElement(myList));

    }

    //Verilen Listteki tum sayilarin toplamini veren methodu olusturunuz
    public static int getSumOfAllElement(List<Integer> myList) {
        return myList.
                stream().
                reduce(Math::addExact).get();
//reduce methodunu tek parametre ile kullanirsak optional ister biz get ile bu istemi degistiririz.
        //Math::addExact :Matematik Class'ina git,topla tam olarak
    }

    //7 den 70 kadar tum tam sayilarin toplmani veren kodu yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).//Listi burada olusturdum.7 de 70 de dahil
                        reduce(Math::addExact).
                getAsInt();
    }

//Intstream==> integerlari yukardan asagi diziyor.Sinir belirlemek icin rangeClosed seciyoruz.Ikisi de dahil
//rangeClosed==> baslangis ve bitis araligi veriyor

    public static int getMultiplyFromThreeToNine1() {
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    public static OptionalInt getMultiplyFromThreeToNine2() {//Ya da get koymam OptionalInt yaparim
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact);
    }

    public static int getMultiplyFromThreeToNine3() {//Ya da get koymam OptionalInt yaparim
        return IntStream.
                range(3, 10).//Range ise ilki dahil ikincisi dahil degildir.
                        reduce(Math::multiplyExact).
                getAsInt();
    }

    //Verilen sayinin faktoriyelini bulunuz
    public static int getFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilmaz");
            return -1;
        } else {
            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }

    }

    //Berilen 2 tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz
    public static int getSumOfEvenBetweenTwoInt(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
          /*
            a=a+b;
            b=a-b;
            a=a-b;
           */
        }
        return IntStream.
                range(a + 1, b).
                filter(Utils::isNumberEven).
                reduce(Math::addExact).
                getAsInt();
    }

    //Example 6:Size verilen iki tamsayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz.
    // 12 ve 18 ==> 13 14 15 16 17 ==> 4+5+6+7+8 = 30
    public static int getSumOfDigitsBetweenTwoInts(int a, int b){
        return IntStream.range(a+1, b).map(Utils::getSumOfDigits).sum();
    }

}


