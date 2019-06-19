import java.util.Scanner;

/*
Mars Rover Mainfile (executable)        
Author: Aidan Hackett

*/

/* Map class -- may be needed later
  =======================
// public class Map {
//     int xSize;
//     int ySize;

//     Map(int xSize, int ySize) {

//     }
// }

*/

public class Rover {
    int xPosition;
    int yPosition;
    String compassDirection;

    Rover(int x, int y, String c) {
        this.xPosition = x;
        this.yPosition = y;
        this.compassDirection = c; 
    }

    public void setPosition(String S) {
    }

}

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Mars Rover Calculator!")

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
        /* Set size of plateau */
        int platX, platY = 5;
        
        /* Set initial rover position */
        

        /*  Take movement input  */
    
        /* Provide output */
  
    }

}
