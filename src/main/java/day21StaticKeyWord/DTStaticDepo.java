package day21StaticKeyWord;

public class DTStaticDepo {

    static String okulIsmi = "Emre Okullari";//static variable

    String ogrencigul = "gul Gecer";//instance variable

public static void staticmethod(){
    System.out.println("Ben static metodum");
}
    public  void instancemethod(){
        System.out.println("Ben static metod degilim");
    }

    public static void main(String[] args) {
        System.out.println("C02staticDepo.okulIsmi = " + DTStaticDepo.okulIsmi);
    }
}
