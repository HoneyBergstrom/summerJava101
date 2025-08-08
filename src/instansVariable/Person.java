package instansVariable;

public class Person {
    public String firstName;
    public String lastName;

    //En säker instansmetod som sä er namnet
    public void setName(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            this.firstName = firstName; // now matches field names
            this.lastName = lastName;
        } else {
            throw new NullPointerException("First name or last name cannot be null");
        }
    }

    //En säker instansmetod som hämtar namnet
    public String getName() {
        if (this.firstName != null && this.lastName != null)
            return this.firstName + " " + this.lastName;
        else
            return "Guest";
    }
}