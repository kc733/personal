
// import java.util.Scanner;
import javax.swing.JOptionPane;

public class mainf {
  
    public static void main(String[] args) {

        // create students
        Student Jennifer = new Student("Jennifer",16);
        Student Michael = new Student("Michael",15);

        // Scanner scanner = new Scanner(System.in);

        // choose students
        JOptionPane.showMessageDialog(null,"Choose your student:");
        String chosenStudent = JOptionPane.showInputDialog(" a/Jennifer\n b/Michael");

        // choose students
        // System.out.println("Choose your student:");
        // System.out.println(" a/Jennifer\n b/Michael");

        // String chosenStudent = scanner.nextLine();

        // choose assigment

        JOptionPane.showMessageDialog(null,"Which task do you want to assign?");
        String chosenAssignment = JOptionPane.showInputDialog(" a/Learn Mathematics\n b/Learn English literature\n c/Study formulas");

        // System.out.println("Which task do you want to assign?");
        // System.out.println(" a/Learn Mathematics\n b/Learn English literature\n c/Study formulas");

        // String chosenAssignment = scanner.nextLine();

        // scanner.close();

        // Jennifer
        if(chosenStudent. equals("a")) {

            // Assigments
            if(chosenAssignment. equals("a")) {

                Jennifer.learnmath();

            }

            if(chosenAssignment. equals("b")) {

                Jennifer.learenglishlit();

            }

            if(chosenAssignment. equals("c")) {

                Jennifer.studyformula();

            }
        }

        // Michael
        if(chosenStudent. equals("b")) {

            // Assigments
            if(chosenAssignment. equals("a")) {

                Michael.learnmath();

            }

            if(chosenAssignment. equals("b")) {

                Michael.learenglishlit();

            }

            if(chosenAssignment. equals("c")) {

                Michael.studyformula();

            }
        }

    }
    
}
