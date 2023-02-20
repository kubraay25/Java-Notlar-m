package day21StaticKeyWord;

import java.util.List;

public class StdRunner {
    //Her classa main metod konulmayabilir.Main metod konulan class ile diger classlarda calisir.
    //Main metod konan clasa runner class denir.
    //runner classa diger classlar cagrilir.

    public static void main(String[] args) {

        System.out.println(StudentClass.stdname);//stdname diger classda static oldugu icin class ile goruntuledik.
        StudentClass std1=new StudentClass();//age static degildi onun icin classinin ismi ile std1 objesi olusturdum.
        System.out.println(std1.age);//std1 objecti ile age instance variable ina ulastik.

String deger=methodstatic.getInitials("Ahmet Saat");//Static oldugu icin class ismi ile gozuktu.Objeye gerek kalmadi.
        System.out.println(deger);
methodstatic obj=new methodstatic();
int wovels=obj.countWovels("Ahmet Saat");//Instance metod icin object olusturdum.Ve onunla cagirdim.
        System.out.println(wovels);//kactane unlu harf oldugunu gosterdi.

       List <String> names= List.of("Ali","veli","deli","5");//List clasina static of metodunu cagirdim.List olustumanin kisayolu
        System.out.println(names);//[Ali, veli, deli, 5]
    }//main
}
