package day11forloopistisna;

public class forloop2 {
    public static void main(String[] args) {
        //Verilen Stringde a karakteri haric tum karakterleri yazdiriniz
        String b="MADAGASTAR";
        //1.YOL
        String t=b.replace("A","");
        System.out.print(t);
        System.out.println();

        for (int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            if(ch!='A'){
                System.out.print(ch);

            }

        }//for
        System.out.println();
        //3.yol
        for (int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            if(ch=='A'){
                continue;//atla gec demek
            }
            System.out.print(ch);
        }



    }//main
}
