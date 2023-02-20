package mentorpratic.Karisik;

public class paralelkenar {
    public static void main(String[] args) {
     /*     *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *    */

        for (int i =1; i <=7; i++) {
            for (int bos =6; bos >=i ; bos--) {
                System.out.print(" ");

            }
            for (int j = 0; j <=13; j+=2) {

            for (int k =1; k <=j ; k++) {

                        System.out.print("*");


            }}
            System.out.println();

        }





    }//main
}
