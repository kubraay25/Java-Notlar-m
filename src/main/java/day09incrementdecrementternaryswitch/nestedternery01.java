package day09incrementdecrementternaryswitch;

public class nestedternery01{
    public static void main(String[] args) {
    //Verilen yilin artik(leap yil) yil olup olmadigini kontrol et.
        // 1.yil 100 e bolunuyorsa 400 e de bolunmelidir.
        //yil 100 e bolunmuyorsa 4 e de bolunmelidir.
        int yil=2004;
        Object leapyil=(yil%100==0) ?(yil%400==0 ? "leap yil":"leap yil degil"):(yil%4==0 ? "leap yil":"leap yil degil");
        System.out.println(leapyil);
      //icice gecirdik.ilk ternary de soru isaretinden sonra diger ternary yaz.3.ternary de sonrasinda yaz.

    }//main
}
