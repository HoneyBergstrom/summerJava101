package shoppingCart;
import java.util.*;

public class main {
    public static void main(String[] args) {
        //Shopping Cart Program

        Scanner sc = new Scanner(System.in);
        String item;
        double price = 10.00;
        int quantity;
        char currency = '$';
        double total ;

        System.out.println("What would you like buy? :");
        item = sc.nextLine();
        System.out.println("You would to buy : " + item);

        System.out.println("what is the price ? :");
        price = sc.nextDouble();
        System.out.println("the price of : " + item + " is" + " " + price + currency);

        System.out.println("How many items do you want to buy? :");
        quantity = sc.nextInt();

        total = price * quantity;
        System.out.println("You have bought : " + quantity +" " + item);
        System.out.println("Total cost is : " + total + currency);

        sc.close();








    }
}
