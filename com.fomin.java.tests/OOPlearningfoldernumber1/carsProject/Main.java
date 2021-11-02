package OOPlearningfoldernumber1.carsProject;

public class Main {

    public static void main(String[] args) {

        // object passing and static practice

        Garage garage = new Garage();

        Car car1 = new Car("Ferrari");
        Car car2 = new Car("McLaren");

        garage.park(car1);
        garage.park(car2);
        Car.displayNumOfCars();
    }
    
}
