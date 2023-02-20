package practice.nighttime06;

public class bos {
    public static void main(String[] args) {
        String str="alacan";
   String arr[]=str.split("");
     int sum=0;
   for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length; j++) {
                if (arr[i].equals(arr[j])){
                    sum++;
                }


            }
            System.out.println(arr[i]+"" +sum);
             sum=0;


        }





    }

}
