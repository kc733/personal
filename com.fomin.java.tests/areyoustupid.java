import java.util.Scanner;

public class areyoustupid {
    
    public static void main(String[] args) {

        System.out.println("Are you stupid? yes/no");
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();

        while(answer. equals("no")) {

            System.out.println("Are you stupid? yes/no");
            answer = scanner.nextLine();

        }

        if(answer. equals("yes")) {

            System.out.println("Of course you are");

        }

        scanner.close();

    }
}
