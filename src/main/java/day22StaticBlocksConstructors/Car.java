package day22StaticBlocksConstructors;
 /*
   Constructor nedir.
   -Javada classlar objenin kalibidir.Fakat class tek basini obje veremez.Birde constructor lazim
   -Constructor object uretmemize yarayan code blocklaridir.
   -Class olusturdugumuzda java oromatik olarak bize constructor verir.
   -java classlara verdigi bu constructor invisiabledir.
   -Javanin otomatik olarak verdigi bu invisiable constructorlara default constructor denir.
   -Default Constructorlar "Car(){}" seklindedir.Car Class ismidir.
    */
/*
-Bir classda farkli parametreler kullanarak istegimiz kadar costructor kullanabiliriz.
=Farkli constructor sayesinde bir classdan farkli objectler olusturabiliriz.

=======Method Constructor farki
-Method ile Constructor farkli yapilardir.
-Constructor ismi Class la ayni olmalidir.Methodda istedigin ismi yazabilirsin.
-Metodlara sekil olarak benzer ama conslarda return type yok.Methodlarda return type sarttir.
 */
public class Car {
  String make="Honda";
  String model="City";
  int year=2022;
boolean hybrid=true;



  public Car(String make, int year) {
    this.make = make;
    this.year = year;
  }



  @Override
  public String toString() {
    return "Car{" +
            "make='" + make + '\'' +
            ", model='" + model + '\'' +
            ", year=" + year +
            ", hybrid=" + hybrid +
            '}';
  }

  Car(String make, String model, int year, boolean hybrid){
  this.make=make;//this demek make variableni degistir demek
  this.model=model;
  this.year=year;
  if (year==2003){
    this.year=0;
  }
  this.hybrid=hybrid;
  if (hybrid==true){
    this.hybrid=false;
  }
}//class icinde sag generate toString sec ve hepsini sec.Yoksa yansitmaz
//Kendi Constructor olusturdugumuzda java default constructoru siler.
}
