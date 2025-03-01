package InheritanceExercise;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", "Large", 100);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 10);
        doAnimalStuff(yorkie, "medium");

        Dog germanShepherd = new Dog("German Shepherd", 80);
        doAnimalStuff(germanShepherd, "fast");

        Dog goldenRetriever = new Dog("Golden Retriever", 70, "floppy", "straight");
        doAnimalStuff(goldenRetriever, "medium");

        Dog poodle = new Dog("Poodle", 50, "curly", "curly");
        doAnimalStuff(poodle, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "slow");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal.toString());
        System.out.println("----------------------");
    }
}