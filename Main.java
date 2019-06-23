import java.util.Scanner;


/*
Mars Rover Mainfile (executable)        
Author: Aidan Hackett
javac *.java && java Main

To do:
Exceptions for bad input
Javadoc
unit testing

*/


public class Main {


    public static void main(String[] args) {

        System.out.println("Welcome to Mars Rover Movement Calculator!");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the size of the Plateau's dimensions (x,y):");
        intPair plateauSize = new intPair(userInput.nextInt(), userInput.nextInt());
        userInput.nextLine();

        System.out.println("Enter the First Rover's coordinates (x, y, direction):");
        Rover roverA = new Rover(userInput.nextInt(), userInput.nextInt(), userInput.next().charAt(0), plateauSize);
        userInput.nextLine();

        System.out.println("Enter the First Rover's instructions (L, R, M):");
        String actionsA = userInput.nextLine(); //LMLMLMLMM

        System.out.println("Enter the Second Rover's coordinates (x, y, direction):");
        Rover roverB = new Rover(userInput.nextInt(), userInput.nextInt(), userInput.next().charAt(0), plateauSize);
        userInput.nextLine();

        System.out.println("Enter the Second Rover's instructions (L, R, M):");
        String actionsB = userInput.nextLine(); // MMRMMRMRRM

        roverA.roverGo(actionsA);
        roverB.roverGo(actionsB);
    }

}
