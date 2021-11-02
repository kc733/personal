package OOPlearningfoldernumber1;

public class mainforarray {

    public static void main(String[] args) {

        // Array of objects practice
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal hamster = new Animal("hamster");
        Animal[] homeAnimals = {cat, dog, hamster};

        System.out.println("My home animals are:");
        
        System.out.println(homeAnimals[0].species);
        System.out.println(homeAnimals[1].species);
        System.out.println(homeAnimals[2].species);
    }
    
}
