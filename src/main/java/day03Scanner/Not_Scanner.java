package day03Scanner;

import java.util.Scanner;

public class Not_Scanner {
    public static void main(String[] args) {

    //Jva bir çok Library var. Util library IO library gibi
    //Util Library içerinde bir çok clas var. Scanner Class Arrays Class gibi
    //Scanner Class kullanıcıdan bilgi alıp kodlamamızı sağlar.
    //İmport java.util.Scanner=> Javanın Util kütüphanesinden Scanner Classı import edildi demek.
    //Niçin constructor içine "system.in" koyduk.İmport edilen bilgiyi Java Sisteminin içine koy demek.

    //Class İsmi     Obje İsmi   Atama Operatörü      "new"keyword           constructor
     Scanner             input         =                     new            Scanner(System.in);
        System.out.println("LÜTFEN YAŞINIZI GİRİNİZ");
        //byte diyerek inputtaki bilgiyi sakladığımız yere koyduk.Sakladığımız dataya age adını verdik.
        //Kullanıcının verdiği bilgi nextbyte e geldi.= onu age e attı.
        //TOPARLAYALIM
        //1-Scanner Class'dan obje oluştur.
        //2-Kullanıcıya ne istediğinize dair mesaj veriniz.
        //3-Uygun metod kullanarak kullanıcının verdiğidatayı memorye yerleştir.
        //4-Sonra ister paylaş ister kodla
        //next() methodu kullanıcıdan tek kelimeli string almak için kullanılır.
        // Kullanıcının girdiği tüm satır için nextline()
        //Kullanıcıdan çoklu sayı istiyorsak sout 2,3.. giriniz denir. nextli kısmı birden fazla yapılır.
        byte age=input.nextByte();
        System.out.println("Yaşınız="+age);
}
}
