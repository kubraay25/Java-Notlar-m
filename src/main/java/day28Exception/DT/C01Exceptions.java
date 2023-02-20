package day28Exception.DT;

public class C01Exceptions {
    public static void main(String[] args) {
        //compile Time Error == Kodlarin yazim asamasinda olusan hatalardir==>CTE
        // Run Time Error == Kodlari calistirdiktan sonra olusan hata tipi==>RTE

        /*
        1)NumberFormatExection
         */

//Stringi inte cevir
        String str = "14455";
      int result=convertStringToInteger(str);
        System.out.println("Result = "+(result+5));//Happy Scenario / pPositive Scenario

         String str2="52k";
        int result2=convertStringToInteger(str2);//Negative Scenario
        System.out.println(result2+10);//i methodda sifirdi 10 ile toplayip 10 yapti.

    }


    public static int convertStringToInteger(String a) {
        int i = 0;
        try {
            i = Integer.valueOf(a);
            System.out.println("Burasi Try Bolumu");
        } catch (NumberFormatException e) {
            System.out.println("Rakam Olmayan Karakter Iceren Stringler Integera Cevrilemez");

        }
    return  i;
    }
}