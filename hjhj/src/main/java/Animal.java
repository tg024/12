class Animal {
    public void animalSound() {
        System.out.println("This animal makes a sound:");
    }
}
class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: meow");
    }
}
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: wof");
    }
}
class Main {
    public static void main (String [] args) {
        Animal myAnimal = new Animal(); //Create a Animal object
        Animal myCat = new Cat(); //Create cat object
        Animal myDog = new Dog(); //Create dog object
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}
