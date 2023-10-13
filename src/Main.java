import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guess;
        int number;
        String yn;
        boolean stop= false;

        do {
            System.out.println("Enter a number [1-10]:");
            if (scan.hasNextInt()) {
                guess = scan.nextInt();
                scan.nextLine();
                if (guess > 0 && guess <= 10) {
                    number = (int)(Math.random()* 10) + 1;
                    if (guess>number) {
                        System.out.println("My number was " + number);
                        System.out.println("Your guess was to high.");
                        System.out.println("Would you like to play again? [Y/N]");
                        yn = scan.nextLine();
                        if (yn.equalsIgnoreCase("N")) {
                            stop = true;
                        }
                    } else if ( guess < number) {
                        System.out.println("My number was " + number);
                        System.out.println("Your guess was to low.");
                        System.out.println("Would you like to play again? [Y/N]");
                        yn = scan.nextLine();
                        if (yn.equalsIgnoreCase("N")) {
                            stop = true;
                        }
                    } else {
                        System.out.println("My number was " + number);
                        System.out.println("You got it right!.");
                        System.out.println("Would you like to play again? [Y/N]");
                        yn = scan.nextLine();
                        if (yn.equalsIgnoreCase("N")) {
                            stop = true;
                        }
                    }
                } else {
                    System.out.println("Sorry, your guess is invalid. Please try again.");
                }
            } else {
                System.out.println("Sorry, your guess is invalid. Please try again");
                scan.nextLine();
            }
        } while (!stop);
    }
}
