import java.util.Scanner;
import java.awt.Point; 


/*
Mars Rover Mainfile (executable)        
Author: Aidan Hackett
javac *.java && java Main

To do:
Prevent out of bounds
Add custom inputs

*/


public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Mars Rover Movement Calculator!");

/* Custom plateau input - for now use 5, 5 */
/*       
        Scanner userInput = new Scanner(System.in);
        int platX, platY;

        System.out.println("Enter the size of the Plateau's x dimension:");
        platX  = userInput.nextInt(); 
        System.out.println("Enter the size of the Plateau's y dimension:");
        platY = userInput.nextInt(); 

        System.out.println("You entered" + platX + ", " + playY);
*/  
        
        // Pair<Integer, Integer> plateau = new Pair<>(6,7);
        intPair plateau = new intPair(5, 5);

        Rover roverA = new Rover(1, 2, 'N', plateau);
        Rover roverB = new Rover(3, 3, 'E', plateau);

         roverA.roverGo("LMLMLMLMM");

         roverB.roverGo("MMRMMRMRRM");
    }

}
