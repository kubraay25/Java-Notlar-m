package day25Inheritence.DT.Lessons;

public class A03Art extends A04Lessons {
    public A03Art() {//LessonRunner bana gonderdi
        this("dd");//Bana geldiginde parametreli Arta gonderdim
        System.out.println("Parametresiz Art Calisti");
    }

    public A03Art(String X) {//Parametresiz Art Bana Gonderdi
          super();//Parent paremetresize gonderdim.Yani Lessona
        System.out.println("Parametreli Art Calisti");
    }
}
