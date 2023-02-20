package day02datatypesmethodcreation;

import java.sql.SQLOutput;

public class MethodCeation01 {
    //Javada clasa method(aktif) nasıl oluşturulur.
    //1-Method main metodun içinde değil dışında oluşturulur.
    //2-Access Modifier return Type method İsmi (variable isimleri){return variables;}
    //Oluşturulan metodlar main metodun içinden kullanılır.
    //1-Main metodun içine gir.
    //2-Metodun isimini + parantez yaz. Parantez içine sadece değer yaz.Eşleşme kendiliğnden olur.
    //Methoda static ekle.Nedeni sonra açıklanacak.
    //Sonra değeri assigment(atama operatörü) ile aktaralım nereye?Burda sonuç adlı veriye.Yani sağdan sol ata.
    // Sonra onu da sout yap.
    /*Bu da yorum cümlesi java okumaz.ya // ya da */


    public static void main(String[] args) {
        int sonuc1 = add(3, 5);
        System.out.println(sonuc1);
        long sonuc2 = multiply(5, 9);
        System.out.println(sonuc2);
        int odevsonucu = odev(7, 8, 9);
        System.out.println(odevsonucu);
        double sonuc3 = cube(5.25);
        System.out.println(sonuc3);

    }//main

    public static int add(int a, int b) {
        return a + b;
    }

    protected static long multiply(long a, int b) {
        return a * b;
    }

    public static int odev(int a, int b, int c) {
        return a * b + c;
    }

    public static double cube(double a) {
        return a * a * a;
    }

}
//Örnekverielen 3 sayıdan ilk ikisini çarpan ve sonucu 3. ile toplayan metodu kullan.
//ondalık sayının küpünü hesaplayan metod oluşturun.
//Diktörgenin alananı oluşturun
//Diktörgenin çevresini oluşturun
//Dairenin çeveresini oluşturun.
//Dairenin alanını oluştun.
//Boy kitle indeksini bulun
