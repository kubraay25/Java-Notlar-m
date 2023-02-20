package day30ExceptionsInterface.Exceptions;

public class Exceptions3 {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int c[] = {3, 6, 9, 12};
        m(c, a, b);
    }

    public static void m(int[] c, int a, int b) {
        try {
            int idex = a / b;
            int element = c[idex];
            System.out.println(element);
        } catch (Exception e) {//Exception en genel yani en parent exception classidir
            System.out.println(e.getMessage());
        }

    }

    public static void getStudentGrade(int grade) {
        if(grade<0||grade>100){
            try {
                throw new InvalidStudentGradeException("Students Grade cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                System.err.println(e.getMessage());
            }
        }else {
            System.out.println(grade);
        }
    }


}
