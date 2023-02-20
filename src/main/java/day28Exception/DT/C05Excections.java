package day28Exception.DT;

public class C05Excections {
    public static void main(String[] args) {

//5)Arithmetic Exceptions

       divide(6,2);
       divide(5,0);

    }

    private static void divide(int a, int b) {
        try {
            System.out.println(a/b);
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
