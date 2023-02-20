package day22StaticBlocksConstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    //Javanin taih ve zamani iceren classi vardir.
    //Date classi ve time clasi ayridir.Java util kutuphanesinde bizi beklerler.
    public static void main(String[] args) {
        Date myDate=new Date();
        System.out.println(myDate);//Sat Jan 07 23:27:12 EET 2023
        System.out.println("myDate.getTime() = " + myDate.getTime());//1673123300607
//gettime bize 1 ocak 1970 den beri gecen milisaniyeleri verir.Dijital tarih bu tarihte basladigi icin.
//milisaniye surekli degisir.Yani essizdir.Herseferde degisir.Bunun icin bazen kullanirlar.Essiz no koyarken

       //icinde bulundugumuz an nasil alinir.Current time? Yerel tarihi istiyorum mesela bazi yerellerde farklidir.
        System.out.println("LocalDate.now() = " + LocalDate.now());//2023-01-07
       //Yerel zamani da LocalTime.now ile aliriz.
        System.out.println("LocalTime.now() = " + LocalTime.now());//23:34:45.409166600
//Bulundugum yerdeki tarih ve zaman
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());//2023-01-07T23:36:15.345514200
//Buradan tokyonun tarih ve saatini ogrenebilir miyim
        System.out.println( LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:49:23.717437700

        //ILeri pir tarihe nasil gideriz
        System.out.println( LocalDateTime.now().plusYears(7));//2030-01-07T23:50:26.019497100
        System.out.println(LocalDateTime.now().plusYears(2).plusMonths(5).plusDays(2));//2025-06-09T23:51:48.152185100
    //Geriye gidelim
        System.out.println(LocalDateTime.now().minusYears(4).minusMonths(10).plusDays(1));//2018-03-08T23:54:41.826294400
//ILeri zamana nasil gidilir.
        System.out.println(LocalTime.now().plusHours(8).minusSeconds(45));//07:57:13.813623600
   //Zamanda belli bir bolumu nasil aliriz.Sadece saat ve dakika
        System.out.println(LocalTime.now().getHour()+":"+LocalTime.now().getMinute());//0:2
        System.out.println(LocalDate.now().getDayOfMonth() + ":" + LocalDate.now().getMonthValue());//8:1
//Iki tarih karsilastir
        boolean snc=LocalDate.of(2005,7,12).isBefore(LocalDate.of(2007,3,1));
        System.out.println(snc);//True ilk tarih oncedir.IsAfter desek false verirdi.
    //Tarih formati degistir.
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");//mm minute MM month
        System.out.println(dtf.format(LocalDate.now()));//08/01/2023
        //DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yyyy");//Ayin tek rakami yazar 1 M harfi
        //DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy");//Ayin ilk 3 M harfi
        //DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");//Ayin tum ismini yazar 4 M harfi
        //DateTimeFormatter dtf=DateTimeFormatter.ofPattern("d/MM/yyyy");//Gunun tek rakamini yazar 1 d
        //3 4 d yok
        //yy koyarsak yilin sin 2 rakamini verir.
        DateTimeFormatter orn=DateTimeFormatter.ofPattern("d-MMM-yy");
        System.out.println(orn.format(LocalDate.now()));//8-Jan-23



    }//main
}
