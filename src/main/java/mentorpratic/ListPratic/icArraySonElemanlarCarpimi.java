package mentorpratic.ListPratic;

public class icArraySonElemanlarCarpimi {
    public static void main(String[] args) {
        // Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        int[][] mdarr = {{1, 2, 3}, {4, 5}, {6},{7,2}};
        int sonuc=1;
        for (int i =0; i <mdarr.length ; i++) {
            sonuc*=mdarr[i][mdarr[i].length-1];

        }
        System.out.println("sonuc = " + sonuc);
    }
}
