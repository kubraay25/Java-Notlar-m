package day33maps;

import java.util.*;

public class HashMaps01 {
    /* unique(yünik)--> eşsiz demektir tekrar yoktur  key--> eşsiz datalara "Key" derler
       value-->benzer datalara value derler repeatedly(ripidliy)-->benzer demektir tekrar edilebilirler

       --> Map'ler "USA= 400,000,000" şeklinde data depolamamız gerektiğinde kullanılır
       -->"USA= 400,000,000" data'sının "USA" kısmı "key" olarak adlandırılır ve"key"ler "unique"dir
       -->"USA= 400,000,000" datasının "400,000,000" kismi "Value" olarak adlandırılır ve
       valueler tekrarlı olabilir
       --> HashMap ler çok hızlıdır cunku HashMap'ler siralama ile ugrasmazlar
       --> Maplerde depoladıgınız her bir dataya "Entry" denir, "Eleman" denmez
       --> Entry==> "cat=evcil hayvan"
       --> Entry'ler unique'dir cunku "key" kisimlari "unique" oldugundan herbir "Entry"
       digerlerinden farklidir
       -->"HashMap"ler cok hizlidir cunku "HashMap"ler "entry"leri siralamak ile ugrasmazlar
       -->"HashMap"lerde bir tane "key"i "null" yapabilirsiniz
       -->"HashMap"lerde birden fazla "value"yi "null" yapabilirsiniz
       --> "HashMap"ler "multi thread(birden fazla is yapabilme becerisi)" icin kullanilamaz dolayısıyla
       "synchronization(sikronizeyşin)=>islerin mantıklı bir sıraya konulması" da yoktur

                       eşsiz           benzer
                       tekrarsız       tekrarlı

                       Key             Value
                       Unique          Repeatedly

                       cat        =    evcil hayvan
                       dog        =    evcil haayvan
                       crocodile  =    timsah
                       tiger      =    kaplan */


    public static void main(String[] args) {

        /* --> HashMap<> --> parantezinin icine iki tane "data type" koymalıyım cunku
        USA=400,000,000 ifadesinde hem "String"li hem "Integer"li datam vardır

        HashMap<String,Integer> hm= new HashMap<*****-->String, Integer<--****>();
        normalde ustteki gibi yazdık once en sonda new keywördünden sonra
        HashMap parantezine de String ve Integer koydum fakat soluk yazı oldu
        bunun manası koymasanda olur demektir

        HashMap yazdığımızda intellijde bize yardım eder zaten aşağıda ilk HashMap yazdığımızda
        parantezle su sekilde bir ifade gozterir bize
        HashMap<K,V> Java.Util
        yani parantezin içine "key" ve "value" degerlerini gir demek */


     /*HashMapi olusturduktan sonra buna eleman ekleyelim,
     hm.add()--> ifadesini kullanmadık cunku yukarıda da belirttigimiz gibi
     eleman degil "entry" ekleyeceğiz ikili yapı "USA=400,000,000"

     "put"-->(String Key, Integer Value) diye bir methodu kullanarak ekleme yaparız

      *************** Mapler ************
      --> collection değildir
      --> collectionlar [] köşeli parantez kullanırlar
      --> mapler {} süslü parantez kullanırlar
      -->"Map" key-velue yapısında data depolamak için oluşturulmuş yeni bir structure(sıçrakçırdır)
      --> (structure=yapı) demek */


        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm);//{}

        /* -->HashMap'in içerisine nasıl entry eklenir
              Albania'nın en sonki değerini apdate eder
           -->Aynı "key"i kullanarak farklı deger vermek demek var olan "Entry"nin
              "velue" kısmını "uptade" etmek demektir asagıda "Albaniada" olduğu gibi
           -->"value" kısmı aynı olabilir "null"larda olduğu gibi */

