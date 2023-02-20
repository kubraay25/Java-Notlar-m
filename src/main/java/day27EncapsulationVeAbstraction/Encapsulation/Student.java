package day27EncapsulationVeAbstraction.Encapsulation;

public class Student {
    private  String stdId="AC123";
    private boolean succesfull=true;
    private  double gpa=3.99;

    /*
                ******Encapsulation yapilmis datayi okuyabilir miyiz?****
    1-get methodlar(getter) saklanmis datayi okumamizi saglar.
    2-get methodlar genelde public olur.
    3-get methodlarin return typi variable taypi ile ayni olur.
    3-get methodlarin isimleri get+variable name seklinde olur olur.
    3-get methodlarin typi boolean ise isimleri is+variable name seklinde olur olur.
    4-get methodlar parametre kullanmazlar.Cunku var olan datayi verirler.
     */

    /*Encapsulation yapilmis datalarin degeri degistirilebilir mi?Evet

    1-Generate setter ile degistirebiliriz.Kod dunyasinda set degistir demek.
    2-Set methodlari(setter) encapsulation yapilmis datanin degerin degistirmeye yarar.
    3-set methodlari genelde public olur.
    4-set methodlarin return typi her zaman void ayni olur.
    5-set methodlarin isimleri set+variable name seklinde olur olur.
    6-set methodlarin typi boolean ise de isimleri set+variable name seklinde olur olur.
    7-set methodlar variable ile ayni parametreyi kullanirlar.
    8.-Variable i runnerclassda degistirdim.
    9-Set method objedeki degeri degistirir.Static degil ya
    10-Set methodu ile bir kere olusmus object uzerinden sirasiylla geceriz.Memory tasarrufu.Isvec cakisi gibi


     */
   //getter nasil yapilir.Generate==>getter
   //setter nasil yapilir.Generate==>setter
    //Setter ve getterlarin ikisine birden Java Beans denir.
    public  String getStdId() {//get+Variable name
        return stdId;
    }

    public boolean isSuccesfull() {//is+variable name
        return succesfull;
    }

    public double getGpa() {//get+variable name
        return gpa;
    }

    public void setSuccesfull(boolean succesfull) {//set+variable name
        this.succesfull = succesfull;
    }

    public  void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
