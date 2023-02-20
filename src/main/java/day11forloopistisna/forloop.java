package day11forloopistisna;

public class forloop {
    public static void main(String[] args) {
        //Stringin Palindrom olup olmadigini kontrol ediniz.Soldan saga ve sagdan sola ayniysa
        String a="civic";
        String b="";
        for (int i=a.length()-1;i>-1;i--){
        b=b+a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)){
            System.out.println(a+"Palindrome");
        }else {
            System.out.println(a+"Non Palindrome");
        }
    }
}
