import java.util.Scanner;


/**
 * Main.java 
 * =========
 * 
 * This is an executable file - upon running, it will ask for user input in the command line. 
 * Requires Rover, Motor and IntPair classes.
 * 
 * Author: Aidan Hackett
 */

 /*
To do:
unit testing
prevent too high initial input
*/


public class Main {


    public static void main(String[] args) {

        System.out.println("Welcome to Mars Rover Movement Calculator!");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the size of the Plateau's dimensions (x,y):");
        IntPair plateauSize = new IntPair(userInput.nextInt(), userInput.nextInt()); 
       
        userInput.nextLine(); // Needed to take string input

        System.out.println("Enter the First Rover's coordinates (x, y, direction):");
        Rover roverA = new Rover(userInput.nextInt(), userInput.nextInt(), userInput.next().charAt(0), plateauSize); 
       
        userInput.nextLine(); // Needed to take string input

        System.out.println("Enter the First Rover's instructions (L, R, M):");
        String actionsA = userInput.nextLine(); 

        System.out.println("Enter the Second Rover's coordinates (x, y, direction):");
        Rover roverB = new Rover(userInput.nextInt(), userInput.nextInt(), userInput.next().charAt(0), plateauSize);
       
        userInput.nextLine(); // Needed to take string input

        System.out.println("Enter the Second Rover's instructions (L, R, M):");
        String actionsB = userInput.nextLine(); 

        // Pass instruction strings e.g. ("LMLMLMLMM") to roverGo method
        roverA.roverGo(actionsA); 
        roverB.roverGo(actionsB);

        userInput.close();
    }

}
