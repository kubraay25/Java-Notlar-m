package practice.practiceDTNT;

public class odevsuleh2 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int bosluk = 5; bosluk >= i; bosluk--) {
                System.out.print(" ");//0 yerine bosluk
            }
            for (int j =1; j <=5 ; j++) {
                if (j == 1|| j==i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }System.out.println();
        }//autfor
        for (int i=5; i>=1; i--) {
            for (int bosluk = 5; bosluk >= i; bosluk--) {
                System.out.print(" ");//0 yerine bosluk
            }
            for (int j =1; j <=5 ; j++) {
                if (j == 1|| j==i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }System.out.println();
        }//autfor
    }//Main
}//class
