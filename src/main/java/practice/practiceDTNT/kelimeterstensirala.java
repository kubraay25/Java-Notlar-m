package practice.practiceDTNT;

import java.util.Arrays;

public class kelimeterstensirala {
    public static void main(String[] args) {

/*
Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
tersine çevirmek için kod yazınız.
Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
        */

        String str ="Kemal Can Kuzu";
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));


    }//main
}
