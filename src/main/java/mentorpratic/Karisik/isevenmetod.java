package mentorpratic.Karisik;

/*
    Bir tamsayı bağımsız değişkenini kabul eden isEven adında bir method yazın.
     Argüman çift ise yöntem true, aksi takdirde false döndürmelidir.
    */

public class isevenmetod {

    public static boolean isEven(int a){return (a%2)==0;}
    public static void main(String[] args) {

        System.out.println(isEven(8));
        System.out.println(isEven(-5));


    }//main

}
