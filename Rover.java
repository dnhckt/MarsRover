
/**
 * Rover
 * ======
 * This entity represents the position of a Mars Rover within a given plateau
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

    int xPosition; 
    int yPosition;
    char roverDirection;
    
    IntPair roverBounds; 
    Motor motor;

    /**
     * Constructor for Rover
     * @param x the x co-ordinate of the Rover (horizontal axis)
     * @param y the y co-ordinate of the Rover (vertical axis)
     * @param c the direction of the Rover (N/E/S/W)
     * @param bounds the bounds of the plateau (max values)
     */
    
    Rover (int x, int y, char c, IntPair bounds) {

        this.xPosition = x;
        this.yPosition = y;

        this.roverBounds = new IntPair(bounds.getX(), bounds.getY());
        this.roverDirection = c;

    }

    public void roverGo(String instructions) {
    
        this.roverStatus();
    
        for(int i = 0; i < instructions.length(); i++) {
            this.roverAction(instructions.charAt(i));
        }

        this.roverStatus();    

    } 

    public void roverStatus() {

        System.out.println(this.xPosition + " " + this.yPosition + " " + this.roverDirection);
    
    }

    public void roverAction(char action) {
        
        switch (action) {

            case turnLeft:
                this.roverDirection = motor.motorTurn(this.roverDirection, false);
            break;
            
            case turnRight:
                this.roverDirection = motor.motorTurn(this.roverDirection, true);
            break;
            
            case moveForward:

                switch (this.roverDirection) {
                    case 'N':
                        this.yPosition = motor.motorWalk(this.yPosition, this.roverBounds.getY(), true);
                    break;
                    case 'E':
                        this.xPosition = motor.motorWalk(this.xPosition, this.roverBounds.getX(), true);
                    break;
                    case 'S':
                        this.yPosition = motor.motorWalk(this.yPosition, this.roverBounds.getY(), false);
                    break;
                    case 'W':
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


