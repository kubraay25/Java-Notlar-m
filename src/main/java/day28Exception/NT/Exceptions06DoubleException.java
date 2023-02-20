package day28Exception.NT;
/*
 1-Try kisminda birden fazla exception olusturma ihtimali olan kod varsa coklu catch kullanabiliriz.
 2-Coklu catch kullandigimizda exception classlar arasinda parent child iliskisi yokse catchlerin sirasi onemsizdir.
 a- Ama koddaki siralamaya uymak gerekir.Yani yukarida once bolme varsa try a onunla baslasin.
 3-Coklu catch kullandigimizda exception classlar arasinda parent child iliskisi varsa catchlerin sirasi onemlidir.
  a-  Child olan class uste olmalidir.Cunku child hatasini yakaladiktan sonra parent de kendi hatasini yakalar.
  b-  Ya da Parent her hatayi yakaladigi icin childi da try e koymayabiliriz.Sadece Parenti koyariz.
  c-  Once parent sonra child koyarsak child unreachable olur.Bu da CTE verir.
 4-Once yazilmanin onemi nedir?Cunku
 1-try icinde exception alinca ilgili catche girer.Sonra try icinden cikar.Iki hata olsa da ilkini gorur.
 2- Diger hatayi da gormek istiyorsak bir try daha yapmak gerekir.
 3-Hatalar ayni anda olusmamissa hangisinde hata vara onun catcine girer.


 */





public class Exceptions06DoubleException {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        String s="My Java";
        getCharFromString(s,a,b);

    }
public static void getCharFromString(String s,int a,int b){
       try {
           int idx=a/b;

        char ch=s.charAt(idx);
    System.out.println(ch);
       }catch (ArithmeticException e){
           System.out.println("Dont divide by zero");
           System.out.println(e.getMessage());
       }catch (StringIndexOutOfBoundsException e){
           System.out.println("Olmayan Index Kullandiniz");
           System.out.println(e.getMessage());

       }
}


}
