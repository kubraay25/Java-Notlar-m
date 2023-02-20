package day10Switchloops;

public class Loops01 {
    public static void main(String[] args) {
        //EXAMPLE1=Ekrana 5 kere "hi" yazdirin.

        //                                 1 YOL
        System.out.print("Hi");
        System.out.print("Hi");//1.kod repetition almamali 2.dinamic olmali 3.fix ve update kolay olmalidir.
        System.out.print("Hi");//Javada tekrar istenmez.
        System.out.print("Hi");//kod degisime acik olmalidir.Mesaj degisilmek istense ne yapacagiz,
        System.out.println("Hi");//Kod dinamik olmalidir.1000 kere denilse 1000 kere yazarak mi duzeltecegiz?

        //                               2.YOL LOOPS

       //dorttane loop vardir.1=for-loop/ 2=while-loop, 3=do-whilw-loop, 4=for-each loop

        //                                  FOR-LOOP
        //for-loopda parantez icine 3 bolum yazilir.1-Baslangic degeri 2-sart  3-increment-decrement

        //         baslangic degeri        loop calisma sart              increment?derement          sout mesaji
           for (    int i=1               ;       i<6                    ; i++                  )     {
               System.out.println("hi loap");
           }
           //Java soldan geliyor.I variable olusturduk ve 1 dedik.For-loop genelde i variale kullanir.
           //i<6 sarti dogru oldugu icin java loopa girer.Mesaji verir.I yanlis oldugu anda biter.
           //increment-decrement bolumunde i yi 1 artir der.artirir.i 2 sart yine dogru hi yazdirir.
           //sonra tekrar increment olur 3 6 dan kucuk bu boyle sart yanlis olana kadar devam eder.
           //for-loopda baslangis degeri 1 kez diger yerler cok kere calisir.
           //diledigin zaman sarti diledigin zaman mesaji degistirebilirsin.
           //Istisnalari var sonra deginilecek.

        for (int i=11;i<45;i++){
            System.out.print(i);
        }
        //EXAMPLE 40 dan 23 e kadar cift sayilari yaz.
        for (int i=40;i>22 ;i--) {if (i%2==0){System.out.print(i);}}
        //diger sarti if ile soutla yazariz.

        //EXAMPLE 18den 56 ya kadar tek sayilari yazdir.
        for (int i=18;i<57;i++){if (i%2!=0){
            System.out.print(i);
        }}
    }//main
}//class
