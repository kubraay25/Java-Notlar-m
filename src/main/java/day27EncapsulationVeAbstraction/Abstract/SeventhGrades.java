package day27EncapsulationVeAbstraction.Abstract;

public class SeventhGrades extends Courses{
    @Override
    public void math() {
        System.out.println("Seventh Grades Math");
    }//override yapmak zorunlu.Cunkus abstract method

    @Override
    public void art() {//Kendim cagirdim.Zorunlu degil
        System.out.println("Writing");
    }
    //istege bagli override da solda mavi ici o ve oklu sekil
    //Zorunlu override da solda yesil ici i(implement) oklu sekil.


}
