package day20passbyvalueoverloading;

public class PassByValue02 {
    public static void main(String[] args) {

        String name = "Tom Hanks";
        String updatedName=updateName(name,"Jr");
        System.out.println(updatedName);//Tom Hanks Jr
        System.out.println(name);//Tom Hanks
        name=updatedName;
        System.out.println(name);//Tom Hanks Jr


    }//main

    public static String updateName(String name, String add) {
        name += " " + add;


        return name;
    }


}//class
