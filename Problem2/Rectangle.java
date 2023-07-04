package Problem2;

class Rectangle extends Shape {
    // Private instance variable defining Rectangles width and length
    private double width;
    private double length;

    // default constructor
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    // constructor with parameters
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // getter for width
    public double getWidth() {
        return width;
    }

    // setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // getter for length
    public double getLength() {
        return length;
    }

    // setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // method to calculate area
    public double getArea() {
        return width * length;
    }

    // method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // string representation of rectangle
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}