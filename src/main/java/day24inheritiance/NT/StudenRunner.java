package day24inheritiance.NT;

public class StudenRunner {
    public static void main(String[] args) {
       Student myStd=new Student();
        System.out.println(myStd.name);
        System.out.println(myStd.stdaccount);
        System.out.println(myStd.stdId);
        //Balance gormedi.Cunku private sadece ayni class.
        //Name public heryerde ulasilir.
        //Default sadece ayni package ulasir.
        //Protocted baska packageden sadece cocuklar ulasir.
        //Private sadece ayni classda gorulur.


    }
}
