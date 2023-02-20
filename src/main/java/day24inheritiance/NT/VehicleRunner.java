package day24inheritiance.NT;

public class VehicleRunner {
    public static void main(String[] args) {
        Honda myHonda = new Honda();
        // Honda=>Car=>Vehicle seklinde multi level inherit olusturdum.
        //Herbirine constructor koydk
        //Bu clasta main atayim Honda Clasinda obje olusturdum
        //Calistirdigimda conslar dededen basladi.Yani once vehicle consu sonra car consu en son honda consu
        //Her Constructorim bodysinde gorunmez bir super(); vardir.Yani parenti varsa oraya cikar.
        //Paretntin parenti de varsa ona cikar.Artik grand parentten yazdirmaya baslar.Sonra childe duser.
        //Java en tepeye gorunmeyen super();ile cikar.

    }
}
