package OOPlearningfoldernumber1;
import javax.swing.JOptionPane;

public class Student {

    // attributes
    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    // methods
    void learnmath() {

        // System.out.println("Student "+this.name+" is learning Mathematics.");
        JOptionPane.showMessageDialog(null,"Student "+this.name+" is learning Mathematics.");

    }
    
    void learenglishlit() {

        // System.out.println("Student "+this.name+" is learning English litearture.");
        JOptionPane.showMessageDialog(null,"Student "+this.name+" is learning English litearture.");

        
    }

    void studyformula() {

        // System.out.println("Student "+this.name+" is studying formulas.");
        JOptionPane.showMessageDialog(null,"Student "+this.name+" is studying formulas.");

    }
}
