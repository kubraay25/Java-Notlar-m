package day26OverRiding.AnimalMammalCat;

public class Animal {

    public void eat(){//overridden method
        System.out.println("Animals eat...");
    }

    public void drink(){//overridden metod
        System.out.println("Animals drink...");
    }

    public Animal create(){//overridden metod
    return new Animal();
    }
    public int add(int a,int b){//overridden metod
    return a+b;
    }
    public Integer multiply(int a,int b){
        return a*b;
    }
}
