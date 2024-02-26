package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int userInput = scanner.nextInt();

        try {
            checkRange(userInput);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkRange(int userInput) throws InvalidInputException {
        int minRange = 1;
        int maxRange = 10;

        if (userInput < minRange || userInput > maxRange) {
            throw new InvalidInputException("daxil etdiyiniz eded " + minRange + " ile " + maxRange + " arasinda olmalidir.");
        } else {
            System.out.println("daxil etdiyiniz eded duzgundur");
        }
    }
}
