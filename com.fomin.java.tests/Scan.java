import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.print("Enter your name, please: ");
        String name = scaner.nextLine();
        System.out.print("Welcome, "+name);
        System.out.print("\nNow enter your age, please: ");
        int age = scaner.nextInt();
        scaner.nextLine();
        System.out.print("So you are "+age+", correct?");

        if(age>16){
            System.out.print("\nAccess granted");
            
        }else{
            System.out.print("\nAccess denied");
        }

        System.out.print("\nAnd what is your favourite food? ");
        String food = scaner.nextLine();
        System.out.print(food+"? Good choice.");

    }   
    
}