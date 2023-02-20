package day21StaticKeyWord;

public class DTStatic1 {

    static int sayi1;
    int sayi2 = 2;


    public static void main(String[] args) {

        System.out.println(sayi1);//sayi 2 gorulmuyor.Cunku static degil.instancedir.

//Scanner input=new Scanner(System.in); burada da scanner classindan input objesi olusturduk.

        DTStatic1 obj1 = new DTStatic1();//class uzerinden obje olusturduk
        System.out.println(obj1.sayi2);
        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("obj1.sayi2 = " + obj1.sayi2);
        DTStatic1 obj2 = new DTStatic1();
        System.out.println("obj2.sayi2 = " + obj2.sayi2);//0 cunku biz sayi2 yi degil obj1 i artirdik.


    }///main
}
