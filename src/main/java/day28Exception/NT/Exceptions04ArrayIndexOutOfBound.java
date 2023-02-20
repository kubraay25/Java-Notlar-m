package day28Exception.NT;

public class Exceptions04ArrayIndexOutOfBound {
    public static void main(String[] args) {

        String arr[] = {"A", "G", "M", "L"};
    getElementFromArray(arr,1);
    getElementFromArray(arr,5);
        System.out.println("hi");//Handle etmezsek hatada kod durur.Bunu gormez.Handle edersek devam eder.
        //once catch icindeki ciktiyi verecek.Sonra da bu mesaji
        //e.printStackTrace() ise en sona yansitir.

    }
public static void getElementFromArray(String[] s,int idx){
    String al= "";
    try {
        al = s[idx];
    } catch (Exception e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
    System.out.println(al);
}

}
