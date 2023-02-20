package day03Scanner;

public class student {
    public String name="Ahmet SAAT";
    public int age=30;
    public String address="Rize";
    public void study(){
        System.out.println("Günü Gününe Ders Çalışır");
    }public void feed(){
        System.out.println("Sağlıklı beslenir");
    }

    public static void main(String[] args) {
        student ahmetSAAT=new student();
        System.out.println(ahmetSAAT.name);
        System.out.println(ahmetSAAT.address);
        System.out.println(ahmetSAAT.age);
        ahmetSAAT.study();
        ahmetSAAT.study();
    }
}
//obje üret
