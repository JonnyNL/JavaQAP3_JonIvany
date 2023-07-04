package Problem2;

class Circle extends Shape {
    // Private instance variable defining radius
    private double radius;

    // default constructor
    public Circle() {
        radius = 1.0;
    }

    // constructor that accepts radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // constructor that accepts radius, color, and filled boolean
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // getter for radius
    public double getRadius() {
        return radius;
    }

    // setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // method to calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Circle Strig representation
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}