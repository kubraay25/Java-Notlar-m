package practice.nighttime03;

public class C02_IncrementDecrement {

    public static void main(String[] args) {
        int a=12;
        int b=a++;
        System.out.println("b = " + b);//12
        System.out.println("a = " + a);//13

        int x= 15;
        int y=x--;  //PostDecrement
        System.out.println("x = " + x);//14
        System.out.println("y = " + y);//15

        int m= 21;
        int n=++m;//Pre Increment
        System.out.println("m = " + m);//22
        System.out.println("n = " + n);//22

        int t=32;
        int u=--t;
        System.out.println("t = " + t);//31
        System.out.println("u = " + u);//31


        int sayı = 10;
        sayı++;
        System.out.println(sayı);//11
        sayı++;
        System.out.println("pre-incrementten once " + sayı);//12
        System.out.println(" pre-increment satırında " + ++sayı);//13
        System.out.println("pre-incrementden  sonra" + sayı);//13

        System.out.println("post-increment satırında" + sayı++);//13 ONEMLI cunku al ilan et diyor.
        System.out.println("post-incrementdan sonra " + sayı);//14
        System.out.println(9f / 2f);//4.5
        System.out.println(9 / 2);//4

///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int num = 15;
        int num2 = num++;
        System.out.println(num2);//15
        System.out.println(num);//16

        int sayı1 = 10;
        int sayı2 = 20;
        int sayı3 = 30;

        sayı2 = sayı1++;
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);//11 10 30

        sayı3 = ++sayı1;
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);//12 10 12

        System.out.println(sayı3++);//12

        System.out.println(--sayı2);//9

        System.out.println(sayı3++);//13 BIR SONRAKI SATIRDA ISLEME GIRECEK

        System.out.println(sayı3);//14

    }
}