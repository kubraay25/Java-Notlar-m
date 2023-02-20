package day19Listsvarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lists03 {
    public static void main(String[] args) {
      //  List<Integer>numsList=Arrays.asList(5,8,2,9);//Kisaca elemanlari atadik.Ama
        //List olarak array(list gibi ma array) aslinda array gibi davranir.
        //Dolayisiyla artik bu listin eleman sayisini artik degistiremezsin.
        //Listde eleman sayisini degistiren hicbir metod artik bu metod icin kullanilamaz.
        //asList eleman sayisi belliyse kullanilabilir.
        //Listlerde guzel metodlar var eleman sayisi belirliyse aslist yap metodlari kullan.

        List<Object>numsList=new ArrayList<>();
        numsList.add(5);
        numsList.add(8);
        numsList.add(2);
        numsList.add(9);


        Scanner input=new Scanner(System.in);
        int counter=0;
        int num;
    do {
        System.out.println("Lutfen 1 ile 10 arasinda TamSayi Giriniz");
         num=input.nextInt();

        if (num==(0000 )){
            break;
        }
        else if (numsList.contains(num)){
            numsList.set(numsList.indexOf(num),"BINGO");//string ve int var ya object kullaniriz.Ya da rakmlari string yapariz.
            counter++;
        } else if(!numsList.contains(num) &&num<10 && num>-1) {
            numsList.add(num);
        }
    }while (counter!=numsList.size());
    if (num!=0000){
        System.out.println("Kazandiniz");
    }else {
        System.out.println("Oyundan Isteyerer Ayrildiniz Tekrar Bekleriz");
    }

        System.out.println("Finaly Report+ "+ numsList);


    }//main
}
