package se.lexicon;

public class Car {
//    1a. Create a class “Car” with the following fields:
//    id, year, model, colour, motorSize.
    private int id;
    private int year;
    private String model;
    private String color;
    private String motorSize;

    public Car(int id, int year, String model, String color, String motorSize) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.color = color;
        this.motorSize = motorSize;
    }

    public void drive(){
//        1b. Create a public method “drive” inside “Car” which will print:
//        model + ” with motor ” + motorSize + ” can drive now.”
        System.out.println(model + " with motor " + motorSize + " can drive now.");
    }
}
