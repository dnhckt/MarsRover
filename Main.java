import java.util.Scanner;

/*
Mars Rover Mainfile (executable)        
Author: Aidan Hackett

*/

class Rover {
    int xPosition;
    int yPosition;
    char compassDirection;

    /* Construction method - takes values from user input */
    Rover(int x, int y, char c) {
        this.xPosition = x;
        this.yPosition = y;
        this.compassDirection = c; 
    }

    public void setPosition(char roverAction) {
        
        switch (roverAction) {
            
            case 'L':
                this.compassDirection = turnCompass(this.compassDirection, false);
            break;
            
            case 'R':
                this.compassDirection = turnCompass(this.compassDirection, true);
            break;
            
            case 'M':
                roverMove(this.compassDirection);
            break;
            
            default:
                System.out.println("Sorry, invalid input");
            break;
        }

    }

    private char turnCompass(char direction, boolean clockwise) {
        switch (direction) {
            case 'N':
                if (clockwise)
                    direction = 'E';
                else
                    direction = 'W';
            break;

            case 'E':
                if (clockwise)
                    direction = 'S';
                else
                    direction = 'N';
            break;
            
            case 'S':
                if (clockwise)
                    direction = 'W';
                else
                    direction = 'E';
            break;
            
            case 'W':
                if (clockwise)
                    direction = 'N';
                else
                    direction = 'S';
            break;
            
            default:
            System.out.println("Not a valid compass direction!");
            break;
        }        
        return direction;
    }

    private void roverMove(char direction) {
        switch (direction) {
            case 'N':
                this.yPosition = this.yPosition + 1; 
            break;
            case 'E':
                this.xPosition = this.xPosition - 1;
            break;
            case 'S':
                this.yPosition = this.yPosition - 1;
            break;
            case 'W':
                this.xPosition = this.xPosition + 1;
            break;
        }
    }

}

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
        /* Set size of plateau */
        int platX = 5; 
        int platY = 5;
        
        /* Set initial rover position */
        Rover roverA = new Rover(1, 2, 'N');
        System.out.println(roverA.xPosition + " " + roverA.yPosition + " " + roverA.compassDirection);
        
        /*  Take movement input */
        String movements = new String();
        movements = "LMLMLMLMM";
        
        for(int i = 0; i < movements.length(); i++) {
            roverA.setPosition(movements.charAt(i));
        }

        /* Provide output */
        System.out.println(roverA.xPosition + " " + roverA.yPosition + " " + roverA.compassDirection);
        
    }

}
