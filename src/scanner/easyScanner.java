package scanner;

import java.util.Scanner;

public class easyScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name ?: ");
        //เอาไปเก็บไว้ที่ name
        String name = scanner.nextLine();

        System.out.println("what is your age ?: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

    }
}
