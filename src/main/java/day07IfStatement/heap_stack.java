package day07IfStatement;

public class heap_stack {
    public static void main(String[] args) {
        String s="Tom";
        String t="Terry";
        String m="Tom";
        String r=new String("Tom");
        //non primitive datalar heap memoryde kalir.
        //Heap daki stacka aktarilinca stack verinin adresini saklarki onu hepda bulabilsin.
        //s==t dersen java adrese ve degerlere bakar.Biri Farkliysa farkli der.
        //s.eguls(t) ise sadece degerlere bakar.Deger farkli farkli der.
        //s==r de adres farkli; deger ayni ama sonuc farkli deger.
        //s.eguals(r) is degerler ayni oldugu icin ayni der.
        //Stack(small memory) heap(huge memory)
        //== sembolu iki string karsilastirirken hem adrese hem de degerlere bakar.
        //Iikisi de ayni ise ayni der.Biz string karsilastirirken sadece degerlerle ilgileniriz.
        //Bu yuzden == yerine equals kullaniriz.Cunku stringlerde == ifadesinde risk vardir.
        //String r yi new string ile aktarim yapmazsak adresler ayni olur.

                                        //UYGULAYALIM

        System.out.println(s==t) ;//false cunku degerler ve adresler farkli
        System.out.println(s.equalsIgnoreCase(t));//false cunku degerler farkli
        System.out.println(s==r);//false cunku adresler farkli
        System.out.println(s.equalsIgnoreCase(r));//true cunku degerler ayni
        System.out.println(s==m);//true cunku degerler ve adresler ayni
        System.out.println(s.equalsIgnoreCase(m));//true cunku degerler ayni
    }
}
 