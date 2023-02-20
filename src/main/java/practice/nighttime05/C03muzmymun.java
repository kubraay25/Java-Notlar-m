package practice.nighttime05;

public class C03muzmymun {
    public static void main(String[] args) {

        int hayat=1;
        int banana=165;
        boolean monkeylive=true;
        do {
            System.out.println("***Maymunlar yasamak icin gunde muz yer ");
            banana-=4;
            System.out.println("Kalan Muz Sayisi="+ banana);
            hayat++;
            if (banana<4){
                monkeylive=false;
                System.out.println("Bugun "+hayat+".gun maymun oldu.");

            }else {
                System.out.println("Bugun "+hayat+".gun maymun hayatta");
            }
        }while (monkeylive);



    }//main
}
