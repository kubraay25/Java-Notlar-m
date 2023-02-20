package day28Exception.NT;

public class Exceptions02NumberFormatExc {
    public static void main(String[] args) {
        String s = "1234";
        String t = "12a34";

    convertStringToInt(s);
    convertStringToInt(t);
    }

    //Icinde rakamlar disinda character olan bir String'i sayiya cevirmek isterseniz Java "NumberFormatException" atar.
    //Exectionlar data ve classdir.Onundeki e ise objenin adidir.Baska bir isim de verebiliriz.
    //e.getmessage() dedigimize gore getmessage static metod degildir.
    public static void convertStringToInt(String s) {
        int intS = 0;
        try {
            intS = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Do not enter characters other than numbers");
            System.out.println(e.getMessage());
        }
        System.out.println(intS + 1);
    }


}
