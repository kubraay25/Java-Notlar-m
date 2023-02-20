package day23DateTimeStringBuilder;

public class StringBuffer01 {
    public static void main(String[] args) {

        /*String olusturmak icin string class,StringBuilder class la birlikte StringBufferda kullanilabilir.
        1== StringBuffer javanin string uretmek icin olusturdugu ilk classdir.Java 5 de uretilmistir.
        2-StringBuffer sychronized dir.Builder degildir.
        3-StringBuffer thread-safe dir.Builder degildir.
        4=StringBuffer ve StringBuilder ikisi de mutabledir.

       *******************Thread-safe nedir?
       -Java bir anda birden fazla is yapabilir.Buna multithread denir.
       -Multihreadin basarili olabilmesi icin isleri siraya koymak gerekir.Yani sychronized olmalidir.
       -Thread safe de multi-threada uygun demektir.


      >>>>>>>>>>>>Not
      1-Ummutable String lazim olursa String Class
      2-Mutable String Lazim olursa
      a-Multithread ve synchronizatioun lazimsa Buffer
      b-Multithread ve synchronization lazim degilse StringBuilder

      //Builder bufferdan daha basittir ve daha hizlidir.
                                                                                               */


        //StringBuffer olusturalim
        // Builder gibi olustururuz.Metodlar da builder ile hemen hemen ayni.
        //Bufferi devler kullanacak.QAlar fari bilsin yeter.
        //Bir stringi birden fazla gorevde kullanmak istedigimizde buffer kullanacagiz.

        StringBuffer sbf=new StringBuffer("Java");
        System.out.println(sbf);//Java

    }//main
}
