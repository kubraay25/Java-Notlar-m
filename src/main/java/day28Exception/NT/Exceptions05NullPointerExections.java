package day28Exception.NT;

public class Exceptions05NullPointerExections {
    //0 yok demektir..Null izi bile hiclik demektir.Tuvalet kagidi kartonu ve kartonsuz tuvalet kagit koyacak yeri
    //String'in değeri null olduğunda String Class'taki bazı methodları kullanamayız. Kullanırsanız NullPointerException atar.

    public static void main(String[] args) {
    String s="Java";
    String t="";
    String u="null";

    getNumberOfChars(s);


    }
public static void getNumberOfChars(String a){
    int numberOfChars= 0;
    try {
        numberOfChars = a.length();
    } catch (Exception e) {
        System.out.println(e.getMessage());

    }
    System.out.println(numberOfChars);

}


}
