package day13whileloopdowhileloop;

import java.util.Scanner;

public class whileloop01 {
    public static void main(String[] args) {
    //werilen stringde her harften sonra * koy
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Bir Kelime Giriniz");
        String word=input.next();
        String newWord="";

        int i=0;
    while (i<word.length()){
        newWord=newWord + word.charAt(i) +"*";
    i++;
    }//While
        System.out.println(newWord);


    }//Main
}
