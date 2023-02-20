package day23DateTimeStringBuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {
        //EXP Time i formatlayiniz.
        LocalTime mytime = LocalTime.now();
        System.out.println(mytime);//21:39:55.192214600
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm-ss a");//hh saat 12 ye kadar a=> pm am de yaz demektir.
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm--ss ");//HH saat 24 e kadar.ss saniye demek

        System.out.println(dtf.format(mytime));//09-43 PM


    }//main

}
