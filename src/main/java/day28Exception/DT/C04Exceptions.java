package day28Exception.DT;

public class C04Exceptions {
    public static void main(String[] args) {


        //NullPointerExceptions

        //Bir stringde bulunan karakter sayisini veren kodu yaziniz.
        String str = "Fatma";
        String str2 = "";
        String str3 = null;
        getNumOfChars(str);
        getNumOfChars(str2);
        getNumOfChars(str3);

    }

    private static void getNumOfChars(String str) {
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Lenght() hata olustu");
            e.printStackTrace();
        }

    }

}
