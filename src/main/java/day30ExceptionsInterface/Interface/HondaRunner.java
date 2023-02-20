package day30ExceptionsInterface.Interface;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic=new Civic();
        myCivic.cool();
        City myCity=new City();
        myCity.cool();
        System.out.println(AC.price);
        System.out.println(Engine.price);
        System.out.println(Security.price);

    }

}
