// defining the superclass Animal
class Animal {
    String name;
    int age;

    // initializing the animal attributes
    Animal(String name, int age) {
        this.name= name;
        this.age= age;
    }

    // defining a generic sound method
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// creating the Dog subclass
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    // overriding to make a bark sound
    @Override
    void makeSound() {
        System.out.println(name+ " says: Woof Woof!");
    }
}

// creating the Cat subclass
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    // overriding to make a meow sound
    @Override
    void makeSound() {
        System.out.println(name+ " says: Meow!");
    }
}

// creating the Bird subclass
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    // overriding to make a chirp sound
    @Override
    void makeSound() {
        System.out.println(name+ " says: Chirp Chirp!");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        // creating instances of different animals
        Animal d= new Dog("Buddy", 3);
        Animal c= new Cat("Whiskers", 2);
        Animal b= new Bird("Tweety", 1);

        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}