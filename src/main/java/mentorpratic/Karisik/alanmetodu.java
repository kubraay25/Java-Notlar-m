package mentorpratic.Karisik;
// Method Creation
public class alanmetodu {


     public static int dikalan(int a,int b){
        return a*b;}

    public static int dikcevre(int a,int b){
       return 2*(a+b);
    }
    public static double dairecevre(double r,double p){
     return r*2*p;
    }
    public static double dairealani(double r,double p){
     return p*r*r;
    }
    public static void main(String[] args) {

        System.out.println(dikalan(7,8));
        System.out.println(dikcevre(5,7));
        System.out.println(dairecevre(5,3.14));
        System.out.println(dairealani(5,3.14));

        //Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini yazdirin
        long hucreagirligi=25555555;
        long amipagirligi=12222222;
        System.out.println(hucreagirligi-amipagirligi);
        //Sehir ismi icin bir variable olusturun ve bir deger atayip yazdirin.
        int rize=300000;
        System.out.println(rize);



    }//main
}//class
