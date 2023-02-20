package day16multidmensionalarray;

public class Md05 {
    public static void main(String[] args) {
    //bir md array olustur.Bu arraydeki tum elemanlarin carpimi yaz.
    int a[][]={{2,3},{1,2},{1,1,2,2}};
        int carpim=1;
    for (int[] w:a){

        for (int k:w){
            carpim=carpim*k;
        }
    }
    System.out.println(carpim);


    }//main
}
