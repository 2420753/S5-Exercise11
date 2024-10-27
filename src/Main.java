import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter how many numbers you want to enter: ");
        int size = stdin.nextInt();


        int[] array = new int[size];

        // Number of guesses that player has:
        int lives = 3;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = stdin.nextInt();
        }

        while (lives > 0) {

            System.out.print("\nSecond players guess: ");
            int secondUserGuess = stdin.nextInt();

            boolean found = false;
            for (int j : array) {
                if (j == secondUserGuess) {
                    found = true;
                    break;
                }
            }


            if (found) {
                System.out.print("You've guessed the right number!");
                break;
            } else {
                lives--;
                if (lives > 0) {


                    System.out.print("Incorrect guess!\n" + lives + " lives left! - Try again!: ");
                }
            }
            if (lives == 0) {
                System.out.print("Game over! You have " + lives + " lives left!");
            }

        }


    }
}