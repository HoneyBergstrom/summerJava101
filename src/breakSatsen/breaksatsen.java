package breakSatsen;

import javax.swing.*;

// Import the JOptionPane class for GUI input/output
import javax.swing.JOptionPane;

public class breaksatsen {

    public static void main(String[] args) {

        // Start an infinite loop that will only exit with break
        while (true) {

            // Show an input dialog asking the user for a number
            String s = JOptionPane.showInputDialog("Talet n?");

            // If the user clicks Cancel or closes the dialog, s will be null
            if (s == null) {
                // Exit the loop immediately if s is null
                break;
            }

            // Convert the input String to an integer
            int n = Integer.parseInt(s);

            // Initialize the sum variable to 0
            int summa = 0;

            // Initialize the counter variable k to 1
            int k = 1;

            // Inner loop: add up all numbers from 1 to n
            while (k <= n) {
                // Add k to the current sum
                summa = summa + k;
                // Increment k by 1
                k++;
            }

            // Show the calculated sum in a message dialog
            JOptionPane.showMessageDialog(null, "Summan = " + summa);
        }

        // This line runs after the break statement is executed
        System.out.println("Programmet avslutades av användaren."); // Prints to console when user cancels
    }
}
