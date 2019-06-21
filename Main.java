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

        Scanner userInput = new Scanner(System.in);
        int platX, platY;
        int roverAx, roverAy, roverAdir;
        int roverBx, roverBy, roverBdir;

        System.out.println("Enter the size of the Plateau's dimensions (x,y):");
        platX  = userInput.nextInt(); 
        platY = userInput.nextInt(); 

        System.out.println("You entered" + platX + ", " + playY);

        System.out.println("Enter the First Rover's X Coordinate:");
       1 = userInput.nextInt(); 
        

        intPair plateau = new intPair(platX, platY);

        Rover roverA = new Rover(1, 2, 'N', plateau);
        Rover roverB = new Rover(3, 3, 'E', plateau);

         roverA.roverGo("LMLMLMLMM");

         roverB.roverGo("MMRMMRMRRM");
    }

}
