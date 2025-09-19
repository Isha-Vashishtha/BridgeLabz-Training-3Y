// Hybrid Inheritance Example 1: Restaurant Management System
// Class Inheritance + Interface Implementation

// Superclass
class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface for multiple inheritance behavior
interface Worker {
    void performDuties();
}

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking " + specialty + " dishes.");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving " + tablesAssigned + " tables.");
    }
}

// Driver Class
public class RestaurantSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Arjun", 101, "Italian");
        Worker waiter = new Waiter("Riya", 102, 5);

        System.out.println("=== Restaurant Management ===");
        chef.performDuties();
        waiter.performDuties();
    }
}
