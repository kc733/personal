import java.util.Scanner;

public class switchortop {

    public static void main(String[] args) {

        System.out.println("Are you a top, a bottom or a switch?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        scanner.close();

        switch(answer) {

            case "top": System.out.println("Oh, so you're the sigma male?");
            break;
            case "Top": System.out.println("Oh, so you're the sigma male?");
            break;
            case "bottom": System.out.println("Cute uwu");
            break;
            case "Bottom": System.out.println("Cute uwu");
            break;
            case "switch": System.out.println("You're that cool guy everyone talks about?");
            break;
            case "Switch": System.out.println("You're that cool guy everyone talks about?");
            break;
            
        }


    }


}