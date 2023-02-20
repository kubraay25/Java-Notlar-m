package day06stringmanupulationsifstatemen;

public class Stringmanupulation02 {
    public static void main(String[] args) {
//Example.Stringde a,e,i karakterlerinin ilk gorunumlerinin indeks toplamini yaz
        String r="Java is easy to learn";
        //indexof stringin istenilen karakterin ilk gorunumunun indexini verir/
        int indexa=r.indexOf("a");//indexler integerdir 1
        int indexi=r.indexOf("i");//5
        int indexe=r.indexOf("e");//8
        System.out.println("Indeksler toplami="+(indexa+indexe+indexi));//14

        //Examle.Bir stringde "Java" kelimesin ilk olarak kacinci index de kullanilmaya baslandi.
        String u ="Ah Java Vah Java Sensiz Olmuyor Java";
        int uindex=u.indexOf("Java");
        System.out.println(uindex);//3 verir.Java orada baslar.Kelimenin ilk harfinin indexini verir.

        //indexof indexde olmayan karakter icin -1 verir
        int xyz=u.indexOf("xyz");
        System.out.println(xyz);//-1 verir,

        //String de a,e, karakterlerinin son gorunumlerinin index tolamini yaziniz/
        String f="Java is easy to learn";
        int fsona=f.lastIndexOf('a');//18
        int fsone=f.lastIndexOf('e');//5
        int fsoni=f.lastIndexOf('i');//17
        System.out.println(fsona+fsoni+fsone);//40

        //Stringdeki tekrarsiz karakterleri ekrana yazdir
        //Indexof ile lastindexof esitse tekrarsizdir/
        //Bazi kodlarin sarti calismasi icin if statement(cumle) kullaniriz.
        String l="abbcc";
        char ch1=l.charAt(0);
        if (l.indexOf(ch1)==l.lastIndexOf(ch1)){
            System.out.println(ch1);}
            char ch2=l.charAt(1);
            if (l.indexOf(ch2)==l.lastIndexOf(ch2)){
                System.out.println(ch2);}
                char ch3=l.charAt(3);
                if (l.indexOf(ch3) == l.lastIndexOf(ch3)) {
                    System.out.println(ch3);}

                //Sayi 3 basamakli ise ekrana wow yazdirin
        int j=-855;
        j=Math.abs(j);
        if(j>99 && j<1000){
            System.out.println("waoww");}
// Javada math clasinda abs(absolute value) mutlak deger demek.


        }




    }

