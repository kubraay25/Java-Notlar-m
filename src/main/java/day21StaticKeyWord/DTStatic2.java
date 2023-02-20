package day21StaticKeyWord;

public class DTStatic2 {



    public static void main(String[] args) {
        System.out.println("C02staticDepo.okulIsmi = " + DTStaticDepo.okulIsmi);//static objesiz class ile ulastim.
//Diger classdan static olnlari buradaki clasa alabildim.
        DTStaticDepo ogrenci=new DTStaticDepo();//static olmayan icin obje olusturdum
        System.out.println("ogrenci.ogrencigul = " + ogrenci.ogrencigul);

        DTStaticDepo ogrenci2=new DTStaticDepo();//static olmayan icin obje olusturdum
        System.out.println("ogrenci2.ogrencigul = " + ogrenci2.ogrencigul);

        DTStaticDepo.okulIsmi="Mine Okullari";//Static variable i degistirdim.
        System.out.println("C02staticDepo.okulIsmi = " + DTStaticDepo.okulIsmi);//Mine Okullari

        ogrenci.ogrencigul="Zeynep";
        System.out.println("ogrenci.ogrencigul = " + ogrenci.ogrencigul);//zeynep

        System.out.println("ogrenci2.ogrencigul = " + ogrenci2.ogrencigul);//gul gecer

    }//main
}
