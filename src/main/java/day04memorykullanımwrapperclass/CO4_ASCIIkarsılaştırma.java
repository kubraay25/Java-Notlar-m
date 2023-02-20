package day04memorykullanımwrapperclass;

public class CO4_ASCIIkarsılaştırma {
    public static void main(String[] args) {
        byte b=125;
        float f=2.455f;
        long l=5655566;
        char ch='h';
        System.out.println(l>ch);//true
        System.out.println(b<f);//false
        System.out.println(f>b);//false
        System.out.println(b>ch);//true
    }
}
