
/**
 * Rover
 * ======
 * This entity represents the position of a Mars Rover within a given plateau
 * Contains methods roverGo(), roverStatus(), and roverAction()
 * @author Aidan Hackett
 */

public class Rover {
    public static final char North = 'N';
    public static final char East = 'E';
    public static final char South = 'S';
    public static final char West = 'W';

    public static final char turnLeft = 'L';
    public static final char turnRight = 'R';
    public static final char moveForward = 'M';

    private int xPosition; 
    private int yPosition;
    private char roverDirection;
    IntPair roverBounds;

    private Motor motor;

    /**
     * Constructor for Rover
     * ============
     * @param x the x co-ordinate of the Rover (horizontal axis)
     * @param y the y co-ordinate of the Rover (vertical axis)
     * @param c the direction of the Rover (N/E/S/W)
     * @param bounds the bounds of the plateau (max values)
     */
    Rover (int x, int y, char c, IntPair bounds) {

        this.motor = new Motor();

        this.roverBounds = new IntPair(bounds.getX(), bounds.getY());
        
        if (bounds.getX() > x)
            this.xPosition = x;
        else 
            System.out.println("X value cannot be higher than the plateau size!");

        if (bounds.getY() > y)
            this.yPosition = y;
        else 
            System.out.println("Y value cannot be higher than the plateau size!");

        this.roverDirection = c;
    }

    /**
     * roverGo 
     * ======
     *  Prints the position of the rover,
     *  calls the roverAction() method to evaluate movement instructions,
     *  then prints the new rover position
     * @param instructions The string passed to control the rover (Should consist of L, R or M)
     */

    public void roverGo(String instructions) {
    
        this.roverStatus();
    
        for(int i = 0; i < instructions.length(); i++) {
            this.roverAction(instructions.charAt(i)); // Evaluate each letter of the input string
        }
        this.roverStatus();    
    } 
    
    /**
     * roverStatus
     * =========
     * Prints the x, y co-ordinates and direction of the rover
     */

    private void roverStatus() {
        System.out.println(this.xPosition + " " + this.yPosition + " " + this.roverDirection);
    }

    /**
     * roverAction 
     * ==========
     * Passes 'L', 'R', or 'M' to the Motor to perform relevant action (turnLeft, turnRight or moveForward)
     * @param action The character to evaluate 
     */

    private void roverAction(char action) {
        
        /* Check L, R or M */ 

        switch (action) {

            case turnLeft:
                this.roverDirection = motor.motorTurn(this.roverDirection, false);
            break;
            
            case turnRight:
                this.roverDirection = motor.motorTurn(this.roverDirection, true);
            break;
            
            case moveForward:

                /* Check N, E, S or W */

                switch (this.roverDirection) {
                    case North:
                        this.yPosition = motor.motorWalk(this.yPosition, this.roverBounds.getY(), true);
                    break;
                    case East:
                        this.xPosition = motor.motorWalk(this.xPosition, this.roverBounds.getX(), true);
                    break;
                    case South:
                        this.yPosition = motor.motorWalk(this.yPosition, this.roverBounds.getY(), false);
                    break;
                    case West:
                        this.xPosition = motor.motorWalk(this.xPosition, this.roverBounds.getX(), false);
                    break;
                    default:
                        System.out.println("Sorry, invalid direction. Must be N, W, S or E!");
                    break;        
                }
                
            break;
            
            default:
                System.out.println("Sorry, invalid action. Must be L, R, or M!");
            break;

        }

    }

}


