package day05typecastingstringmanupulation;

public class SwapValues {
    //Swap yer değiştirmek demek.1tabaktaki patatesle 2. tabaktaki domatesi değiştiririz.
    //Değişim için 3. bir boş tabakta lazım.a yı boşa b yi aya boştakini bye

    public static void main(String[] args) {
        int a=12;
        int b=5;
        //a'nın 5 b'nin 12 olmasını istiyorum Swap yapacağız.

        int temp=0;
                                         //////1.YOL
        //1.adım
        temp=a;//atama operatörü sağdakini sola atar.a yı boşa koydum
        //2.adım
        a=b;//b yi a ya koydum.
        //3.adım
        b=temp;//boştakini aya koydum
                       /////////2. YOL
        //Eğer 3 tabak yoksa nasıl yapılır. Genelde tercih edilen yöntemdir.
        //a ve b yi a da toplarız a=a+b sonra b=a-b sonra a=a-b
        int x=12;
        int y=5;
        //Swap yap
        x=x+y;
        y=x-y;
        x=x-y;

    }
}
