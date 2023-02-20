package day20passbyvalueoverloading;

public class staticnedir {
    public static void main(String[] args) {
        /*
        1-Uzerindeki degisiklikler herkes tarafindan aninda gorulen objelere static denir
        2-Uzerindeki degisiklikler sadece ilgili kisiler tarafinda gorunen objelere nonstatic denir
        3-Dolayisiyla uzerinde yapilan degisklik herkesce gorulur..
        4-Static gokdeki ay gibidir.Herkes gorur ve herkese aittir.
        5-Javada hersey objenin uzerine kurulur.Obje icin de class lazimdir.
        6-Static clasa yapisir ve bir kere olusur.Non static objeye yapisir ve obje sayisi kadar olusur.

                                   NOT-ORNEKLI
        1=ogrencilerden olusan bir class olusturdum.
        2=Ogrenci sayisi, ismi, ve id leri variable olarak olusturuldu.sadece sayi static olusturuldu.
        3=obje olusturdugumda isim id objeye gelir yapisir.Sayi ise yeinde kalir objelere inmez.
        4=Cunku o butun objelerin ortak malidir.Ve objeyle alakali degildir.
        5=Yeni obje olusturdum.Yine ismi ve id i gelir.Sayi yine classda kalir.
        6=nonstatic ler objeye aittir.static clasa aittir
        7=2 obje olusturdum.ad ve id 2 kez olusturuldu.Sayi bir tne.
        8=Non static olnlar obje sayisi kadar olusur.Static ise sadece 1 kere olusturulur.
        9=Non staticlere ulasmak icin obje olmalidir.Ona objeden ulasiriz.
        10=statice objeyle de gidilir objesizde.Objeyle gidilirse gereksiz olur.statice class uzerinden gidilmeli


//static variablenin diger adi class variable instance varoablenin diger adi object variabledir.
//Static variable objectlerin ortak kullanimina aciktir.FakatInstance variable acik degildir



         */


    }//main

    public static void mult(int a, int b) {
        System.out.println(a * b);
    }

}
