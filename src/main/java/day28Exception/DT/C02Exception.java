package day28Exception.DT;

public class C02Exception {
    public static void main(String[] args) {

        //2)StringOutOfBoundExections

        //stringin indeks datasini getir.
        char ch=getCharFromString("Hakan",5);


    }
   private static char getCharFromString(String str, int i){
        char c=' ';
       try {
           c=str.charAt(i);
       } catch (Exception e) {
           System.out.println("String Out Of Bound Exeptions" );
           System.out.println(e.getMessage());

       }
       return c;
   }



}
