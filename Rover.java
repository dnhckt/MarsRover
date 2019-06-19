public class Rover {
    public static final char turnLeft = 'L';
    public static final char turnRight = 'R';
    public static final char moveForward = 'M';

    int xPosition;
    int yPosition;
    char roverDirection;
    
    Rover (int x, int y, char c) {
        this.xPosition = x;
        this.yPosition = y;
        this.roverDirection = c; 
    }

    public void roverStatus() {

        System.out.println(this.xPosition + " " + this.yPosition + " " + this.roverDirection);
    
    }

    public void roverAction(char action) {
        
        switch (action) {
            case turnLeft:
                this.roverDirection = roverTurn(this.roverDirection, false);
            break;
            
            case turnRight:
                this.roverDirection = roverTurn(this.roverDirection, true);
            break;
            
            case moveForward:
                roverMove(this.roverDirection);
            break;
            
            default:
                System.out.println("Sorry, invalid input");
            break;
        }

    }

    private char roverTurn(char direction, boolean clockwise) {
        
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
                this.xPosition = this.xPosition + 1;
            break;
         
            case 'S':
                this.yPosition = this.yPosition - 1;
            break;
            case 'W':
                this.xPosition = this.xPosition - 1;
            break;
        }
    }

}
