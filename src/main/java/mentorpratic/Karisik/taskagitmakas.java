package mentorpratic.Karisik;

import java.util.Map;
import java.util.Scanner;

public class taskagitmakas {
    public static void main(String[] args) {
        /*
Taş-Kağıt-Makas oyunu yazınız.
        -Oyuncudan tahmin alınız.
        -Bilgisayarın tahmini ile karşılaştırınız.
        -3'e ilk ulaşan kazanır
        -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.
 */


      Scanner input=new Scanner(System.in);
        String karar;
        int kullanicisayac=0;
        int pcsayac=0;
        do {

            System.out.println("Lutfen TAS, KAGIT , MAKAS giriniz");
            String secim=input.next();
            String[]tkm={"TAS","KAGIT","MAKAS"};
            String pc=tkm[(int)(Math.random()*3)];//0 1 2
            System.out.println(pc);


            if ((!secim.equalsIgnoreCase("tas")) && (!secim.equalsIgnoreCase("Kagit"))&&( !secim.equalsIgnoreCase("Makas"))){
                System.out.println("Tas, kagit ,makas seceneklerinden birini Giriniz");
            }else if ((secim.equalsIgnoreCase("Tas") && pc.equalsIgnoreCase("Makas"))||(secim.equalsIgnoreCase("Kagit") && pc.equalsIgnoreCase("Tas")) ||(secim.equalsIgnoreCase("Makas") && pc.equalsIgnoreCase("Kagit")) )
          {
              kullanicisayac++;
             if (kullanicisayac !=3){
                 System.out.println("Bu eli kazandiniz.Siz = "+kullanicisayac +" PC = "+pcsayac);
             }
             else {
                 System.out.println("SIZ = "+kullanicisayac+" PC = " +pcsayac+" OYUNU KAZANDINIZ. TEBRIKLER");
                 break;
             }

          } else if (secim.equalsIgnoreCase(pc)) {
                System.out.println("Berabere. SIZ = "+kullanicisayac+" PC = " +pcsayac);
            } else {
                pcsayac++;
                if (pcsayac !=3){
              System.out.println("Bu Eli Kaybettiniz.SIZ = "+kullanicisayac+" PC = "+pcsayac);

          }else {
                    System.out.println("SIZ = "+kullanicisayac+" PC = " +pcsayac+" KAYBETTINIZ.TEKRAR DENEYINIZ");
                    break;
                }
            }

        }while (true);

    }
}
