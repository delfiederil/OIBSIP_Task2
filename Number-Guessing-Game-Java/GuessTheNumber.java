import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalScore = 0;
        char playAgain;
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        do {
            int numberToGuess = 47;  
            int attemptsLeft = 5;
            boolean guessedCorrectly = false;
            System.out.println("\nI have generated a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts.");
            while (attemptsLeft > 0) {
                System.out.print("\nEnter your guess: ");
                int userGuess = sc.nextInt();
                if (userGuess == numberToGuess) {
                    guessedCorrectly = true;
                    System.out.println("🎉 Correct! You guessed the number.");
                    totalScore += attemptsLeft * 10;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("📉 Too low!");
                } else {
                    System.out.println("📈 Too high!");
                }
                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }
            if (!guessedCorrectly) {
                System.out.println("\n❌ You ran out of attempts.");
                System.out.println("The correct number was: " + numberToGuess);
            }
            System.out.println("🏆 Current Score: " + totalScore);
            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = sc.next().toLowerCase().charAt(0);
        } while (playAgain == 'y');
        System.out.println("\nThank you for playing!");
        System.out.println("Final Score: " + totalScore);
        sc.close();
    }
}

