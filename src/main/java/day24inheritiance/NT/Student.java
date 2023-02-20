package day24inheritiance.NT;

public class Student {

    public String name="Tom Hanks";//name herkes tarafindan bilinebilir
    protected int stdaccount=1455888;//Ben esim ve cocuklarim tarafindan bilinebilir.
    String stdId="TH202HU12001";//okul yonetimi tarafindan bilinebilir.Bu yuzden default(Package privite)Ayni Package
    private int balance=10000;//Sadece benim tarafimdan bilinebilir.(Ayni Class)

//*****NOT Class private olamaz.
    /*
    -Access modifierler variablara classlara metodlara constructorlara uasmayi duzenler.
    1)Access modifier'lar genis'den dara; public > protected > default > private
2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
3)Access Modifier'lar ne ise yarar?
        Variablelara methodlara classlara ulasmayi duzenler.
4)Kac tane access modifier var ?
        public > protected > default > private
        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
        iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
        v) "protected" ile "default"un farki nedir ?
           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.
    */

}
