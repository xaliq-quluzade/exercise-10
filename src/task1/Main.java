package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void squareNumber() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("enter number:");
            int i = scanner.nextInt();
            System.out.println(i * i);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("enter a valid integer");
            squareNumber();
        }

    }

    public static void main(String[] args) {
        squareNumber();
    }
}