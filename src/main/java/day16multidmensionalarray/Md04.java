package day16multidmensionalarray;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {
        //EXP1 bir Md array olustur ve bir dimensonal`li arraya donustur.
        int a[][]={{2,5},{3},{4,7,11}};
        int sum=0;
        for (int[] w:a){
            sum=sum+w.length;
        }
        int b[]=new int[sum];
       int idx=0;
       for (int[] w:a){
           for (int k:w){
               b[idx]=k;
               idx++;
           }

       }System.out.println(Arrays.toString(b));



    }//main
}
