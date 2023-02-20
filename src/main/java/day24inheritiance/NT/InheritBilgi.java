package day24inheritiance.NT;

public class InheritBilgi {
    //Sub Class=Child Class
    //Parent Class=Super Class
    //Javaya hangi clasin hangi clasin child clasi  oldugunu bildirmeliyiz.
    //Bunu extends ile yapariz.
    //Child Classin isminden sonra extends yazim parent Class yazilir.
    /*   ************INJHARINCE FAYDALARI
     1) Code standardında tekrar iyi değildir.
     2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
     3) Gelişime update'e açık olmalıdır
     4) Code atomic yapıda olmalı.
     Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
     Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
     Note 3:Public metodlar child class tarafindan kullanilabilir.Yani inherit edilebilir.

     //Inherit edilebilir demek child class tarafindn kullanilabilir demektir.
     Note 4:Protected metodlar inherit edilebilir.Farkli packagede inherit edilebilirler.
     Note 5:Default methodlar objectin uretildigi class ile ayni packagede ise inherit edilebilirler.Farkli packag olmaz.
     Note 6:Private methodlar inherit edilemezler.Cunku private olana ulasilamaz.
     Note 7: Java birden fazla parent'i(multiple inheritance)  onaylamaz.Yani 2 parent koyamayiz.
      -Ama granparent ggparent olabilir.Peki ayni metodlar farkli seyler soylerse ne olur.En yakin olan metodu uygular.
      Note8:Child=>Parent=>Grand Parent=> grand grand parent .... selinde ilerleyen inherinca multi level inherince denir.
      Note 9:Object Class tum classlarin parentedir.Ama kendi parenti yoktur.
       Note 10: Java'da "parent" dan "child" a olan iliskilere "HAS-A" Relationship denir.
       Note 11: Java'da "child" dan "parent" a olan iliskilere "IS-A" Relationship denir.
       Note 12:Default costructor nerededir.Cunku her classda defaul cons var,Object Class da default constructor var
       -Bu yuzden default constructore her class gorur.Ama daha yakin parentlerde cons varsa o kullanilir.
     /


*/
    //ORNEKLE ICIN NTYE BAK
}
