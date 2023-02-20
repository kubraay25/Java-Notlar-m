package day36Lambda;

public class Utils {
public static int getLengthSquare(String s){
    return s.length()*s.length();
}
public static boolean isLengthEven(String s){
        return s.length()%2==0;

    }
    public static boolean isNumberEven(Integer s){
        return s%2==0;

    }

public static String getLastchar(String s){
   return s.substring(s.length()-1);
}
public static void printInTheSameLineWithSace(Object obj){
    System.out.println(obj+ " ");
}
    public static int getSumOfDigits(int x){
        int sum = 0;
        while(x!=0){
            sum = sum + x%10;
            x = x/10;
        }
        return sum;
    }

}
