package day21StaticKeyWord;
//Ogrencinin isimlerinin ad ve soyadinin ilk harflerini veren static metodu olustur.
//ogrenci isimlerindeki sesli harfleri sayan instance metod yapiniz.
//runnera git
public class methodstatic {


    public static String getInitials(String name) {
        String first = name.substring(0, 1);//1 dahil degil //charAt[0] da kullanabilirdik.substring yerine
        String second = name.split(" ")[1].substring(0, 1);//Bol ikinci bolunenin ilk indexisini al
        return first + second;
    }

    public int countWovels(String name) {
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.toLowerCase().charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
            }

        }
    return counter;
    }

}
