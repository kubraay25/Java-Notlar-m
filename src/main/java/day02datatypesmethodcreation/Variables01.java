package day02datatypesmethodcreation;

public class Variables01 {

    //Primitive Data Types-->char-boalean-byte-short-int-long-float-double
    //boalean true false yapar
    //Float - Decimal Numbers (Ondalık Sayı) için kullanılır. Yani virgüllü
    //double- Bu da decimal numberdır. Fakat virgülden sonra daha çok rakam var.Daha çok yeri tutar.}
    public static void main(String[] args) {
        //Örnek 1:Gömlek ve ayakkabı fiyatları için iki tane variable oluşturup toplam fyatı ekrana yansıt.
        //Jv Decimal numbersi otomtik olarak double kabul eder.Float istiyorsak sona da f koymalıyız.
        float shirtPrice = 10.99f;
        float shoesPrice = 11.29f;
        System.out.println(shirtPrice + shoesPrice);
        //Sonuç göstermek içim Sistem javanın sistemi demek.Out dışarısı printte yazdır demek.//
        // Yani sisteme deriz ki yazdığım kodalara git ve bu olana bilgileri dışarı yansıt. //
        // Parantezin içine ne yazasak onu yansıtır//
        //ln line'in kısaltılmışıdır.Pointer'i (imleç) sonraki satıra geç demektir//
        // Ln olmazsa pointer aynı satırdadır//
        //Örnek2:Hücre ağırlığı ve amipin ağırlıği için 2 tane variable oluşturun.Ağırlık farkını yansıtın.
        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;
        System.out.println(weightCell - weightAmip);
        //Sonuç 8.9E-14 ne demek.89.10 üzeri -14 demek.E=Exponent
        //Primitiv isimleri küçük hafle başlıyor.Hata vermese bile primitiv olmaz.
        //Primitiv datalar türüne göre farklı yer kaplar.
        //Primitiv datalar sadece atadığımız değerleri kapsar.
        //Primitiv datalarını java oluşturmuştur.Biz oluşturmayız.


    }
}
