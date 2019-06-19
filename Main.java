import java.util.Scanner;

/*
Mars Rover Mainfile (executable)        
Author: Aidan Hackett
*/



public class Main {

    public static void traversePlateau(String movements, Rover rover) {        
        for(int i = 0; i < movements.length(); i++) {
            rover.roverAction(movements.charAt(i));
        }
    }

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
        Plateau mars = new Plateau(5, 5);

        Rover roverA = new Rover(1, 2, 'N');
        roverA.roverStatus();
        traversePlateau("LMLMLMLMM", roverA);
        roverA.roverStatus();

        Rover roverB = new Rover(3, 3, 'E');
        roverB.roverStatus();
        traversePlateau("MMRMMRMRRM", roverB);
        roverB.roverStatus();
    }

}
