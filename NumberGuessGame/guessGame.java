package Projects.NumberGuessGame;

import java.util.Scanner;

public class guessGame {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int option;
        do {
            System.out.println("1-> Start Guessing..\n2-> Exit..");
            System.out.println("Enter your option:");
            option = read.nextInt();
            if (option == 2) {
                break;
            }
            System.out.println("Enter your Guess(1-10):");
            int user_input = read.nextInt();
            int com_input = (int) Math.floor(Math.random() * 10);
            if (user_input == com_input) {
                System.out.println("Horray your guess is Correct....");
            } else {
                System.out.println("Nope Your guess is Wrong..");
            }


        } while (option <= 2);
        System.out.println("Thank you..");

    }
}
