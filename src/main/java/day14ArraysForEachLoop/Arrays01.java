package day14ArraysForEachLoop;

public class Arrays01 {
    public static void main(String[] args) {
        //Example String Array olustur.Icine 5 eleman ekle.
        //Ilk eleman ile son elemanin icerdigi karakter sayilarinin toplamani yansit.

        String arr[]=new String[5];//5Arrayin eleman sayisi oluyor.
        arr[0]="Math";//ilk indekse atama yaptik.
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";
        System.out.println(arr[0].length()+arr[arr.length-1].length());
        //2. kisimda son eleman kodu yazdim.Bu ornekte 4 diyebilirdim.
        // Fakat dinamik olsun diye son eleman kodu yazdim.Sonra length ile karakter sayisini buldum.
        //Eleman eklemeden length karakter sayisini bulamaz.Cnku nullin karakeri o dir.
        //NOt/Arraylerdeki length metodunda parante kullanilmaz.Stringlerde kullanilir.

        //String olustur.Arraydaki tum karakter toplamini yansit.
        //1.yol
        String brr[]=new String[5];
        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Frankfurt";
        brr[3]="Dhaka";
        brr[4]="Athena";
        int totalchr=0;
        for (int i = 0; i <brr.length; i++) {//Arraylerle clisirken baslangic degeri 0dir.Cunku array indeks ile calisir.
           totalchr=totalchr+brr[i].length();
        }//for
         System.out.println(totalchr);
                              //2.yol
        //for-Each-Loop (Enhnced Loop)
        //for-Each-Loop Arraylerde ve collectionlarda kullanilir.
        //Bazen arraylerde bile for-Each Loop kullanamayiz.
        //Ozellikle index kullandigimizda for-Each-Loop hata verebilir.Diger looplara odaklanmaliyiz.
        //for-Each-Loopda degerleri java kendi girer.
       int sum=0;
        for (String w:brr){//Parantez icine 1.Arraydaki data tipni yaz.2. w ve : koy.3.Array ismini yaz.
                           //w yerine baska ifadede kullanilabilir.Ama genelde w kabul edilir.
            //Diger looplada dusunerek yazardik.Burada bakarak yazariz.
            //Yukarida ne olacak.w once brr arrayinin ilk datasi olacak.Yani miami.Asagida miami isleme girecek.
            //Sonra tekrar yukari cikacagiz.w brr arayinin 2. elemani olacak.Bu dongu son elemana kadar surer.
            //Arraydaki tum elemanlar bitince loop kirililir.Sonra souta gideriz.
            sum=sum+w.length();

        }//for
        System.out.println(sum);


    }//main
}
