package mentorpratic.Karisik;

public class tersucgenyildizli {
    public static void main(String[] args) {

    /*
         *
         * *
         *  *
         *   *
         *    *
         *     *
         *      *
         *     *
         *   *
         * *
         *
                           */

        //ilk kisim
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=i; j++) {
                if (j==1||j==i){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        //2.kisim
        for (int i =5; i >=1 ; i--) {
            for (int j =1; j <=i ; j++) {
                if (j==1||j==i){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }//main
}
