package day19Listsvarargs;

public class VarArgs01 {
    //VarArgslar metod olustururken parametre sayisinda bize esneklik saglar.
    //Metod olustururken parantez icine yazdigmiz degerlere parametre denir.
    //Metodu kallanirken parametre yerine kullanilan reel degerlere argument denir.
    //VarArgslar dipsiz kuyu gibidir.Doldurmak mumkun degildir.Sonsuzdur.
    //iki varargs metodda veya baska yerde isleme sokulamaz.Cunku ilki hic dolmaz.Ikincisi unreachable olur.
    //Javada unreachable kodlar hep hata verir.
    //Varargs varargs disindaki parametrelerle kullanilabilir
    //Fakat  ilk parametre siradan olmalidir.Varargs her zaman son parametre olmalidir.

    public static void main(String[] args) {

//var args variable argumans demek.

        addTwoNumbers(5, 7);
        addThreeNumbers(5, 7, 8);

        //4 sayiyi topla 5 sayiyi topla deyince yeni metod mu olusturacagiz.
        //Bu gibi durumlar icin varargs var

        add(5, 7, 8, 7, 9);//36 hepsini toplar.Istedigim kadar eklerim.0 elemanla tek elemanla da coklu elemanla da calisir.
      top("A",5,6,6,6,5,9);

    }//main

    //Iki sayiyi toplayan metod olustur.
    public static void addTwoNumbers(int a, int b) {
        System.out.println(a + b);//ekrana yansitmak metodun icerisinde var.
    }

    //uc sayiyi toplayan metod olustur.
    public static void addThreeNumbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int  ... a) {//data tipini yaz.sonra... varargs demek sonra varargsin adini giy.
        //varargs array gibi calisir ama array degildir.
        //... data tipinden sonra kullanilir.Sonra ad yazilir.
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        System.out.println(sum);
    }
      public static void top(String s,int... b){
          int sum1=0;
          for (int w:b){
              sum1=sum1+w;
          }
          System.out.println(s+sum1);
      }
}//class
