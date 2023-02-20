package day25Inheritence.DT.PersonelMuhasebe;

public class C03Muhasebe extends C04Personel {
    //parent Class(Super)

    protected int saatUcreti;

    protected String statu;

    protected  int calismaSaati=8;

    protected int maasHesapla(){
      int maas=saatUcreti*calismaSaati*30;
   return maas;
    }

}
