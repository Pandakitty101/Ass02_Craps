import java.util.Random;
import java.util.Scanner;

public class Ass02_Craps {
    public static void main(String[] args)
    {
        boolean again = false;
        Scanner in = new Scanner(System.in);
        String playAgain;

        do {
            Random rnd = new Random();
            int firstRoll = rnd.nextInt(6) + 1;
            int secondRoll = rnd.nextInt(6) + 1;
            int sumOfRoll;
            int point;
            boolean other;
            boolean invalid;

            System.out.println("Your first roll is " + firstRoll);
            System.out.println("Your second roll is " + secondRoll);
            sumOfRoll = firstRoll + secondRoll;
            System.out.println("The sum is " + sumOfRoll);

            if (sumOfRoll == 2 || sumOfRoll == 3 || sumOfRoll == 12 || sumOfRoll == 7 || sumOfRoll == 11) {
                if (sumOfRoll == 2 || sumOfRoll == 3 || sumOfRoll == 12) {
                    System.out.println("You crapped out, game Over");
                } else if (sumOfRoll == 7 || sumOfRoll == 11) {
                    System.out.println("You won with a natural.");
                }
            } else {
                do {
                    point = sumOfRoll;
                    System.out.println("Your point is " + point);
                    firstRoll = rnd.nextInt(6) + 1;
                    secondRoll = rnd.nextInt(6) + 1;
                    sumOfRoll = firstRoll + secondRoll;
                    System.out.println("Your first roll is " + firstRoll);
                    System.out.println("Your second roll is " + secondRoll);
                    System.out.println("Your sum is " + sumOfRoll);
                    if (sumOfRoll == 7) {
                        System.out.println("You crapped out, game over");
                        other = false;
                    } else if (sumOfRoll == point) {
                        System.out.println("You made your point, you win");
                        other = false;
                    } else {
                        other = true;
                    }

                } while (other);
            }
            do {
                System.out.println("Do you want to play again? [Y/N]");
                playAgain = in.nextLine();

                if (playAgain.equalsIgnoreCase("Y")) {
                    invalid = false;
                } else if (playAgain.equalsIgnoreCase("N")) {
                    invalid = false;
                } else {
                    invalid = true;
                }
            } while (invalid);

            if (playAgain.equalsIgnoreCase("Y")) {
                again = true;
            } else if (playAgain.equalsIgnoreCase("N")) {
                again = false;
            }
        }while (again);

    }
}
