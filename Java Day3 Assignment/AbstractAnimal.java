// 18. Abstract Animal
// Problem: Abstract class Animal with makeSound(). Implement in Dog, Cat.
// Steps:
// 1.	Define abstract Animal.
// 2.	Implement sound logic in Dog + Cat.
// 3.	Print sounds.

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
public class AbstractAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
