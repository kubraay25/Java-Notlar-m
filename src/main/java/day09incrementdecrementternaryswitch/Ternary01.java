package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
       int r1=a<7 ? a++: b++;//r1 20 olur. b calistigi icin 21 olur.a calismadi 10 olur.
       int r2=a<7 ? ++a:++b;

        System.out.println(r1);//20 oldu nicin post increment var.
        System.out.println(r2);//22 nicin 22  oldu cunku b yukarda 21 oldu sonra pre increment var.
        //Example Verilen sayinin mutlak degerini hesaplayin
        int c=-4;
        int r3=c<0 ? -1*c : c;//-1<0 o halde ilk olan yansir.
        System.out.println(r3);//4 olur.
        System.out.println(c);

                              //EXAMPLE
        //2 sayinin isareti ayni ise bu sayilari carpan farkli ise farkli isaretleri sayilari carpamiyorum mesaji
        int m=5;
        int n=-6;
        Object r4=(m*n)>0 ? m*n : "Farkli isaretli sayilari carpamiyorum";//string olmaz int de var int de olmaz string var.
        System.out.println(r4);
    //Farkli data tiplerinde Object olustur.Yani Object cogunu kapsar.Objecti kapsayan yoktur.
    //Her data tipinin kapsayani vardir.Ama objectin yoktur.Object her data tipinin kapsayanidir.

                                    //EXAMPLE
        //verilen sayinin 3 basamakli olupolmadigini ontrol et.
        int sayi=-254;
        boolean kural=(sayi>99 && sayi<1000) || (sayi<-99 && sayi>-1000);
        String deger=kural ? sayi +"\tUc basamakli sayidir":sayi+"\tUc basamakli sayi degildir";
        System.out.println(deger);

    }//main
}
