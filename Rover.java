public class Rover {
    public static final char turnLeft = 'L';
    public static final char turnRight = 'R';
    public static final char moveForward = 'M';

    int xPosition; 
    int yPosition;
    intPair roverBounds; 
    char roverDirection;

    Motor motor;
    
    Rover (int x, int y, char c, intPair bounds) {

        this.xPosition = x;
        this.yPosition = y;

        this.roverBounds = new intPair(bounds.getX(), bounds.getY());
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
                this.motorWalk(this.xPosition. this.yPosition, this.roverBounds, this.roverDirection);

            break;
            
            default:
                System.out.println("Sorry, invalid input");
            break;

        }

    }

    private void roverWalk(char direction) {

        switch (direction) {
        
            case 'N':
                if (this.yPosition < roverBounds.getY)
                    this.yPosition = this.yPosition + 1;

                else
                    System.out.println("Out of bounds!"); 
            break;
        
            case 'E':
                if (this.xPosition < roverBounds.getX) 
                    this.xPosition = this.xPosition + 1;
            
                else
                    System.out.println("Out of bounds!"); 
            break;
        
            case 'S':
                if (this.yPosition > 0)
                    this.yPosition = this.yPosition - 1;
            
                else 
                    System.out.println("Out of bounds!");
            break;
        
            case 'W':
                if (this.xPosition > 0)
                    this.xPosition = this.xPosition - 1;
            
                else
                    System.out.println("Out of bounds!");
            break;

        }
    }


    }


}
