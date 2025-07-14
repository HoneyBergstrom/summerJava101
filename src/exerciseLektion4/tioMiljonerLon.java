package exerciseLektion4;

import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class tioMiljonerLon {
    public static void main(String[] args) {
        /*Första dagen tjänar man ett öre och sedan
        fördubblas lönen varje dag. Skriv ett program som räknar ut hur länge
        man behöver arbeta för att tjäna ihop 10
        miljoner kronor.
        */

        int workingDay = 1;
        double dailySalary = 0.01; // 1 penny in SEK (should be 0.01, not 0.1)
        double totalSalary = 0.0;
        double target = 10_000_000; // 10 million SEK

        // Use a while loop because we do not know how many days it will take to reach 10 million.

        while(totalSalary < target) {
            totalSalary += dailySalary;
            dailySalary *=2; // Double the salary for the next day
            workingDay++;

        }
        System.out.println("you have to work " + workingDay+" day to earn 10 million kronor");


    }
}
