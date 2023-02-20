package day29Exceptions;

public class Exceptions01ClassCastException {
    public static void main(String[] args) {
/*
Birbirine donusturulemeyecek data typlarini donusturmekte israr ederseniz Java ClassCastExceptions verir.
//Java byte, short, int, long, float, and double (primitive'ler arasinda) arasinda casting yapabilir.
//Bunu yapmaya calisirsaniz ClassCastException (Run Time Exception) alirsiniz.
 */

        Object obj = 70;
        String str = "";
        try {
            str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Her Data Tipi Her Data Tipine Donusturulemez.");
        }
        System.out.println(str);//ClassCastExceptions



    }

}






