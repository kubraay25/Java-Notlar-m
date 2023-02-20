package day09incrementdecrementternaryswitch;

public class Switch01 {
    public static void main(String[] args) {
        //gun ismini verince kacinci gun oldugunu yazdir.
        String dayName="Tuesday";
        if (dayName.equalsIgnoreCase("sunday")){
            System.out.println("1");
        }else if(dayName.equalsIgnoreCase("Monday")){
            System.out.println(2);
        }else if(dayName.equalsIgnoreCase("Tuesday")){
            System.out.println(3);
        }else if(dayName.equalsIgnoreCase("Wednesday")){
            System.out.println(4);
        }else if(dayName.equalsIgnoreCase("THURSDAY")) {
            System.out.println("5");
        }else if(dayName.equalsIgnoreCase("friday")) {
        System.out.println("6");
    }else if(dayName.equalsIgnoreCase("saturday")) {
        System.out.println("7");
    }else{
            System.out.println("Tanimlanmamis");
        }

        //                        2 YOL SWITCH
        //Variable degerine gore degis diyoruz.
        switch (dayName.toLowerCase()){//ToLowerCase ile verilen gunu kucuk harfe cevirdim.Caseleide oyle yap.
            case "sunday":
                System.out.println("1");
                break;
            case"monday":
                System.out.println("2");
                break;
            case"tuesday":
                    System.out.println("3");
                    break;
            case "wednesday":
                System.out.println("4");
                break;
            case"thursday":
                System.out.println("5");
                break;
            case "friday":
                System.out.println("6");
                break;
            case "saturday":
                System.out.println("7");
            default:
                System.out.println("Lutfen gecerli br gun giriniz");

        }






    }//main
}
