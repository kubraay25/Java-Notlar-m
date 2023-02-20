package day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    /* Queue(kiu)--> kuyruk
                     hasta kuyruğu, maç kuyruğu, bilet kuyruğu
                 --> "Queue"larda ilk gelen ilk işleme girer
                     (First In First Out ==>FIFO)--> ilk giren ilk çıkar
                 --> bazende son gelen ilk işleme girer.
                     (Last In First Out ==>LIFO)
                     "Deque" "Double Ended Queue" hem "FIFO" hem de LIFO için kullanılır

     */

    public static void main(String[] args) {

        /* Queue--> collection tablosundan da anlaşılacağı üzere "Queue" bir interfacedir
        interfacelerin constructoru yoktur bu yüzden "object" oluşturulurken "new" den
        sonra kullanamayız çünkü new den sonraki "consructor"dur dolayısıyla "Queue"nin
        classlarını kullanırım bunlarda "LinkedList"ler ve "PriorityQueue" dir.
        Önce LinkedList kullanmakla başlayalım  "Queue" bir interface'dir, bu yuzden
        "constructor" i yoktur, dolayisiyla object olustururken "new" keyword'unden sonra kullanilamaz
        Data TYpe'i "Queue" olan bir object olusturmak icin "new" keyword'unden sonra
        i)LinkedList veya ii)PriorityQueueClass'lari kullanilabilir.

        "Queue" olustururken constructor olarak "PriorityQueue" kullanirsaniz, elemanlari kendi belirleyeceginiz kurala gore
        siralama hakkiniz olur. */


        /* interface (Queue) olsa olsa ancak bir data type olur
           "new"den sonra kullandığım şey kesinlikle classlardan (LinkedList)
           veya "PriorotyQueue" olmalıdır aşağıda LinkedLİsti kullanarak başlayalım */


        Queue<String> myQueue = new LinkedList();
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury water");

        /* LinkedListler-->benim verdiğim sıraya göre elemanları dizer */
        
        System.out.println(myQueue);//[Milk, Butter, Jam, Egg, Luxury water]

        /* poll()--> ilk elemanı döndürür ve siler (cut-case)
                     eğer queue boşsa null döndürür */
                     myQueue.poll();
                     
        /* element()--> size ilk elemanı döndürür ama silmez (copy-paste)
                    --> eğer "queue" boşsa exception atar    */

                     myQueue.element();

        /* element() mi yoksa poll() mu kullanacağımıza durum karar verir
        mesela atm de para yok ve aplication dursun istiyorsak hata atsın istiyorsak
        element() methodu kullanırız yok sadece paranın olmadığına dair hata vermeden
        sadece null versin istiyorsak poll() methodu uygularız */
                   /***********************************/

        /* peek()--> silmeden ilk elemanı size verir(copy-paste)
                 --> eğer boşsa null verir */

                     myQueue.peek();

        /* birden fazla method ilk elemanla alakalı olabilir boş durumuna
        göre farklılaşırlar ya da "cut"-"copy" durumuna görede
        pool() ile remove() ikiside ilk elemanı siler ve size verir
        poll() bos "Queue"lar için "null" verir, remove() ise bos "Queue"lar için
        exception atar */

        /*element() ile peek() ikisi de ilk elemanı silmeden size verir
        peek() boş "Queue" ler için "null" verir, element() ise bos "Queue"ler
        için"Exception" atar */

        /* offer()--> konulan kısıtlamalara (yani verdiğimiz kuralla göre) bakarak ekleme yapar
                      ekleme yapabilirse "true" verir
                      kısıtlama olduğunda ekleyenediğinde "false" verir
           add()--> methodu bir şeye bakmadan ekleme yapar

                -->"Queue" oluşturulurken constructor olarak "PriorityQueue" kullanırsanız
                    elemanları kendi belirleyeceğiniz kurala göre sıralama hakkınız olur*/

        boolean b1 = myQueue.offer("Avocado");
        System.out.println(myQueue);//[Butter, Jam, Egg, Luxury water, Avocado]


        Queue<String> yourQueue = new PriorityQueue<>();

        yourQueue.add("Milk");
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury water");

        System.out.println(yourQueue);//[Butter, Egg, Jam, Milk, Luxury water]









    }


}
