package day04memorykullanımwrapperclass;

public class CO5_MANTIKOPERATORLERI {
    public static void main(String[] args) {
        //Java 3lü kıyaslama yapamaz.İkili yapabilir.
        //Araya mantık operatoru koyarsak iki tane ikili yaparak olayı çözer.Sonucu true false verir."
        //Mantık operatorler nelerdir?
        //EŞİTTİR İÇİN  ==
        //EŞİT DEĞİLDİR İÇİN !==
        //ATAMA(ASSİGMENT) İÇİN =
        // AND İÇİN &&(bu and operatoründe kodda yanlış bulduğun yerde dur devam etme.Daha hızlı çalışır.)
        // AND İÇİN &(bu and operatoründe kodda yanlış bulsa bile tüm kodu tarar.Daha yavaş çalışır.)
        //OR İÇİN ||
        System.out.println(5+2==8);//false
        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc1 = " + sonuc1);//true
        boolean sonuc2=5<4 && 7>9 && 6+3==9;
        System.out.println("sonuc2 = " + sonuc2);//false
        boolean sonuc3=5*6==8||4<5||2+1!=3;
        System.out.println("sonuc3 = " + sonuc3);//true
        int sayı1=15;
        System.out.println(10<sayı1 && sayı1<20);//true

    }
}
