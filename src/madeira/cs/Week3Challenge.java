package madeira.cs;

import java.util.Scanner;

public class Week3Challenge {
    /*

        Grades and comments
        -------------------
        + 100000000000 points for Monty Python reference
        This is genuinely excellent code.
        Well commented, well organized, awesome.

        5/5 +1 extra credit

    */

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
        }
        else if (musicGenre.equals("indie pop")) {
            System.out.println ("Same!");
        }
        else if (musicGenre.equals ("Indie pop")) {
            System.out.println ("Same!");
        }
        else {
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
        int measurement, guess;

        System.out.println("I am thinking of an integer. You have 10 guesses to find it.");

        for (measurement = 0; measurement < 10; measurement++) {
            System.out.println("Guess the integer.");

            guess = guessScanner.nextInt();

            if (number == guess) {
                System.out.println ("Congratulations!");
                System.out.println("You have successfully guessed the number.");
                break;
            }
            else if (number > guess && measurement != 10 - 1) {
                System.out.println("Too small! Try again.");
            }
            else if (number < guess && measurement != 10 - 1) {
                System.out.println("Too big! Try again.");
            }
        }

        if (measurement == 10) {
            System.out.println("You have failed to guess the number.");
            System.out.println ("How does it feel, being a failure? I wouldn't know.");
            System.out.println ("By the way, your mother was a hamster and your father smelt of elderberries.");
            System.out.println ("Have a horrifically mediocre day.");
            System.out.println ("And no, you don't get to know what the number was.");
            }


/*
    Problem IV
    ----------
            Produce the following output using one print statement

        *****
        ****
        ***
        **
        *
*/
        int outerCounter = 5;
        while (outerCounter > 0) {
            System.out.println();
            int innerCounter = 0;
            while (innerCounter < outerCounter) {
                System.out.print ("*");
                innerCounter++;
            }
            outerCounter--;
        }
        System.out.println ();
/*
    Problem V
    ---------
            Produce the following output using one print statement

        ****
        **
        *
*/

        int outerCounter2 = 4;
        while (outerCounter2 > 0) {
            System.out.println();
            int innerCounter2 = 0;
            while (innerCounter2 < outerCounter2) {
                System.out.print ("*");
                innerCounter2++;
            }
            outerCounter2/= 2;
        }
        System.out.println ();

/*
    ------------------
            EXTRA CREDIT BELOW
    ------------------


            Problem VI
            ----------
    Declare an number, any number.
            Prompt the user to guess your number.
    Give them 10 tries to get it right.
            For each try they should either be:
    Hot: +/- 2
    Medium: +/- 4
    Mild: +/- 8
    If they are Hot they should have 4 guesses subtracted from their total remaining
    If they are Medium they should have 2 guesses subtracted from their total remaining
    If they are Mild they should have 1 guess subtracted from their total remaining

    Once they're out of guesses, they should be prompted to play again.


    Edge Cases:
    - If I have 4 guesses remaining and my guess is within 2 of the correct answer I should receive the prompt: "One more guess!"
            - Same goes for 2 guesses remaining with a Medium guess
    - User should be able to enter ANY TYPE of number

    Brownie points for well commented / organized code that goes above and beyond to direct the user clearly & leaves no room for ambiguous edge cases

*/
        System.out.println ("I am thinking of a number.");
        System.out.println ("You have ten tries to guess it correctly, but be careful - your guesses will decrease when you get closer to the number I'm thinking of.");
        System.out.println ("Your time starts...");
        System.out.println ("...NOW!");

        // Declaring my number
        double secret = 42;

        // Creating a loop for the guessing
        int counter = 0;
        while (counter < 10) {
            // Creating a scanner for them to enter their guess.
            Scanner myScanner = new Scanner (System.in);
            double guess2 = myScanner.nextDouble();

            // If they guess the number, they get a congratulations message and the loop breaks.
            if (guess2 == secret) {
                System.out.println("Congratulations! You have guessed the secret to life, the universe, and everything.");
                break;
            }
            // If their number is within two of the secret number, they lose 4 guesses.
            else if (guess2 >= 40 && guess2 <= 44 && counter != 10 - 1) {
                System.out.println ("HOT!!");
                if (counter == 4) System.out.println ("One more guess!");
                counter += 4;
            }
            // If their number is within four of the secret number, they lose 2 guesses.
            else if (guess2 >= 38 && guess2 <= 46 && counter != 10 - 1) {
                System.out.println ("Medium!");
                if (counter == 2) System.out.println ("One more guess!");
                counter += 2;
            }
            // If their number is within eight of the secret number, they lose 1 guess.
            else if (guess2 >= 34 && guess2 <= 50 && counter != 10 - 1) {
                System.out.println ("Eh. Mild.");
                counter++;
            }
            // And if their number isn't even within eight of the secret number, they still lose one guess.
            else if (counter != 10 - 1) {
                System.out.println ("Not even close.");
                counter++;
            }
            // When counter reaches 10, they get this failure message.
            if (counter >= 10) {
                System.out.println ("OOPS, you're out of guesses.");
                System.out.println ("How could this happen?");
                System.out.println ("I'll give you a hint to the answer, though.");
                System.out.println ("It's the answer to life, the universe, and everything.");
                break;
            } }
    }
}
