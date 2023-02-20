package day02datatypesmethodcreation;

public class homework {
    public static void main(String[] args) {
        int sonuc1 = recktangle(5, 8);
        System.out.println(sonuc1);
        float sonuc2 = circle(3.14f, 7);
        System.out.println(sonuc2);
        float sonuc3 = circumference(3.14f, 7);
        System.out.println(sonuc3);
        float sonuc4 = heightWeightIndex(1.65f, 70);
        System.out.println(sonuc4);

    }

    public static int recktangle(int a, int b) {
        return a * b;
    }

    public static float circle(float n, int r) {
        return n * r * r;
    }

    public static float circumference(float n, float r) {
        return 2 * n * r;
    }

    public static float heightWeightIndex(Float h, float w) {
        return w / (h * h);
    }
}
////Diktörgenin alananı oluşturun
////Dairenin alanını oluştun.
////Dairenin çeveresini oluşturun.
////Boy kitle indeksini bulun
