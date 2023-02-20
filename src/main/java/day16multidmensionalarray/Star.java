package day16multidmensionalarray;

public class Star {
    public static void main(String[] args) {
        //  yildiz yap
        //Bu tur sorulardaonce sekli diktdorgene tamamlayalim.
        for (int i =1; i <=5; i++) {

            for (int bosluk =i; bosluk <5 ; bosluk++) {
                System.out.print(" ");
            }
            for (int m=1; m <=2*i-1 ; m++) {

                if(i==5 || m==1 || m==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }





    }//Main
}
