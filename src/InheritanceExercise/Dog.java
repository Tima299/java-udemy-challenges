package InheritanceExercise;


public class Dog extends Animal {
    private String earShape;
    private String tailShape;


    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, (weight < 15 ? "small" : (weight < 35) ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public void run() {
        System.out.println("Dog is running.");
    }

    public void walk() {
        System.out.println("Dog is walking.");
    }

    public void wagTail() {
        System.out.println("Tail is wagging.");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }


    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.print("Ow Wooooo! ");
        }
        bark();
        System.out.println();
    }



    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed.equals("slow")) {
            walk();
            wagTail();
        } else if (speed.equals("medium")) {
            walk();
        }
    }
}

