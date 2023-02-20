package day22StaticBlocksConstructors;

public class Student {
    String name;
    int age;
    int grade;
    String stdId;
    String adress;



    public Student(String name, int age, int grade, String stdId, String adress) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.adress = adress;
    }

    public Student(String name, String stdId) {
        this.name = name;
        this.stdId = stdId;
    }

    @Override
    public String toString() {//objeleri ekrana yansitmak icin buna ihtiyacimiz var.Icine degistirebiliriz,
        //Bu format default formatidir.Stringleri cikarabiliriz.Mesela returndan sonra yazan"Student" vardi sildim.
        return "" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", stdId='" + stdId + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
