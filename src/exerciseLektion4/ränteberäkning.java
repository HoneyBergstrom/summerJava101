package exerciseLektion4;

import java.util.Scanner;

public class ränteberäkning {
    public static void main(String[] args) {

        /*Skriv ett program som beräknar hur mycket pengar man får
        på ett bankkonto om man sätter in 1000kr och låter pengarna
        stå inne under ett visst antal år.
        När man kör programmet frågar det efter räntesatsen, som
        anges i procent, och hur många år pengarna skall stå inne
        Som resultat visar programmet en tabell där man kan se hur
        mycket kapitalet har växt efter varje år.
         */

        Scanner sc = new Scanner(System.in);
        double startKapital = 1000.00;

        System.out.println("Enter interest rate : ");
        double interestRate = sc.nextDouble();

        System.out.println("Enter number of years: ");
        int years = sc.nextInt();

        double capital = startKapital;

        for(int i =1;i<= years;i++){
            //dont start with startKapital because its going to be the same but capital will change
            capital = capital * (1+interestRate/100);
            //Before i use years but i change to i so i can print out from year 1 to year ...
            System.out.println("Your current balance in year " +i + " is = " + capital);
        }
            sc.close();

    }
}
