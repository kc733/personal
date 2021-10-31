import java.util.ArrayList;

public class paintingset {

    public static void main(String[] args) {

        ArrayList<String> myPaintingSet = new ArrayList<String>();
        // adding elements
        myPaintingSet.add("Big brush");
        myPaintingSet.add("Small brush");
        myPaintingSet.add("Average brush");
        myPaintingSet.add("Watercolors");
        myPaintingSet.add("Black guache");
        myPaintingSet.add("Pencil 2B");
        myPaintingSet.add("Jar for water");

        for(int i = 0; i<myPaintingSet.size(); i++) {

            System.out.println(myPaintingSet.get(i));

        }
    }
}