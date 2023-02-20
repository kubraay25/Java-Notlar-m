package day09incrementdecrementternaryswitch;

public class incrementdecrement01 {
    public static void main(String[] args) {
        //Variable degerini ileride artirmk istiyorsak buna increment denir.

        int a=5;
        System.out.println(a);//5
        a=a+2;//atama operatoru sagdaki degeri sola atayacak a 7 olacak
        System.out.println(a);//7 cunku increment yaptik.
                        //increment yapma yolu
        // a=a+2 ya da a+=2 java ayni variable tanimak istemez.islemle operator arasina bosluk koyma.
        //Example. Bir int variable olustur ve onu 2 sekilde 5 artirin
        int b=7;
        b+=5;//12 oldu
        b=b+5;//17 oldu
        b++;//18 oldu.Bu sadece 1 artirimda kullanilabilir.1 artiracaksak en cok bu kullanilir.
        System.out.println(b);//7+5+5+1 18 lur.
       //Ayni mantikla decrement de yapariz.
       int c=20;
       c=c-5;//15 olur
       c-=5;//10 lur
       c--;//9 olur.Bu sekilde sadece bir azaltma olur. 1 azaltcaksak en cok bu kullanilir.
        System.out.println(c);//20-5-5-1 9 olur.
    //increment carpa ile de olur.Amac arttirmak
        int d=6;
        d=d*2;//12
        d*=2;//24
        System.out.println(d);//6*2*2 24 olur
        //decrement bolme ile de olur.Amac azaltmak
        int f=12;
        f=f/2;//6
        f/=2;//3
        System.out.println(f);// 12/2/2 3 yapar.

                       //POST INCREMENT VE PRE INCREMENT
        int i=10;
        int k=i++;//postincrement cunku once variable sonra increment yazildi
        //Java okudugu kisim anlamli ise hemen yapar.Burada i yi hemen k icine koydu.
        //Sonra ++ gordu ama o onu ilgilendirmez.O iye eklenir.
        //Sonucta k 10 i 11 olur.
        System.out.println("k="+k);//10
        System.out.println("i="+i);//11

        int m=15;
        int n=++m;//preincremen cunku once increment sona variable gelir.
        //Java icin okudugu anlamli ise islem yapar.
        //Atama operatoru sonra artirma var.Anlamli degil.Devam eder m nin artirilmis halini alir.
        //m 16 olur.n de 16 olur.
        System.out.println("m="+m);//16
        System.out.println("n="+n);//16

    }//main
}
