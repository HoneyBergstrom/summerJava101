package scanner;

import java.util.Scanner;

public class hasNextint {
    public static void main(String[] args) {
        System.out.println("Write a numner in one line and press enter");
        System.out.println("End program by enter CRTL+Z or CTRL+D(win) CMD+D(Mac)");

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}
