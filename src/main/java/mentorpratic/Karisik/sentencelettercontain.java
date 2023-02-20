package mentorpratic.Karisik;

import java.util.Scanner;

public class sentencelettercontain {
    public static void main(String[] args) {
        System.out.println("Please Enter A Sentence");
        Scanner input=new Scanner(System.in);
        String sentence=input.nextLine().toUpperCase();
        System.out.println("Please Enter A letter");
        char letter=input.next().toUpperCase().charAt(0);
        int sum=0;
        for(int i=0;i<sentence.length();i++){if (sentence.charAt(i)==letter){sum++;}}//for
        System.out.println(sum);
    }//main
}
