package se.lexicon;

public class Rectangle {
    //2a. Create a class “Rectangle” with the following fields:
    //height, width. (both should be double values.)
    private double height;
    private double width;

    public Rectangle(){
        //2b. Make two constructors, one default constructor without parameters and the second
        //constructor which should take two parameters (height and weight).

    }
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea(double height, double width){
        //2d. Write public method “getArea” which will return area (height*weight).
        double area;
        area = height * width;
        return area;
    }

    public double getArea2(double height, double width){
        //2d. Write public method “getArea” which will return area (height*weight).
        return width * height;
    }

    //2c. Add getter and setter for height and width fields.
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
