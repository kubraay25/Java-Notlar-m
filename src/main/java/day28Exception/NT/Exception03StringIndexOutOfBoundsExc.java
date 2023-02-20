package day28Exception.NT;

public class Exception03StringIndexOutOfBoundsExc {
    public static void main(String[] args) {
        String s = "Java";
        getCharFromString(s,2);
        getCharFromString(s,4);

    }
    public static void getCharFromString ( String s,int idx){
        char ch= 0;
        try {
            ch = s.charAt(idx);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan Index kullandiniz "+e.getMessage());
            System.out.println(e.getCause());//bazilarinda hata sebebini soylecek.
           e.printStackTrace();//try yapilmadan onceki hatalar detayli verilir.Hatanin seceresini verir.

        }
        System.out.println(ch);

    }
}
