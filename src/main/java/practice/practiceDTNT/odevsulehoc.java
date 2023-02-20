package practice.practiceDTNT;

public class odevsulehoc {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j =1; j <=i ; j++) {
                if (j==1 || j==i){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }//autfor
        for (int i =6; i >0 ; i--) {
            for (int j =1; j <=i; j++) {
                if (j==1||j==i){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }//autfor
    }//main
}//class