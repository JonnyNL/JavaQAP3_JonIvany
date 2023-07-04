package Problem2;

class Shape {
    // Private instance variable defining shapes color and filled boolean value
    private String color;
    private boolean filled;

    // default constructor
    public Shape() {
        color = "red";
        filled = true;
    }

    // constructor with parameters
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // getter for color
    public String getColor() {
        return color;
    }

    // setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // getter for filled
    public boolean isFilled() {
        return filled;
    }

    // setter for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // string representation of shape
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}