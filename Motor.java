/** 
 * Motor
 * ======
 * Used to handle Rover movements: changing direction (motorTurn()) and moving forward (motorWalk())  
 * @author Aidan Hackett
 */

public class Motor {

    public static final char North = 'N';
    public static final char East = 'E';
    public static final char South = 'S';
    public static final char West = 'W';

    /**
     * motorTurn
     * =======
     * Returns a new direction after turning left or right  
     * @param direction initial direction N, E S or W 
     * @param clockwise if true move clockwise (turn right), else move anti-clockwise (turn left)
     * @return The new direction rover is facing 
     */

    public static char motorTurn(char direction, boolean clockwise) {

        switch (direction) {

            case North:
                if (clockwise)
                    direction = East;
                else
                    direction = West;
            break;

            case East:
                if (clockwise)
                    direction = South;
                else
                    direction = North;
            break;
            
            case South:
                if (clockwise)
                    direction = West;
                else
                    direction = East;
            break;
            
            case West:
                if (clockwise)
                    direction = North;
                else
                    direction = South;
            break;
            
            default:
                System.out.println("Not a valid compass direction!");
            break;
        }        
        return direction;
    }

    /**
     * motorWalk
     * ==========
     * If within bounds, update the rover position
     * @param position x or y value to update
     * @param boundary the bounds of the plateau (max value)   
     * @param goForwards if true, increase value, else decrease value
     * @return the new x or y value for the rover 
     */

    public static int motorWalk(int position, int boundary, boolean goForwards) {

            if (goForwards) {
                if (position < boundary)
                    position = position + 1;
                else
                    System.out.println("Out of bounds!");
            }    

            else {
                if (position > 0)
                    position = position - 1;
                else
                    System.out.println("Out of bounds!");
            }

            return position;
    }



}