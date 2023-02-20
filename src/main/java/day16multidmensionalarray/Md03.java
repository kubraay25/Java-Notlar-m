package day16multidmensionalarray;

public class Md03 {
    public static void main(String[] args) {

        int a[][]={{2,62,82},{3,13}};
        int sum=0;
         for (int[] w:a){//a dan w ye w den k ye
            for (int k:w){//w den k ye aktarilir tek tek
                sum=sum+k;

            }

         }
        System.out.println(sum);
        //md arraylerde elemanlara birer birer ulasmak istiyorsak nested loop kullanmaliyiz.
    }//main
}
