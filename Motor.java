
public class Motor {
    public static final char North = 'N';
    public static final char East = 'E';
    public static final char South = 'S';
    public static final char West = 'W';

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


    // public int motorMoveNorth(int y) {
    //     return y + 1;
    // }  
    // public int motorMoveSouth(int y) {
    //     return y - 1;
    // }
    // public int motorMoveEast(int x) {
    //     return x + 1;
    // }
    // public int motorMoveWest(int x) {
    //     return x - 1;
    // }
    
}
