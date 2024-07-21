/*
Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */
import java.util.Random;
import java.util.*;
class Game{
    public int number;
    public int inputNumber;
    public int numberOfGuesses = 0;

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    Game(){
        Random rn=new Random();
        this.number = rn.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        numberOfGuesses++;
        if (inputNumber==number) {
            System.out.format("you are write, number is %d and your guesses is it %d attempt .\n" ,number,numberOfGuesses);
        }
        else if (inputNumber<number) {
            System.out.println("increase number !");
        } else if (inputNumber>number) {
            System.out.println("decrease number !");
        }
        return false;

    }
}
public class Practice8 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }

    }
}
