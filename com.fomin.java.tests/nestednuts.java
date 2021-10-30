public class nestednuts {

    public static void main(String[] args) {
  
        int rows = 4;
        int columns = 4;
        String symbol = "nuts ";

          
            // outer loop
            for (int i = 1; i <= rows; i++) {
                

                for (int j = 1; j <= columns; j++) {
                  System.out.print(symbol);
                }
                System.out.println();
              }
            
        
    }
    
}
