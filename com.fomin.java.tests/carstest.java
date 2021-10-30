public class carstest {

    public static void main(String[] args) {

        String[][] cars = new String [3][3];

        cars [0][0] = "Camaro";
        cars [0][1] = "Corvette";
        cars [0][2] = "Silverado";
        cars [1][0] = "Mustang";
        cars [1][1] = "McLaren";
        cars [1][2] = "BMW";
        cars [2][0] = "Ferrari";
        cars [2][1] = "Volkswagen";
        cars [2][2] = "Citroen";

        for (int i=0; i<cars.length; i++) {
            
            for (int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+ " ");
                System.out.print(j+"j ");
            }

            System.out.println(i);
        }
    }
    
}
