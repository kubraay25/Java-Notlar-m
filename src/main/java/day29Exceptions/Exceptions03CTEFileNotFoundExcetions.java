package day29Exceptions;

import java.io.FileInputStream;//io==>input output
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03CTEFileNotFoundExcetions {

  /*
        1)FileNotFoundException ve IOException Compile Time Exception'lardir, yani code'u yazarken hata aliriz.
        2)FileNotFoundException path'in dogrulugu ve dosya'nin varligi ile ilgilidir.
          IOException tum input ve output islemleri ile ilgilidir.
        3)IOException Class, FileNotFoundException Class'in parent'idir.
        4)Istenirse FileNotFoundException yerine IOException da kullanilabilir.
        5)IOException Class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte, IOException altta kullanilmalidir.
     */


    public static void main(String[] args) {
        //javaya adrese git dedigimizde iki sorun olusabilir.Adres yanlis olabilir.Ya da dosya silinmis olabilir.
       //ya throws yapariz ya da throw
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day29Exceptions\\File01.txt");
            int k=0;
            while ((k=fis.read())!=-1) {//read metodu hic karakter kalmadiginda -1 verir.Yani metin bitince -1 verir.
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {//Iki Catchden child olani yukari koydu.
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            System.out.println("IO Exceptions Hatasi");
        }
        System.out.println();
        System.out.println("HI");
    }
}
