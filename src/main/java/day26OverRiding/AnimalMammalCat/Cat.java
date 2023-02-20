package day26OverRiding.AnimalMammalCat;

public class Cat extends Mammal {
    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override
   public void eat() {//overriding method
        System.out.println("Cats eat...");
    }

    @Override//childa override edilmis metoda override metot denir.Parenta override edilene overridden denir.
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Cat create() {//Return typini degistirdir.Animal==>Cat yptim.mammal da yapabilirdim.
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a+b;
    }
}
