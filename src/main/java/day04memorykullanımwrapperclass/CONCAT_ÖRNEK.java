package day04memorykullanımwrapperclass;

public class CONCAT_ÖRNEK {
    public static void main(String[] args) {
        char ornek='s';
        Character Wrappornek=ornek;
        Boolean ısOld=true;
        boolean unWrapısOld=ısOld;

        //Javada + işareti bazen toplama bazen birleştirme yapar.
        //Eğer rakam varsa + toplama yapar.Rakam yoksa String varsa birleştirir(Concatenation).
        //"5" ifadesi java için rakam değil resimdir.Çünkü "" varsa stringdir.
        //Concatenation ın sonucu her zaman string çıkar.
        //"A"+7==>"A7"
        //3+5+"K"==>"8K" Soldan gelir.2 rakam var toplar.Sonra string var concat yapar.
        //"J"+5+12==>"J512" soldan gelir.String görür.String + rakam concat olur.
        //"K"+3*5==>"K15" soldan gelir ama işlem öceliğinden önce sağdaki çarpım yapılır.Sonra Concat olur.

        //İki Stringin fiyatının toplamını giriniz?
        System.out.println("Ali" + "Can");
        String shirt="2300";
        String shoes="5200";
        System.out.println(shirt + shoes);//sonuc "23005200"  String olduğu için toplamadı concat yaptı.
        //İki stringi nasıl toplayacağız o zaman Valuof metodunu kullanarak Stringi İnteger yapacağız.
        int toplamFiyat=Integer.valueOf(shirt)+Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500 Çünkü stringi integere çevirip topladık.

    }
}
