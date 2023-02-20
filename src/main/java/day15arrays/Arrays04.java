package day15arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Bir arrayda herhangi bir eleman var mi varsa kac kere
        int a[]={0,2,3,0,12,0,};//Kisa yoldan array olusturdum
        int num=0;//bunu degistirebiliriz.Scanner yapmadim
        int counter=0;
        for (int w:a) {
            if (w == num) {
                counter++;
            }

        }//for
    if (counter>0){
        System.out.println(num+" arryda "+counter+" defa var");

    }else {
        System.out.println(num+" arrayda yok");
    }




    }//main
}
