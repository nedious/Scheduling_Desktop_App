// understanding getters + setters more

/**
 * the Person class has private fields name and age. The getters and setters allow access to these private fields
 * from outside the class:
 *
 *     The getName() method is a getter for the name field, which returns the current value of name.
 *     The setName() method is a setter for the name field, which allows setting a new value for name.
 *     The getAge() method is a getter for the age field, which returns the current value of age.
 *     The setAge() method is a setter for the age field, which allows setting a new value for age. It performs a
 *     validation check to ensure the new age is a positive integer. If the validation fails, it prints an error message.
 *
 * Using getters and setters, you can control access to the private fields and add logic for data validation or perform
 * additional actions whenever a field is accessed or modified. This promotes encapsulation and helps maintain the
 * integrity of the object's state.
*/

public class Person {
    private String name;
    private int age;

    // Getter for 'name' field
    public String getName() {
        return name;
    }

    // Setter for 'name' field
    public void setName(String newName) {
        name = newName;
    }

    // Getter for 'age' field
    public int getAge() {
        return age;
    }

    // Setter for 'age' field
    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        } else {
            System.out.println("Invalid age value. Age must be a positive integer.");
        }
    }
}
