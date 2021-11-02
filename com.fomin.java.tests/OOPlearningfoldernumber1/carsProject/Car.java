package OOPlearningfoldernumber1.carsProject;

public class Car {
    
    static int numberOfCars;
    String model;

    Car(String model) {

        this.model = model;
        numberOfCars++;
    }


    static void displayNumOfCars() {
        System.out.println("I have "+numberOfCars+" cars.");
    }

}
