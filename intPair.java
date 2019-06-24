/**
 * IntPair
 * -
 * Used to store and return plateau coordinates within which a rover can traverse
 * @author Aidan Hackett
 */

public class IntPair {

    private final int X;
    private final int Y;
    
    IntPair(int x, int y) {
        this.X = x;
        this.Y = y;
    }  

    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }

}