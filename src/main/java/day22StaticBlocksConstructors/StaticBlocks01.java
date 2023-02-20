package day22StaticBlocksConstructors;

public class StaticBlocks01 {

    //Bir variable olusturdugumuzda deger atamazsaniz o variable initialize[inisielayz] etmemissiniz demektir.
    //Initialize ileride yapilabilir.Mesela main icerisinde
    //Bazen main metod calistirilmadan once variablelarin hazir hale getirilmesi gerekir.
    //Static blocklar calisir.Mise en plece[mizanplas] gibi
    //Hicbirsey main metoddan once calismazdi.Fakat static Block calisiyor.
    //Yani static bloclarin main metoda onceligi var.Altinda olsa bile
    //Static block variablelarin main metod calismadan once hazir olmasini saglar.

    /*
    1-Static blocklar static variable lari initialize etmek icin kullanilir.
    2-Static blocklar herseyden once calisirlar.
     */

     static double pi;
    static String shape;

    static {
        pi = 3.14;
        System.out.println("Statick block 1 = "+pi);
    }




    public static void main(String[] args) {

        System.out.println("Main Method"+pi);

    }//main
     static{
    shape="Circle";
        System.out.println("Static block 2 = "+shape);
}
}
