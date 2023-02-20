package day20passbyvalueoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
//Java Pass-By-Value sayesinde variable larin degerin koruma altina alir.
        //Java vaiablenin gercek degerini degil.Kopyasini metoda gonderir.
        //variable degistirmek icin atama yapmaliyiz.
        double shirt = 100;
        double studentShirtPrice=discount("student", shirt);
        System.out.println(studentShirtPrice);//90 kopya olan shirt degisti
        System.out.println(shirt);//100 asil shirt degeri degismedi
        double veteranShirtPrice=discount("veteran", shirt);
        System.out.println(veteranShirtPrice);//80
        System.out.println(shirt);//100
        double seniorShirtPrice=discount("senior", shirt);
        System.out.println(seniorShirtPrice);//95
        System.out.println(shirt);//100
         shirt=veteranShirtPrice;//Assigment yaptim.Ana deger degisti.
        System.out.println(shirt);//80.Cunku atama yaptim

    }//main

    public static double discount(String state, double price) {
        switch (state) {
            case "student":
                price = price * 0.90;
                break;
            case "veteran":
                price = price * 0.80;
                break;
            case "senior":
                price = price * 0.95;
                break;
            default:
                price = price;
        }
        return price;
    }


}
