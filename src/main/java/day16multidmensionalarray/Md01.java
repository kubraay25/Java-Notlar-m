package day16multidmensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
 //array icinde array olusturacagiz.Arrayin elemnlari da array olacak.
 //Bu tarz arraylara multidimensionarray(iki boyutlu array) denir.
 //arrayleri 3 boyutlu da yapabiliriz.Buna da triedimensionalarray denir.Ama cok kullanilmaz.
 //[[5,12],[81,45],[123,0]]//ilk inner arrayin indeksi 0 ikincisinin 1 3.sunun ise 2dir.
 //yukarida 5in indeksi inner arraye gore 0 12 1dir.81 0 45 2 dir.123n 0 0 nin 1 dir.
 //Peki arraylerin disindayken inner arrayin 1. indeksine nasil ulasiriz.Once distan indeks sonra icten indeks al
 //mesela 12 esittir   a[0][1](a array adi.)  81 esittir a[1][0]  0 esittir a[2][1]
 //disdaki array`e outer array icteki array`e de inner array denir.

//multiDimensionArry nasil olusur

        int a[][]=new int[3][2];//kac boyutluysa okadar koseli parantez lazim.
//inner arraylerin hepsi ayni eleman icermeli farkli ise farkli yontemler var.
        System.out.println(Arrays.toString(a));//adres verir.Nicin auter arrayin elemani olan inner arrayin adresini verir.
        //Md arrayler bu sekilde yazilmaz.deepToString kullnilir.
        System.out.println(Arrays.deepToString(a));
   //MD arraylere eleman nasil eklenir.

        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        System.out.println(Arrays.deepToString(a));

                                              //NOT:

        // Array non primitive datadir.
        //Arraylere non-primitive data konulamaz.Referance ya da primitive data konur.
        //Heap cok buyuk bir orman.Java orada kaybolma olmasin diye adresi stack icine kaydeder.
        //Arraye string koydugumuzda aslinda array icerisine stringin adresini koyariz.
        // Adresler nonprimitive degil primitivdir.
        //Arrayi yazdirmak istedigimizde java adresler yardimi ile nonprimitive dataya ulasir.
        //Ve o non-primitive datayi arrayin icerisindeymis gibi gosterir.


        //MD Arreylerdeki belli elemanlara nasil ulasilir.

        System.out.println(Arrays.deepToString(a));//[[5,12],[81,45],[123,0]]
        System.out.println(Arrays.toString(a[2]));//[123,0]
        System.out.println(a[1][0]);//81
        System.out.println(Arrays.toString(a[0]));//[5,12]
        System.out.println(a[2][0]);//0

    }//main
}
