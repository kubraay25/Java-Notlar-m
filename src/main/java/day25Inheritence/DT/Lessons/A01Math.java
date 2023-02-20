package day25Inheritence.DT.Lessons;

public class A01Math extends A04Lessons {
    public A01Math(){
        super("str");
    System.out.println("Math Constructor");
    }

    public A01Math(int a){
        this();//Parente gitme bulundugu classdaki diger consu calistir.
        System.out.println("Parametreli Constructor");
    }


}
