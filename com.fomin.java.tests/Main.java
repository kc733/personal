
public class Main {

    public static void main(String[] args) {

        String x = "water"; //initialization
        String y = "juice";
        String temp;

        temp = x;
        x=y;
        y=temp;
        
        System.out.print(x+" "+y);


    }
}