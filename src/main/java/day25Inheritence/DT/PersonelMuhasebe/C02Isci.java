package day25Inheritence.DT.PersonelMuhasebe;

public class C02Isci extends C03Muhasebe {
    //Child Class(Sub)
    protected String isciStatu="Surekli Isci";
    protected String mesai(){
        System.out.println("isciler Her Cagrildilarinda Haftada 5 Gun Calisir");
String str="Fazla Mesai";
        return str;
    }


    public static void main(String[] args) {

     C02Isci isci1=new C02Isci();

        isci1.isim = "Ahmet";
        isci1.soyisim = "Korkmaz";
        isci1.adres = "Istanbul";
        isci1.telNo = "761247124";
        isci1.personelNo = 2000;


        isci1.calismaSaati = 7;
        isci1.saatUcreti = 30;
        isci1.isciStatu="Dev";
        System.out.println(isci1);
    }

    @Override
    public String toString() {
        return "C02_Isci{" +
                "Saat Ucreti=" + saatUcreti +
                ", Statu='" + isciStatu + '\'' +//Degistiridim.Isci Statu yaptim
                ", Calisma Saati=" + calismaSaati +
                ", isim='" + isim + '\'' +
                ", Soy isim='" + soyisim + '\'' +
                ", Adres='" + adres + '\'' +
                ", Tel No='" + telNo + '\'' +
                ", Personel No=" + personelNo +
                ", mesai()=" + mesai() +
                '}';
    }
}
