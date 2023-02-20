package day19Listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {

   //Verilen bir listdeki elemanlari tekrarsiz olarak yazdiriniz.
        List<Integer>nums=new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(5);
      List<Integer>yenilist=new ArrayList<>();
        for (Integer w : nums) {
            if (!yenilist.contains(w)){//Degildir ifadesini koyduk.DIKKAT
              yenilist.add(w);
            }

        }
        System.out.println(nums);
        System.out.println(yenilist);
        Scanner input=new Scanner(System.in);
        List<String>products=new ArrayList<>();
        products.add("Tv");
        products.add("Radio");
        products.add("Ipad");
        products.add("PC");
        products.add("Notebook");
        products.add("Phone");
        int idx=0;
        for (String w:products){
            products.set(idx,w.toLowerCase());//Set  degistir
            idx++;
        }//Listi tolower case yaptim

        do {
            System.out.println("Aradiginiz Urunun Ismini Giriniz Cikmak Icin Q ya Basiniz");
            String product=input.nextLine().toLowerCase();
            if (product.equalsIgnoreCase("Q")){
                break;
            } else if (products.contains(product)){
                System.out.println(product+" Is In Stock");
            } else {
                System.out.println(product+" Out Of Stock");

            }
        }while (true);//kural yazmadan sonsuz loop yaptim.Nicin break sartini iceriye koydum.
        System.out.println("Sitemizi kullandiginiz icin tesekkur eder yeniden bekleriz");








    }//Main
}
