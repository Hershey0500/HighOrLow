import java.util.Scanner;
import java.util.Random;

class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int randomNum = rnd.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean validInput = false;

        do {
            System.out.print("Guess the number (1 to 10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine(); // clear buffer
                if (guess >= 1 && guess <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!validInput);

        System.out.println("The random number was: " + randomNum);
        if (guess < randomNum) {
            System.out.println("Your guess was too low.");
        } else if (guess > randomNum) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("You guessed it!");
        }
    }
}
