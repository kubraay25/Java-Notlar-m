package day30ExceptionsInterface.Exceptions;

public class Exceptions2 {
    public static void main(String[] args) {
        /*
        1-Her application bir database`e sahiptir.
        2-Islemler yapilirken app databese hit yapar.
        3-App databese`e hit yaptiginda database ve app arasinda connection olusur.
        4-Islem bittikten sonra connection kesilir.Her halukarda connectionu kesen kod calismalidir.
         */
        /*
         1-Exception olsa da olmasa da olmasi gereken kodlari fnally block icinde yazariz.
         2-DB ile baglantiyi kesme isini yapan kodlar her halukarda calistirilmalidir.Bu tarz kodlari finally de yazariz.
         3-try block yalniz kullanilamaz.
          a- try+catch
          b-try+catch+finally
          c-try+finally
          d-try+coklu catch
          e-try+ coklu catch+finally
          4-Coklu finally block kullanilamaz.
         */
        int a = 12;
        int b = 4;
        int c[] = {3, 6, 9, 12};
        m(c, a, b);

    }

    public static void m(int[] c, int a, int b) {
        try {
            int idex = a / b;
            int element = c[idex];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {//exception olsa da olmasa da calisir.
            System.out.println("Cut the connectipn with the DB");
        }


    }
}
