package day11forloopistisna;

public class forloop3 {
    public static void main(String[] args) {
        //Stringi tersden yazdiriniz
        String str="Germany";
        String ters="";
        for (int i=str.length()-1;i>=0;i--){
        ters=ters+str.charAt(i);

        } System.out.print(ters);//loopdan sonra koyarsak son halini goruruz.
        //Butun degisimi adim adim gormek istiyorsak loopun icine koyariz.Her islemden sonra yansir.

    }//main
}
