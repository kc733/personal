import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.print("Enter your name, please:");
        String name = scaner.nextLine();
        System.out.print("Welcome, "+name);
        System.out.print("Now enter your age, please:");
        int age = scaner.nextLine();
        System.out.print("So you are "+age+", correct?");

        if(age>16){

            System.out.print("Access granted");
        }else{

            System.out.print("Access denied");
        }
    }
    
}