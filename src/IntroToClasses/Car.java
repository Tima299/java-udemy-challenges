package IntroToClasses;

public class Car {
    private String make = "Ford";
    private String model = "Mustang";
    private String color = "Red";
    private int doors = 2;
    private boolean convertible = true;
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        if(make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase(); //it will convert the make to lowercase
        switch(lowerCaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public boolean isConvertible() {
        return convertible;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    public void describeCar() {
        System.out.println(doors + "-Doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}

