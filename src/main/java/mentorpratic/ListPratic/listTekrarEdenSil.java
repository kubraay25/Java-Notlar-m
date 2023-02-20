package mentorpratic.ListPratic;

import java.util.ArrayList;
import java.util.List;

public class listTekrarEdenSil {
    public static void main(String[] args) {
        //Soru 8:Verilen bir listede tekrar eden sayilari sadece bir kere yazdiran bir mehod olusturun
        List<Integer> lst1=new ArrayList<>();
        lst1.add(1);
        lst1.add(3);
        lst1.add(5);
        lst1.add(3);
        lst1.add(5);
        lst1.add(7);
        lst1.add(3);
        lst1.add(10);
        lst1.add(3);
        lst1.add(9);

        int baslangic=lst1.get(0);

        for (int i =1; i <lst1.size() ; i++) {
            for (int j=i;j<lst1.size();j++){
                if (baslangic == lst1.get(j))
                {
                    lst1.remove(j);}
            }
            baslangic=lst1.get(i);
        }
        System.out.println(lst1);








    }
}
