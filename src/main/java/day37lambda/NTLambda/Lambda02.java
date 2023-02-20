package day37lambda.NTLambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Lambda02 {
    public static void main(String[] args) throws IOException {
        //1=LambdaTextFile dosyais icindeki metni konsala yazdiran kodu yaziniz

        Files.
                lines(Paths.get("src/main/java/day37lambda/NTLambda/LambdaTextFile")).
                forEach(System.out::println);//Satir satir okuyoruz

        //2)LambdaTextFile dosyasi icindeki her karakteri uppercase yapiniz.
        Files.
                lines(Paths.get("src/main/java/day37lambda/NTLambda/LambdaTextFile")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //3 LambdaTextFile icinde herhangi bir kelimenin olup olmadigina bakiniz.

        boolean result = Files.
                lines(Paths.get("src/main/java/day37lambda/NTLambda/LambdaTextFile")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).//Arrayleri kirip streama cevirir.
                        anyMatch(t -> t.contains("Java"));//herhangi bir elemanla eşleşme durumunda true dönecektir.
        System.out.println(result);

//4texteki her kelimenin "a" icerim icermedi

        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/NTLambda/LambdaTextFile")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).//Arrayleri kirip streama cevirir.
                        allMatch(t -> t.contains("a"));//Her elemanin eşleşme durumunda true dönecektir.
        System.out.println(result2);

//Texteki hicbir kelimenin x icermedigini gosteren kodu
        boolean result3 = Files.
                lines(Paths.get("src/main/java/day37lambda/NTLambda/LambdaTextFile")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).//Arrayleri kirip streama cevirir.
                        noneMatch(t -> t.contains("x"));//Her elemanin eşleşme durumunda true dönecektir.
        System.out.println(result3);


   //texte r ile bitenleri sec

      long result4= Files.
                lines(Paths.get("src/main/java/day37lambda/NTLambda/LambdaTextFile")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                count();
        System.out.println(result4);
            //2.yol ama tavsiye edilmez
        long result5= Files.
                lines(Paths.get("src/main/java/day37lambda/NTLambda/LambdaTextFile")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                collect(Collectors.toList()).
                size();
        System.out.println(result4);





    }//main

}



