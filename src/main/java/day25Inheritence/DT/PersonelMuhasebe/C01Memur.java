package day25Inheritence.DT.PersonelMuhasebe;

public class C01Memur extends C03Muhasebe {
    @Override
    public String toString() {
        return "C01_Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", calismaSaati=" + calismaSaati +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                ", personelNo=" + personelNo +
                '}';
    }

    //Child Class(Sub)
    public static void main(String[] args) {

        C01Memur memur1 = new C01Memur();

        //GrandParenttan aldik
        memur1.isim = "Osman";
        memur1.soyisim = "Sagir";
        memur1.adres = "Izmir";
        memur1.telNo = "055544566";
        memur1.personelNo = 22555;

        //Parent Super
        memur1.calismaSaati = 8;
        memur1.saatUcreti = 100;
        memur1.statu = "Memur";

        System.out.println(memur1);


    }

}
