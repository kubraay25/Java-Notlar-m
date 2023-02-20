package day23DateTimeStringBuilder;

public class StringBuilder01 {
    public static void main(String[] args) {


        //Javada string. String class kullanilarak ya da string builder class kullanilarak olusturulabilir.
        //String class ile olusturulan stringler inmutabledir.(Degistirilemez)
        //Stringbuilder class ile olusturulan stringler mutabledir.(Degistirilebilir)
        //Strinhbuilder ayri bir class oldugu icin kendi metodlari vardir.
        //Mesela append stringdeki concat gibidir.
        String s = "Java";//string
        String t = s + "j";
        String w = t + "kk";//Her degisiklikte tekrar container olusturuyoruz.

        String a = "money";
        a = a + "more";//Burada bile yeni container olusur.Adres artik eski a dan yeni aya gecer.
        //Garbage collector da adresi olmaya containeri sildigi icin eski a silinmis olur.


        //SitringBuilder ile string uretmenin 1.yolu

        StringBuilder sb = new StringBuilder("Builder");
        sb.append("b");//Her append orjinal degeri degistirir.Oldurur.Orjinal degeri korumak istemiyorsak builder uygundur.
        System.out.println(sb);//Builderb
        sb.append(5);
        System.out.println("sb = " + sb);//Builderb5 sb herseferde degisiyor.Container ve adresi hem sabit.


        //SitringBuilder ile string uretmenin 2.yolu

        StringBuilder sb2 = new StringBuilder();//Bos bir string de olusturabiliriz.Sonra append yapariz.

        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16//Stringbuilder olusturuldugunda java otoatikmen 16 bos kutu verir.
        //Bu yuzden capacity 16 der.
        sb2.append("Builder");

        System.out.println(sb2.length());//7
        System.out.println(sb2.capacity());//16
        sb2.append("555555555555");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 nicin 19 degil yeni bir capacity alani ekledi.
        //Nasil ekler var olanin iki katinin 2 fazlasi 16*2+2 capacity artiminda hep boyle yapar.
        sb2.append("555555555555555555");
        System.out.println(sb2.length());//37
        System.out.println(sb2.capacity());//70 var olan capasity 34du. 34*2+2=70
        //capacity yine asilirsa 70*2+2 den 142 yine asarsa 142*2+2 den 286 yapar.

        //SitringBuilder ile string uretmenin 3.yolu

        //Bos stringbuilder olusturursam java capacity 16 yapar.Peki ben capacity 16 olmasin diyebilir miyim?Certainly
        StringBuilder sb3 = new StringBuilder(2);//constructor icine tamsayi yazilirsa capacity belirlenmis olur.
        sb3.append("555l222");
        // capacity 2 kural olarak capacity ben belirlersem belirledigimin *2+2

        sb3.insert(3, "xxx");//ilk 3 karakteri es gec sonra stringi yaz.ofset karakter index degil.
        System.out.println(sb3);//555xxx222
        //insert() methodu verilen sayi karakteri kadar es gecip istenen characteri eklemeye yarar.
        //insert() methodu append() gibi StringBuilder'i direkt degistirir

        //tostring metodu Stringbuildere stringe cevirir.Peki ama Nicin
        // Split gibi bazi metodlar builderda yok.Onun icin stringe gecebiliriz.sonra buildera gec yine
        sb3.toString().split("l");
        StringBuilder sb4 = new StringBuilder(sb3);//Stringi yeniden stringbuilder yaptim
        //reverse
        // Stringi tersen yaz deyince iki sey diyebiliriz.Loop ile de yapariz builder ile de yapabiliriz.
        sb4.reverse();
        System.out.println(sb4);//222lxxx555

        //deleteCharAt()
        sb4.deleteCharAt(2);//Builderda, verilen karakteri sil.=22lxxx555
        //delete
        System.out.println(sb4.delete(1, 3));//1.indez ile 3. index arasini sil.1 ve 2. indexi siler=2xxx555
        // Javada genelde ilk verilen index dahil 2. verilen  index  haric olur.

        StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6 = new StringBuilder("Java");
        StringBuilder sb7 = new StringBuilder("Kava");
        //compareTo String builderlari alfabetik olarak karsilastirir.
        sb5.compareTo(sb6);//0
        sb5.compareTo(sb7);//-1 bir geri demek Lava olsa -2 iava yapsak +1 olurdu.Java java olsa -62 olur cunku ascii bakar
        //2 karakter farkli olsa once ilk karaktere bakar cunku ilk farkliysa 2.ye bakilmaz.

        //setCharAt verilen indexdeki karakteri degistir.
        sb6.setCharAt(2,'m');//Jama;

        //replaca fazla karakter degisir
        System.out.println(sb6.replace(1, 3, "xx"));//Jxxa

        //Stringbuilderclassda kullanmamiza izin verilen bazi string metodlari vardir.Sringe cevirmeden de gozukur.
        // substring metodu string clasin metodudur.Builder metodu degil.
        //String metodlari da inmutabla dir.Yani bu metodlarla da stringin orjinal degeri degismez.
        //Bunlar ise yeni container olusturup atama yapmak gerekir.
        //Builder metodlari ise mutable oldugu icin orjinal degerleri degisir.
        //nereden anlarim hangisinin metodu.Java builder metotlarini koyu strin metodunu ligth yapmis."." koy bak.



    }
}
