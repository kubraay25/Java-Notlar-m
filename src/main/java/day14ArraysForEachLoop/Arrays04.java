package day14ArraysForEachLoop;

public class Arrays04 {
    public static void main(String[] args) {
        //iLkel yapilar hizlidir ve memory de az yer kaplar.Bunun icin primitive isimizi gorurse oncelik o
        //String array olustur 6 eleman ekle.Yellowdan onceki elemanlari yazdirin.

        String colors[]=new String[6];
        colors[0]="red";
        colors[1]="orange";
        colors[2]="blue";
        colors[3]="yellow";
        colors[4]="green";
        colors[5]="brown";

        for (String w:colors){
            if (w.equals("yellow")){
               break;
            }
            System.out.println(w);

        }

        //Example yellowdan sonrkileri yazdir.
        String color[]=new String[6];
        color[0]="red";
        color[1]="orange";
        color[2]="blue";
        color[3]="yellow";
        color[4]="green";
        color[5]="brown";
       //Tersden baslamamiz gerekiyor.O zaman forEacLoop Kullanamayiz.Cunku forEach herzaman bastan baslar.
        for (int i =color.length-1; i >=0 ; i--) {
            if (color[i].equals("yellow")){
                break;
            }
            System.out.println(color[i]);
        }

                     //2.yol yellowun indeksini bulalim fazlasini yazdiralim.
        int counters=0;
        for (String w:color){
            if (w.equals("yellow")){
                break;
            }
            counters++;
        }
        System.out.println(counters);
        for (int i =counters+1; i<color.length ; i++) {
            System.out.println(color[i]);
        }

    }//Main
}
