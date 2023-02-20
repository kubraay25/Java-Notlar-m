package day26OverRiding.AnimalMammalCat;

public class AnimalRunner {
    /*
    1-Parent classdaki methodu child class icinde ozellestirip kullanmaya overriding yapmak denir.
    2-overridingde methodun parantezine ismine dokunulmaz. Methody body,access modifier ve return type degisebilir.
    3-QOverride==>override Annatation override kurallarini kontrol eder.Olmasada calisir.Ama hata varsa uyaran olmaz.
    4-Overriding edilen parentteki methoda overridden method denir.
    5-Private methodlar override edilemezler.Cunku baska class ulasamaz.
    6-override methodun access modifieri overridden methoddan daha dar olamaz.Fakat ayni ve genis olabilir.
    Overriden Method==>protected ise Overriding method ==> protected +public
    Overriden Method==>default ise Overriding method ==> default +protected+ public
    Overriden Method==>private ise Overriding method ==> override olmaz ki acces modifier olsun. bkz 5. kural
    7-Overriding methodun return type methodun return ettigi data tipinin aynisi ya da parenti olabilir.
    8-overridingde primitive data tipi varsa degistirilemez.Cunku onlar birbirinin parenti degildir.
    -Primitiveler class olmadigi icin aralarinda parent child iliskisi yoktur.O halde primitiveler degistirilemez.
    -nonprimitiveler ayni zamanda classdir.Onlar arasinda parentlik sublik olabilir.Yani degisebilir.
     9-overridden methodun return type wrapper class ise overridingin return typi degistirilemez.
     -cunku java birini digerinin parenti yapmamistir.O zaman return type ayni olmak zorundadir.
     10-void return type da parente sahip degildr.O da degistirilemez.
     11-inheritance yoksa overriding den bahsedilemez
     12-Static methodlar override edilemez.Cunku o herkesindir.
     13-Finl methodlar override edilemezler.Cunku kisirdirlar.Baba olamazlar.
     14-overloading compile time polymorphismdir.Override run time polymorphismdir.
     -polymorphism cok sekillik demektir.OOPnin prensipleinden biridir.
     -overloading de bir method cok sekilde gozuktugu icin polymorphismdir.
     -overriding de bir method cok sekilde gozuktugu icin polymorphismdir.
     -overloadingde kod yazilirken isleme sokuldugu icin compile time polymorphismdir.
     -overriding kod yazildiktan sonra run edildikten sonra isleme sokuldugu run time polymorphismdir.
     -overloadinge static polymorphism overridinge ise dynamic polymorphism denir.
     -static methodlar overload edilirken override edilemez.


     OOP Principals:
i)Inheritance +
ii)Polymorphism: Method Overloading + Method Overriding
iii)Encapsulation -
iv)Abstraction -


     */

    public static void main(String[] args) {
        Cat myCat=new Cat();
        myCat.eat();
        //Once Animals eat...
        //Cat Clasinda animaldeki eat metodunu overriding yaptim.
        //Overridingde sadece body icerisi degisir.
        //Parantdeki metodun bodysini degistirmeye overriding denir.
        //@override ifadesine Annottion/Anoteysin denir.
        //Annatottion overrde kurallarinin kontrol eilmesini saglar.Ornegin isim paramete girinci cte verir.
        //override yapilan yerin solunda ok isaretli o var.O override demektir.
        //ok yukari ise tiklar babaya gidersin.Babadayken  ok asagidadir tiklar asagiya inersin.

        myCat.drink();//Override ettim. Mammals drink...===>Cats drink... oldu
    }
}
