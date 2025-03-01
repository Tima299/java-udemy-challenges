package InheritanceExercise;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    private void moveMuscles() {
        System.out.print("muscles are moving.");
    }

    private void moveBackFin() {
        System.out.print("back fin is moving.");
    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        move("fast");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed.equals("fast")) {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}