        hm.put("USA", 400000000);
        hm.put("Germany", 85000000);
        hm.put("Albania", 3000000);
        hm.put("Albania", 2800000);
        hm.put(null, 12000000);
        hm.put(null, 18000000);
        hm.put("Myanmar", null);
        hm.put("Bhutan", null);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Germany=85000000, Albania=2800000}

        //HashMap'lerde sadece "key"leri almak istiyorum
        //"keySet"i kullanacağım.
        //"keySet"in manası tekrarsızları Sete koy demek
        //dolayısıyla Set yapısı oluşturduk


        // HashMap'lerde sadece "key"leri almak istersem
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);//[null, Myanmar, USA, Bhutan, Germany, Albania]

        //HashMap'lerde sadece "value"leri almak istersem

        /* Example 1: hm Map'indeki ulkelerin toplam nufusunu bulunuz,aşağıdaki yapıyı
        oluştururken "values"in üzerinde "ctrl" ile bekleriz bize hangi yapıyla oluşturacağımızı
        söyler */

        Collection<Integer> hmValues = hm.values();
        /*normalde alttaki if(w!=null)  ifadesi yoktu hata verdi
          hata vermesinin sebebi "null" larıda toplayacak olmamızdan
          fakat Integer dedik dolayısıyla if(w!=null) ifadesi ekledik */

        int sum = 0;

        for (Integer w : hmValues) {
            if (w != null) {
                sum = sum + w;
            }
        }

        System.out.println(sum);//505800000

        /* "get(object key)"--> biz "key"i vericez o bize "valiue"yu verecek
            --> HashMaplerde belirli bir "key"in "value"si nasıl alınır */

        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation);//400000000

        /* replace(String key, Integer value)-->"key"i vericez "value"yu değiştirecek
           replace()--> var olan "key"in değerini değiştirmek için kullanıyoruz*/

        hm.replace("Bhutan", 35000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=2800000}

        /* putItAbsent(String key,Integer value):-->yoksa ekle demek, varsa eklemiyor
           absent-->yok
           put-->ekle */

        hm.putIfAbsent("USA", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=2800000}
        //USA-->olduğu için değerini değiştirmedi

        hm.putIfAbsent("India", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=2800000, India=700000000}
        //"india"yı ekledi

        /* Example 2: Yeni öğretmenin maaşı standart ücretten(1000000) 1000TL fazla, eski öğretmenin
        maaşı standart ücretten 2000TL fazla olsun */

        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayşe", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Kemal";

        /* normalde "Kemal" listemizde ekli değil dolayısıyla ekliyoruz standart ücret onbin+bin yaparız*/
        //salaries.putIfAbsent(teacherName,11000);/* bu kod yeni öğremenler için çalışacak */
        //salaries.put(teacherName,12000); /*bu kod eski öğretmenler için çalışacak */
        //System.out.println(salaries);//{Ayşe=5000, Tom=12000, Veli=9000, Ali=8000}
        /*yukarıdaki işlemlerde kemali iki kere değiştirdi sonrasında yeniden bir çözüm üretti
        ve "if" döngüsüyle çözmeye karar verdi */

        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        } else {
            salaries.putIfAbsent(teacherName, 11000);
        }
        System.out.println(salaries);//{Ayşe=5000, Tom=9900, Veli=9000, Kemal=11000, Ali=8000}

         /* yukarıda "Kemal" keyi için
        salaries.keySet()-->Ali,Ayşe,Veli,Tom dur yani "key"lerdir
        contains(teacherName)-->bunların içinde kemal var mı diye soruyorum  "contains":içermek demek
        if(salaries.keySet().contains(teacherName))--> "false" ise sadece "else" kısmı çalışacak
        sadece salaries.putIfAbsent(teacherName) kısmı çalışacak
        -->bütün isimleri böyle değerlendirebiliriz  */

        /* "replace(String key, Integer value)--> bu method sadece "key"e bakarak "value"yi değiştiriyor
           "replace(String key, Integer oldValue, Integer newValue)-->bu method ise "key"e bakıyor
        "eski değere(oldValue)" bakıyor ona göre değiştiriyor(newValue) */



        /* replace("USA",400000000, 500000000)--> methodu USA nın değerini değiştirdi 500000000 yaptı*/
        hm.replace("USA", 400000000, 500000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, ***USA=500000000***, Bhutan=35000000, Germany=85000000, Albania=2800000, India=700000000}


        /*  getOrDefault(Object key, Integer defaultValue)--> eleman olarak olan "key"ler için
        olan değeri verir olmayan "key"ler için de sizin ikinci parametreye yazdığınız değeri verir
        sıfır değerini ben kendim yazdım oraya istediğim rakamı yazabilirim
        "Bhutan" varsa bana onun değerini
        verecek eğer yoksa sıfır değerini verecek */

        Integer r = hm.getOrDefault("Bhutan", 0);
        System.out.println(r);//35000000

        /* entrySet()-->methodu her bir "map"i "set"e çevirir verir
        buna ihtiyaç duyduğumuzda kullanırız

              ********  neden böyle bir şey yaparız   ********

        -->"Map"i "Set"e çevirdiğimizde Set'in bütün özelliklerini kullanabiliriz mesela "loop" gibi
        -->çünkü "set"in içinde sadece "set"in kullanabileceği methodlar vardır
        bunları kullanabilmek için
        --> entrySet() methodunu kullandığımızda elde ettiğiniz Set'in elemanları
        Map.Entry<String, Integer> şeklinde bir Map olur
        --> bu yüzden elemanlar için Map methodları kullanılabilir */

        Set<Map.Entry<String, Integer>> myEntries = hm.entrySet();
        System.out.println(myEntries);//[null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=85000000, Albania=2800000, India=700000000]

        //Example 3: Ulke ismindeki character sayısini ulke nufusuna ekleyen ve sonucu consola yazdıran kodu yazınız
        /* elemanların "data type'ı"-->****Map.Entry<String,Integer>**** budur
        dolayısıyla if'de data taype kısmına bu ifadeyi yazarız
         */


        //[null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=85000000, Albania=2800000, India=700000000]
        //yukardaki elemanları tek tek denemelisin
        for (Map.Entry<String, Integer> w : myEntries) {
            if (w.getValue() != null && w.getKey() != (null)) {/* "null"dan dolayı bu sırayı ekledi "null" kullanamaz çünkü */
                int toplam = w.getValue() + w.getKey().length();

                System.out.println(toplam);//500000003
                                           //35000006
                                           //85000007
                                           //2800007
                                           //700000005


            }


        }
    }

}




