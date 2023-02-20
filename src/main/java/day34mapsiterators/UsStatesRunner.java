package day34mapsiterators;

public class UsStatesRunner {
    /* "getAbbreviation"--> sadece kısaltılısını alacak */

    public static void main(String[] args) {

        String arizonabbr = UsStates.ARIZONA.getAbbreviation();
        System.out.println(arizonabbr);//AZ

        UsStates arizona = UsStates.ARIZONA;
        System.out.println(arizona);//ARIZONA
    }
}


