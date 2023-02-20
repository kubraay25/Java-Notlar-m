package mentorpratic.Karisik;

public class Arraytekrarsayisi {
    public static void main(String[] args) {
       // Belirli bir sayının bir arrayde kaç kez tekrarlandığı  bulan Java programını oluşturun.

   int arr[]={3,5,3,7,8,9,1,0,0};
   int sayac=0;
   int num=2;
   for(int w:arr){
       if (w==num){
           sayac++;//1
       }
   }//for
   System.out.println(sayac);   //-10


    }//main
}
