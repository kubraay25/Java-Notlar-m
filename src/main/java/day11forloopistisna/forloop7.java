package day11forloopistisna;

public class forloop7 {
    public static void main(String[] args) {
        //1 den 100 e kadar rakam kullanmadan yaziniz.
        for (int i='e'/'e';i<'e' ;i++){
        System.out.print(i);}
        System.out.println();
    //ornek
        for (int i=1;i<6;i++){//satir kontrolu
            for (int j=1;j<=i;j++){//rakam kontrolu
                System.out.print(j+" ");
            }
            System.out.println();//alt satira atti bos sout
        }
    for(int i=1;i<5;i++) {
        for (int j = 4; j >= i; j--) {
            System.out.print("*");
        }
        System.out.println();//her for cikista alt satira gonder.

    }
    //ORNEK
        for (int i=1;i<=5;i++){//satir icin
         for (int j=5;j>=i;j--){//bosluk icin
             System.out.print("o");//o yu boslukmus gibi gor. Sil bosluk yap
         }
            for (int k = 1; k <=i ; k++) {//yildiz kontrol
                if (k==1 || k==i){
                    System.out.print("* ");//en disdaki yildizlar
                } else if (i==5) {
                    System.out.print("* ");//en alt

                }else System.out.print("  ");//3. ve 4. satir
            }
            System.out.println();
        }//autfor


    }//main
}//class
