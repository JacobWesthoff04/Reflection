public class Cat {
    private String name;
    private int age;
    private String breed;
    private double weight;

    // Constructor
    public Cat(String name, int age, String breed, double weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }

    // Public methods
    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    public void displayInfo() {
        System.out.println("Cat Info - Name: " + name + ", Age: " + age + ", Breed: " + breed + ", Weight: " + weight + " lbs");
    }

    // Private methods
    private void purr() {
        System.out.println(name + " is purring...");
    }

    private void sleep() {
        System.out.println(name + " is sleeping...");
    }
}
