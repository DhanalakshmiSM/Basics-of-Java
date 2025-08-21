// 5. Animal Sounds
// Problem: Base class Animal has makeSound(). Subclasses Dog, Cat, Cow override it.
// Steps:
// 1.	Create class Animal with method void makeSound().
// 2.	Override: Dog → "Bark", Cat → "Meow", Cow → "Moo".
// 3.	In main(), test all.

class Animal{
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
class Cow extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cow moos");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}