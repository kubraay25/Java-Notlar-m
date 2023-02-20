package day12forloopwhileloop;

public class Whileloop01 {
    public static void main(String[] args) {
        //3 den 10 kadar yaz
        //1. yol
        // for (int i =3 ; i <11 ; i++) {
        //    System.out.println(i);

        //2.yol whileloop
       // butun looplarda baslangic degeri vardir.
        int i = 3;//baslangic degeri
        while (i < 11) {//sart
            System.out.print(i+"");
            i++;
         }
        System.out.println();
       //EXAMPLE2  23den 12 ye kadar cift tam sayilari yazdir
             int k=23;
             while (k>12){if (k%2==0){
                    System.out.print(k+" ");}
                  k--;
             }
        System.out.println();
            //EXAMPLE VERILEN SAYININ RAKAMLARI TOPLAMINI BULUNUZ
        //whileloop ile
        int num=5784;
        int sum=0;
             while (num>0){
                 sum=sum+num%10;//son rakami verir.once 4 sonra 8 sonra 7 sonra 5 verir.
              num/=10; //once 578 sonra 57 sonra 5 olur.
             }
        System.out.println(sum);
        System.out.println();
             //forloop ile
        int a=5784;
        int b=0;
        for (int j =a; a>0; a/=10) {
            b=b+a%10;

        }
        System.out.println(b);



    }
}
