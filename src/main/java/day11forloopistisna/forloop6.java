package day11forloopistisna;

public class forloop6 {
    public static void main(String[] args) {

        /*
    Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
*/
        //haftalar tekrar ediyor.Gunler de haftalar icinde tekrar ediyor.Nestedloop
        //loop icine loopda iki i kullanamazsin
        for (int i=1;i<4;i++){
            System.out.println("WEEK:"+i);
            for (int k=1;k<8;k++){
                System.out.println("Day:"+k);

        }//innerloop

        }//autlopp




    }
}
