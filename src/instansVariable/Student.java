package instansVariable;

import java.util.Arrays;

public class Student {

    //instancevariabler
    String firstName;
    String lastName;
    String email;

    //Klassvariabler
    static String school = "nackademin";
    static String[] courses = {"Java Programming", "C++", "Python", "JavaScript"};

    //Construcktion
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }
    @Override
    public String toString() {
        return "Student" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", school='" + Arrays.toString(courses) + '\'' +
                '}';

    }
}
