package day30ExceptionsInterface.Interface;

public class City implements AC,Engine,Security{
    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }

    @Override
    public void run() {
        System.out.println("AC runs Perfect");
    }

}
