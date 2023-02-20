package day06stringmanupulationsifstatemen;

public class Stringmanupulation01 {
    /* Example: Bir stringin bas ve son karakterinde spaca varsa siliniz.
     */

    public static void main(String[] args) {
        String s=" Ali Can ";
        System.out.println(s);
        /*trim methodu bir stringin bas ve sonundaki spaceleri siler*/
        String sTrimmrf=s.trim();
        System.out.println(sTrimmrf);
        /*Example. asagida bilgileri verilen fiyatlari giriniz
         */
        String tv1="$456.99";
        String laptop1="$875.99";
        String tv2= tv1.replace("$","");
        System.out.println(tv2);//456.99
        String laptop2=laptop1.replace("$","");
        System.out.println(laptop2);//875.99
        Double totalPrice=Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98
        //Example Verilen ismin ismin ilk harfini ve soyisminin ilk harfini buyuk harf yaz yaz.
        String name="  ali can ";
        char first=name.trim().toUpperCase().charAt(0);
        char secondname=name.trim().toUpperCase().split(" ")[1].charAt(0);
        //splint kes demek.Bosluktan kestim.Kesilen yer gider, oncesi ve sonrasi kalir.oncesi 0 sonrasi 1 olur///
        System.out.println(first);//A
        System.out.println(secondname);//C
        System.out.println(""+first+secondname);//Neden " koydu char ascii alir.Concat yaptik.
        //EXAMPLE.Stringin hic karakter icermedigini kontrol et
        String x="";
        //1 YOL
         boolean result1=x.length()==0;
        System.out.println("String Hic Karakter Yok = " + result1);
         //2. YOL
       boolean result2=x.isEmpty();//isempty metodu boolean verir.
        System.out.println("String Hic Karakter Yok = " + result2);
        //
       String h="  ";
       //1. yol
        boolean sonuc4=h.replace(" ","").isEmpty();

        //2.YOL
        boolean sonuc5=h.replace(" ","").length()==0;

        //3/yol isBlank metodu spce ve hicbisey icin true verir/
        boolean sonuc6=h.isBlank();









    }
}
