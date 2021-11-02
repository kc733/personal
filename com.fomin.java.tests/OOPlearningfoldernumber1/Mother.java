package OOPlearningfoldernumber1;

public class Mother {

    String status = " is loved";
    String name;

    Mother(String name) {
        this.name = name;
    }

    public String toString() { 

        String frase = "Mother "+name+status;
        return frase;
    }
}
