package day27EncapsulationVeAbstraction.Encapsulation;

import day27EncapsulationVeAbstraction.Encapsulation.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student myStd=new Student();
        String stdId=myStd.getStdId();//getter yaptiktan sonra bu islemle aracin kaputunu actim datayi gordum
        //getter yapmasak goremezdik.Cunku data private idi.
        System.out.println("stdId = " + stdId);//AC123
         myStd.setGpa(3.5);//set metodu ile runner classda degisiklik yaptim
        System.out.println(myStd.getGpa());


    }
}
