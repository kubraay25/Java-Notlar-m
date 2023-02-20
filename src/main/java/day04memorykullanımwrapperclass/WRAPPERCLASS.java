package day04memorykullanımwrapperclass;

import java.nio.ByteBuffer;

public class WRAPPERCLASS {
    //primitiv data tiplerinde sadece dğer vardır. Metod yoktur.Javanın bunun için çözümü vardır.
    //Primitiv data türlerini non-primitiv olarak kullanabilmek için özel classlar oluşturmuştur.
    //java primitivlere metod ekleyerek  Wrapper class oluşturmuştur.
    //Primitive                            Wrapper
    //byte             ===>                  Byte
    //short            ===>                  Short
    //long             ===>                  Long
    //float            ===>                  Float
    //double           ===>                  Double
    //boolean          ===>                  Boolean
    //char             ===>                  Character
    //int              ===>                  Integer
    public static void main(String[] args) {
        byte primitiveByte=12;//nokta koydugunda metod gelmez.
        Byte wrapperByte=12;//nokta koydugund metodlar gelin.Aşağıda
        wrapperByte.byteValue();
        //byte data tipinin en küçük ve en büyük değerini ekrana yazdırın
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        //Primitivelerin Wrapper Classa çevrilmesine Autoboxing denir.
        //Autoboxing nasıl yapılır?
        float f1=13.99f;//primitive
        Float wrapperf1=f1;
        //primitive f1 aşağıya indirdik.Atama ile wrapperf1 e attık.
        //Wrapper Classlar primitive nasıl çevrilir.Buna unboxing denir.
        //autoboxing ve unboxing java tarafından otomatik yapılır.
        Character wrap1='s';
        char primitiveWrap1=wrap1;
        //Örnek 2 string datanın toplamını yazın?
        String str1="12345";
        String str2="67859";
        System.out.println(str1+str2);//123456789 oldu.Yani concat yaptı.
        //Toplamak için ne yapacağız.Wrapper Integer kullanalım.valueof ile değer bula git.
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));

    }
}
