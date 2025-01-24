package AssistedProblems;
public class AnimalHierarchy { 

    // Abstract superclass
    abstract static class Animal {
        String name;
        int age;

        // Constructor
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Abstract method for sound
        public abstract void makeSound();
    }

    // Subclass: Dog
    static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("Dog barks!");
        }
    }

    // Subclass: Cat
    static class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("Cat meows!");
        }
    }

    // Subclass: Bird
    static class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("Bird chirps!");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create objects of subclasses
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        // Call makeSound method
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
