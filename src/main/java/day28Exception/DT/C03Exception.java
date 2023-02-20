package day28Exception.DT;

public class C03Exception {
    public static void main(String[] args) {

        //3)ArrayIndexOutOfException
        //Bir string arrayden verilen indexdeki datayi donduren method
        String arr[]={"ali","berna","can","tarik"};

        getElementFromArray(arr,2);//pozitive scenario

        getElementFromArray(arr,4);//negative scenario



    }
private static void getElementFromArray(String[] a,int i){
    try {
        System.out.println(a[i]);
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println("sout err renklidir");
    }

}


}
