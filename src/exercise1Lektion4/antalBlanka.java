package exercise1Lektion4;

import javax.swing.*;

public class antalBlanka {
    public static void main(String[] args) {
        //Skapa ett program som läser in en mening från en dialogruta. Programmet räknar antalet blanka tecken i texten

        String input = JOptionPane.showInputDialog("Skrive en mening");


        if (input == null) {
            JOptionPane.showMessageDialog(null, "Ingen mening skervs in.");
        } else {
            int blanka = 0;
            int i = 0;

            while (i < input.length()) {

                if (input.charAt(i) == ' ') {
                    blanka++;
                }
                i++;
            }
            JOptionPane.showMessageDialog(null,
                    "Det finns " + blanka + " blanksteg i meningen.");
        }
    }
}
//Check for null before loop if not I will get NullPointerException.