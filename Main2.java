//9) Create an abstract class called Animal with the following properties and methods:
//Properties:
//name (String)
//age (int)
//Methods:
//abstract void makeSound(): This method should be implemented by each subclass of Animal and should print the sound made by the specific animal.
//Create two subclasses of Animal called Dog and Cat. 
//Implement the makeSound() method in each subclass to print the sound made by a dog and a cat, respectively.
//In the Main class, create instances of Dog and Cat,

public class Main2 {
    public static void main(String[] args) 
    {
        Dog dog = new Dog("Lucy",3);
        Cat cat = new Cat("Leo",4);
        
        
        dog.makeSound(); // Output: The dog Buddy barks.
        cat.makeSound(); // Output: The cat Whiskers meows.
    }
}

