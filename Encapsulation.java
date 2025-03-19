class Person {
    private String name;  // Private variable
    private int age;  

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) {  // Data validation
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25);

        // Accessing data via getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying data via setter methods
        person.setAge(30);
        System.out.println("Updated Age: " + person.getAge());

        person.setAge(-5); // Invalid input test
    }
}
