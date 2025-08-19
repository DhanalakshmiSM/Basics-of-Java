    class Animal {
        protected String name;
        protected int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    class Dog extends Animal {
        private String breed;

        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }
    }

    class Cat extends Animal {
        private String breed;

        public Cat(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }
        public static void main(String[] args) {
            Dog dog = new Dog("Buddy", 3, "Golden Retriever");
            Cat cat = new Cat("Whiskers", 2, "Siamese");
        }
        
    }
    