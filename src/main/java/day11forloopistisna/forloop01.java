package day11forloopistisna;

public class forloop01 {
    public static void main(String[] args) {
        //ifadede a dan onceki kisimlari yansit
        //EQUALS sadece stringde kullanilir.Prmitivlerde == kullanilir.Char primitivdir.
         String s="Tramvay";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));//Tr
        }//for
        System.out.println();
        //Verilen stringde son a dan sonraki tum karakterleri yansit
        String str="Germany";
        for(int i=str.length()-1;i>=0;i--){
          char ch=str.charAt(i);
            if (ch=='a'){
                break;

            }//if
            System.out.print(ch);
        }//for





    }//main


}
