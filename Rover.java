public class Rover {
    public static final char turnLeft = 'L';
    public static final char turnRight = 'R';
    public static final char moveForward = 'M';

    int xPosition; 
    int yPosition;
    intPair roverBounds; 
    char roverDirection;

    Motor motor;
    
    Rover (int x, int y, char c, intPair plateau) {

        this.xPosition = x;
        this.yPosition = y;

        this.roverBounds = new intPair(plateau.getX(), plateau.getY());
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
               this.roverWalk(this.roverDirection);
            break;
            
            default:
                System.out.println("Sorry, invalid input");
            break;
        }

    }

    private void roverWalk(char direction) {
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
