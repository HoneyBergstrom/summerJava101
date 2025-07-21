package scanner;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;

public class loadingTextFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: "); // Ask the user to input their name
        String name = sc.nextLine(); // Read user input from the terminal

        // Writing to the file
        try {
            BufferedWriter in = new BufferedWriter(
                    new FileWriter("C:\\Users\\phuen\\IdeaProjects\\Javamapp\\summerJava101\\src\\scanner\\test.txt", true)); // true = append mode (doesn't overwrite)

            // Write the entered name to the file followed by a new line
            in.write(name + '\n');
            in.close(); // Close the file to save changes and free resources

            System.out.println("Your name has been written to the text file.");

        } catch (FileNotFoundException e) {
            // If the file path is incorrect or not found, print an error message
            out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            // If any other input/output error occurs, throw a runtime exception
            throw new RuntimeException(e);
        }
    }
}
