package day20passbyvalueoverloading;

public class dt {
    public static void main(String[] args) {


    //passbyvalue metoda valuenin bir kopyasini gonder demektir.
    //bu nedenle passbyvalue da orjinal parametre degismez.
    //java pasbyvalue kullanir.
    //1-java variablenin orjinal degeri korumak ister.
    //2-java variablenin icindeki degeri kopyalar ve metodun icine kopya degeini gonderir.
    //deger uzerinde yapilan degisiklikler orjinal parametreyi etkilemez.
    //Pass by referance kullanan programlarda ise referance kopyalanir ve metodda kullanilir.
    // Yani yapilan degisiklik orjinal parametriy etkiler.Bu programlar degeri koruma isini developera birakmistir.
 int gomlek=100;
   ogrenciindirimi(gomlek);
        System.out.println("gomlek = " + gomlek);//gomlegin hala 100.java metodun icine kopyasini gonderdi.
        //ogrenciGomlegi ise 90 tl oldu.

        //gomlek degerini degistirmek istersem assigment yapmam lazim.
       gomlek=ogrenciindirimi(gomlek);//gomlek icin atama yaptim
        System.out.println("gomlek = " + gomlek);//gomlegim artik 90 oldu.

    }//main

private static int ogrenciindirimi(int gomlek){
        int ogrenciGomlegi=gomlek-10;
    System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);//90
    return ogrenciGomlegi;
}
}
