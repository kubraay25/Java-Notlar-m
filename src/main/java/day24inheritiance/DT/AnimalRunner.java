package day24inheritiance.DT;

import day23DateTimeStringBuilder.Monkeyday24DT;

public class AnimalRunner {
    public static void main(String[] args) {
        //Cat clasini DtAnimale extend yaptigim icin DtAnimali de goruyor.
        //Obje Classa extend yapmaya gerek yok.Kendiliginden gelir.
        //Cocuk Babaya extend yapsin dede kendi gelir.
        //Dog ve Bird e de extend yaptim.

        //Inheritance
            //Cod tekrarlarindan kurtuluruz.
        //Child Classlari daha atomik yapmis oluruz.
        //Bir classi baska bir classin Child Classi yapmak icin extends keyword kullanilir.
        //Child class objecteki ve extendeki classa ulasabilir.Ama yukaridan child classa ulasilamaz.Evlatlik mirasi gibi
        //Object class haricinde her classin extendsi vardir.
        //Object Class her classin parentidir.

        //eat protect, drink default yapildi
        //breath i private yapsadim olmzdi.Cunku sadece ayni classda okunur.


        Cat tom=new Cat();
        tom.meow();//Cat Class
        tom.breath();//Extend DtAnimal Class
        tom.drink();//Extend DtAnimal Class
        tom.eat();//Extend DtAnimal Class

        Bird cik=new Bird();
        cik.tweet();//Bird Class
        cik.breath();//Extend DtAnimal Class
        cik.drink();//Extend DtAnimal Class
        cik.eat();//Extend DtAnimal Class

        Dog hav=new Dog();
        hav.bark();//Dog Class
        hav.breath();//Extend DtAnimal Class
        hav.drink();//Extend DtAnimal Class
        hav.eat();//Extend DtAnimal Class

        Monkeyday24DT mami=new Monkeyday24DT();
        mami.monkey();
        mami.breath();
        mami.eat();//Protected farkli packec de de da olsa child tarafindan gorunur.
        //drink gormez cunku defalut farkli packec de gormez

        //Kapsami genisten aza dogru public-protocted-default-private


    }
}
