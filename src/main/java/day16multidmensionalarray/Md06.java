package day16multidmensionalarray;

public class Md06 {
    public static void main(String[] args) {
    //EXP bir md arraydeki en buyuk ve en kucuk sayinin toplamini ekrana yazdiriniz.
        int a[][]={{21,5},{4,-10,11}};
        int small=a[0][0];
        int big=a[0][0];
        for (int[]w:a){
            for (int k:w){
                small=Math.min(small,k);//1. elemani sirayla kiyasla kucugunu small`a at.
                big=Math.max(big,k);//1. elemani sirayla kiyasla buyuk olani big`e at.
            }
        }
        System.out.println(big+small);






    }//main
}
