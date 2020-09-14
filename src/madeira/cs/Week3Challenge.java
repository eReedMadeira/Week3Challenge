package madeira.cs;

import java.util.Scanner;

public class Week3Challenge {

    public static void main(String[] args) {
/*
    Problem I
    ---------
    Prompt the user to enter two numbers
    Compare the two numbers and print out "First" if first is greater or "Second" second is greater
    This should handle decimals and integers at a wide range of values

*/

        System.out.println("Please enter two numbers.");
        Scanner numberScanner1 = new Scanner(System.in);
        double number1 = numberScanner1.nextDouble();

        Scanner numberScanner2 = new Scanner(System.in);
        double number2 = numberScanner2.nextDouble();

        if (number1 > number2) {
            System.out.println("First");
        } else if (number1 < number2) {
            System.out.println("Second");
        } else {
            System.out.println("Equal");
        }

/*

    Problem II
    ----------
    Prompt the user to enter their favorite genre of music
    Reply with "Same!" if it is the same as your favorite genre or "Lame." if not.
 */

        System.out.println("Enter your favorite music genre.");

        Scanner musicScanner = new Scanner(System.in);
        String musicGenre = musicScanner.nextLine();

        if (musicGenre.equals("Indie Pop")) {
            System.out.println("Same!");
        } else {
            System.out.println("Lame.");
        }

 /*
    Problem III
    -----------
    Declare an integer, any integer.
    Prompt the user to guess your number.
    Give them 10 tries to get it right.
    If they do, present them with a congratulatory message, if not, roast them unfairly.
*/

        Scanner guessScanner = new Scanner (System.in);
        int number = 103;
        int limit = 10;
        int measurement, guess;

        System.out.println("I am thinking of an integer. You have 10 guesses to find it.");

        for (measurement = 0; measurement < limit; measurement++) {
            System.out.println("Guess the integer.");

            guess = guessScanner.nextInt();

            if (number == guess) {
                System.out.println ("Congratulations!");
                System.out.println("You have successfully guessed the number.");
                break;
            }
            else if (number > guess && measurement != limit - 1) {
                System.out.println("Too big! Try again.");
            }
            else if (number < guess && measurement != limit - 1) {
                System.out.println("Too big! Try again.");
            }
        }

        if (measurement == limit) {
            System.out.println("You have failed to guess the number.");
            System.out.println ("How does it feel, being a failure? I wouldn't know.");
            System.out.println ("And by the way, your mother was a hamster and your father smelt of elderberries.");
            System.out.println ("Have a horrifically mediocre day.");
            System.out.println ("And no, you don't get to know what the number was.");
            }


        

    }
}
