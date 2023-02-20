package day10Switchloops;

public class Loops02 {
    public static void main(String[] args) {

        for (int i=21;i<181; i++){if (i%4==0 && i%6==0){
            System.out.println(i);
        }
        }
           //verilen stringin indeksi cift olanlarin harfni buyuk harf ya.
        String s="ankara";
        for (int i=0;i<s.length(); i++){
            String ch=s.substring(i,i+1);
            if (i%2==0){
            System.out.println(ch.toUpperCase());}
           }
        //Yukarida neler oldu
        //0 stringin ilk indeksi onun ile basladik.son indekse kadar gidecegiz.Son indeks dahil.
        //Karakter sayisini length ile bulduk.sartimizi yazdik.Son indekste dahil oldugu icin -1 demedik.
        //substring ne diyor burada?
        //i al i+1 alma diyor.Nicin oyle dedik.O dan basliyor.
        //sonra if ile degeri cift olanlari buyuk harfe cevir dedik.



        //Yazilan kod belli senaryolar icin calisiyr tum senaryolar icin calismiyorsa hard-code vardir.
        //Hard-code yanlis yazilmis koddur.Mutlaka duzeltilmelidir.
        //Bir string de son indeks length nin bir eksigidir.Nicin indeks 0 ile baslar.
        //Length methodu karakter sayisini verir.Indekste 0 da oldugu icin length son indeksten bir fazla olur.
        //son index=length-1

    }//main
}
