package day28Exception.NT;

public class Exceptions01Arithmeticex {
    /*
      1)Exception demek beklenmedik problem demektir. Seyehatte benzinin bitmesi, arabanin bozulmasi gibi...
      2)Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir. Mesela benzin bitince
        yol yardimi arariz.
      3)Applicationlarda da beklenmedik problemler icin cozum yollari uretmeliyiz,bu isleme "Exception Handling" denir.
        Exception'lar temel olarak ikiye ayrilirlar.
        i)Compile Time Exception:Siz code yazarken fark edilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir
        ii)Run Time Exception:Siz code yazarken fark edilmez ama code u calistirdiginizda console da hata alirsiniz.
      4)Exceptionlar'lar disinda "error" diye adlandirdigimiz "handle edilemeyen" problemler vardir.
        Gercek hayatta soforun olmesi gibi handle edilemeyecek durumlar "Error" dur.
        Application'larda "Memory" nin dolmasi "Error" dur.
        Iki tur memory vardir;
        i)Stack Memory: dolarsa "StackMemoryFlow Error" alirsiniz.
        ii)Heap Memory: dolarsa "OutOfMemory Error" alirsiniz.
      5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
      6)Error ve exceptions farkli seylerdir.Errorlar handle edilemez.
      7 Aritmetik Exception yazdığınız code'da matematiksel işlem kullanıyorsanız alanabilecek bir Exception'dir.
    8) İçinde rakamlar dışında character olan bir String 'i sayıya çevirmek isterseniz Java "NumberFormatException" atar
    9) Bütün exceptionlar classtır
    10)String'lerde var olmayan index'ler kullanıldığında Java "StringIndexOutOfBoundsException" atar.
     11) Array'lerde olmayan index kullanıldığında ArrayIndexOutOfBounds atar.

     */
//Consolun icindeki mesajlara log denir.
/*Why we use try-catch instead of useing if-else ?
 -if else kullanirsak olusabilecek her problemi spesifik olarak  if parantezi icine yazmamiz gerekir gerekir.
 -Bu da ciddi matematik bilgisi gerektirir ve kodu uzatir.
 -  Ama try catch'te Java ilgili Exception ile alakali olusabilecek butun problemleri yakalar.
    */
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        divide(a, b);
        divide2(a, b);


    }//main

    //ArithmeticException  yazdigimiz kodda matematiksel islem kullaniyorsa alinabilecek bir exeptiondur.
    //try catch ile handle edecegiz.
    private static void divide(int a, int b) {
        try {
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Dont divide by zero");
            e.printStackTrace();
        }
        System.out.println("You are here");
    }

    public static void divide2(int a, int b) {
        if (b == 0) {
            System.out.println("Dont invde by zero");
        } else {
            System.out.println(b / a);
        }
    }
}
