class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("The dog " + name + " barks.");
    }
}