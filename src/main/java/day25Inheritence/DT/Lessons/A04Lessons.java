package day25Inheritence.DT.Lessons;

public class A04Lessons {
    public void liveSession(){
        System.out.println("Parametresiz Lesson Method");
    }

    public A04Lessons() {//Art bana gonderdi
        this("s");//Ben de parametreli lesson gonderdim
        System.out.println("Parametresiz Lesson");
    }//Default bos cons

    public A04Lessons(String level){//Parameteli lesson bana gonderdi
        this.liveSession();//Bu classda livesession methoduna gonderdim
        System.out.println("Parametreli Lesson");
    }//Parametreli cons

}
