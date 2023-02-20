package day27EncapsulationVeAbstraction.Abstract;
public abstract class Courses {
    /*
      -Body`si olmayan metodlara abstract(soyut) method denir.
      -Ne gerek var?Cunku yazilan kod childlar tarafindan kullanilmayablir.Unused Code olabilir
      -Access modifierden sonra abstract getirilir.Sonra return type sonra metod ismi ve ();
      -Abstract metodu child classlarin biri  kullansa yeter.
      -Abstract metodlar her child class tarafindan override edilmek zorundadir.Yani her child, body eklemelidir.
      -Bir method soyut olarak tanimlandiysa methodun bulundugu sinif da abstract olarak tanimlanmalidir.
      -Abstract classlarda hem abstract method hem de concrete method kullanilabilir.
      -Concrete classlar abstract claslarin childi olabilir.
      -Abstract metodun override edilme zorunlulugu concrete claslar icin gecerlidir.
      -Yani child class da abstract ise override zorunlulugu yoktur.
      -final method override edilemez.O zaman final method abstract olamaz.
      -final class kisirdir.Childi olamayacagi icin override edilemez.O zaman final class abstract olamaz.
      -static,private ve finaller override edilemedigi icin abstract olamazlar.
      -Abstract classda concrete metodlar da bulunabilir.
      -Abstract classtan metod olusturulamaz.Cunku yarim metod var.Obje de tam olamaz.
      -Abstract classlarin constructorlarinin obje uretme ozelligi iptal edilmistir.Kendimiz atask biel.
    */
    /*
    1) Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
    Body'si olmayan method'lara "abstract method"lar denir.

    2)"abstract method"'lar child class'lar tarafindan "override" edilmek zorundadırlar.
    Bu yuzden eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseni
     o method'u  abstract yapmak gerekir.

     3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
     "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

     4)"abstract method" lar siradan class'larin icine yazilamazlar."abstract method"larin icine yazildiklari
     class'lar da abstract olmak zorundadirlar.
 */

public  abstract void math();
public  void art(){
    System.out.println("Painting");
};
//public final abstract void science(); final method override edilemez.O zaman final abstract olamaz.

}
