package day25Inheritence.NT;

public class VehicleRunner {
    public static void main(String[] args) {
        // Honda myHonda = new Honda();
        /*
        ****Bu classin icinde Honda Classindan obje olusturdum.
        1-Obje Honda icindeki parametresiz constructora gitt.
        2-Honda constructor icine super(string); koydum.
        3-Honda beni parenti Car`in stringli constructoruna gonderdi.
        4-Sonra Car constructoru icine super(int) koydum.
        5-Car beni parenti vehicle`nin intli constructoruna gonderdi.
         SONUC=Vehicle 1==>Car 2 City==>Honda 1
          */



        // Honda honda2=new Honda("City",2022);
        //Objeye parametre girdim.
        /*
         1-Honda icinde parametreli Constuctora gonderdi.
         2-Honda parametreli constuctorda gizli super(); var.Car parametrise gonderdi.
         3-Car parametsizin icinde super(700000) var.Beni vehicle parametliye gonderdi.
         sonuc-Vehicle 2 700000==> Car 1==>Honda 2 City 2022
         */
        //this()=>Bu classta kal parametresiz consturactora git
        //this(Strng || int ||) Bu classta kal parametreli olan constractora git.
        //Super() parenta git.This() bu classda git.
        //this() ve super() constructora gonderir.
        //this ve super method ve variable`a gonderir.

/*    HOCA NOT
    1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
     parent class'dan baslatilarak alta dogru calistirilir.
    2)Child Class'da ki constructor'dan Parent Class'da ki constructor'a gidebilmek icin "super()" kullanilir.
    3)Parent Class'da birden fazla constructor varsa istenilen constructor,super() ifadesinin icine yazilan
      parametreler yardimi ile secilebilir.
    4)Ayni class icindeki constructor'lari secmek icin "this()" kullanilir.
    5)Ayni Class'da birden fazla constructor varsa istenilen constructor,"this()" ifadesinin icine yazilan
      parametreler yardimi ile secilebilir.
    6)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
       Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
    7)"super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
    8)Bir constructor'in icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir.
    Bakiniz 6.kural..Yani ilk satirda ikisi birden olamaz.
    9)  Method cagirirken constructora bakilir.
    Methodu'i ararken belirtilen constructordan aramaya baslayip bulanan kadar super'a dogru gideriz.
10) Variable cagirirken data type'a bakilir.
    Variable'i ararken data typedaki classtan aramaya baslayip bulanan kadar super'a dogru gideriz.

     Animal dog=new Dog()
     Dog() kismi constructorken Animal kismi data tipidir.
     method çağırırken constructorin clasina bakıcaz ====== variable çağırırken data type'ınin clasina bakıcaz
     Data tipi ile constructor farkli olabilir.

 */



    }
}
