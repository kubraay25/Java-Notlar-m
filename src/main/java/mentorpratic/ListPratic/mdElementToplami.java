package mentorpratic.ListPratic;

public class mdElementToplami {
    public static void main(String[] args) {
        //Soru 3:Verilen multidimensional array in tum elementlerin toplamini bulunuz
        int arr[][]={{3,1,7},{6,10,2}};
        int top=0;
        for (int[]w:arr){
            for (int z:w){
                top+=z;
            }
            System.out.println(top);
        }


    }
}
