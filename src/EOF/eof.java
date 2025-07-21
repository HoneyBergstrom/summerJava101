package EOF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eof  {
    // EOF is a state in the operating system when no more data can be read from a source.
    // Let the user enter numbers one line at a time (e.g., 10, 5, 20)
    // The program should calculate the total sum of all the entered numbers
    // and display the result when the user presses EOF to end input

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        double sum = 0;

        System.out.println("Enter the numbers (Press CTRL+Z or CTRL+D to stop)");

        while ((line = br.readLine()) != null) {
            double num = Double.parseDouble(line); // Don't forget to parse! Input from the user is a String, otherwise we can't use it in calculations
            sum += num; // The running total of the numbers entered by the user
        }

        System.out.println("The sum of the digits is " + sum);
    }
}
