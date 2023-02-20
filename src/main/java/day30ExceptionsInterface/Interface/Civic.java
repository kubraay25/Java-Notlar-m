package day30ExceptionsInterface.Interface;

public class Civic implements AC, Engine, Security {
    @Override
    public void cool() {
        System.out.println("Civic cools");
    }

    @Override
    public void run() {
        System.out.println("AC run marvelous");
    }
    // multiple inheritance :x: ==> classlar icin mumkun degil, interface olunca mumkun
    // Multiple inheritance class'lar icin mumkun degildir ama interface icin mumkundur
// Bir interface'i parent yapmak icin impliment keyword'unu kullaniriz
// Bir class'in birden fazla interface'i olabilir
// Java parent'lar "Class" oldugunda "Multiple parent" a musade etmez ama biz bazen "mltiple parent' a ihtiyac duyariz
//    Bu ihtiyaci gidermek ici java "Interface" ismini verdigi yeni bir yapi olusturdu
//            bu yapi sayesinde bir "class" icin ceoklu "interface parent" olusturabiliriz
//Interface larini icine "concrete method" konulamaz, cunku "concrete methodlarda" body vardir ve body o method'un isi nasil yapacagi
//ni belirtir. Isin nasil yapilacagi bircok detay icerir ve bu Child class'larda kafa karisikligina sebep olur
// Halbuki sadece yapilmasi gereken isi soyleyip nasil yapilacagini child'a birakirsaniz
// Child Class'in kafa krisikligini engellemis olurusnuz
// Coklu parent'ta detaylar verilmez sadece methodun ne yapmasini istedigini vermemiz gerek
//Interface lerde methodlar abstract oldugundan abstract yazmaya gerek yoktur.
//Interface lerde tum methodlar publictir, ,abstractir.Static ve final degildir.
//Interface'ler "concrete" method icermezler, dolayisiyla interface'in icindeki hicbirsey istege bagli degildir
// Interfacein icindeki hersey child class'lar icin mecburidir, bu yuzden Interface'lere "TODO list" denir
    //Coklu Interface parentlerin herbirine ayni isimli method koyabiliriz.
    //Child class herhangi birini override ettiginde hepsini override etmis olur.
    //Interfacedeki tum methodlar otomatik olarak publictir,abstractir.
    //Interfacedeki variabla otomatik olarak publictir statictir finaldir.
    //Variableler interface adiyla cagrildigi icin karisiklik olmaz.
    //Interfacelerin constructori yoktur.

    /*
1)Bir interface'i bir Class'in parent'i yapmak icin "implements" keyword'unu kullaniriz.
            2)Java parent'lar Class oldugunda "multiple parent"a musaade etmez ama biz bazen "multiple parent"a ihtiyac duyariz.
    Bu ihtiyaci gidermek icin Java "interface" ismini verdigi yeni bir yapi olusturdu.
    Bu yapi sayesinde bir Class icin coklu interface parent olusturabiliriz.
            3)Coklu interface parent'larin herbirinin icine ayni isimli method'lar koyabiliriz.
    Mesela AC'nin, Engine'nin ve Security'nin herbir iclerine "run method"u koymak gibi.
    Child Class herhangibirisini override ettiginde hepsini Override etmis gibi olur sonra da
    body'i Child Class'da yazarak uygulamasini yapmis olur.
 */


}
