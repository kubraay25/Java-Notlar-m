package day37lambda.NTLambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 90, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

//1)Tum average skorlarin 91 den buyuk olup olmadigini kontrol eden kod
        boolean result =
                coursesList.
                        stream().
                        allMatch(t -> t.getAverageScore() > 91);
        System.out.println(result);

        //herhangi bir coursename de turkish var mi
        boolean result2 =
                coursesList.
                        stream().
                        anyMatch(t -> t.getCourseName().contains("Turkish"));
        System.out.println(result2);

        //en yuksek averageScore yazdir
        String result3 =
                coursesList.
                        stream().
                        sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                        findFirst().
                        get().
                        getCourseName();
        System.out.println(result3);

        //

        List<Course> list =
                coursesList.
                        stream().
                        sorted(Comparator.comparing(Course::getAverageScore)).
                        skip(2).//ilk ikisini atla diyor
                        collect(Collectors.toList());
        System.out.println(list);

        List<Course> list2 =
                coursesList.
                        stream().
                        sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                        limit(3).//limit isteneni verir.
                        collect(Collectors.toList());
        System.out.println(list2);

        Course result4 =
                coursesList.
                        stream().
                        sorted(Comparator.comparing(Course::getAverageScore)).
                        skip(2).
                        limit(1).
                        findFirst().
                        get();
        System.out.println(result4);




    }//main


}
