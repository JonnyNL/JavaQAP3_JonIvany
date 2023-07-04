package Problem2;


class Square extends Rectangle {
    // default constructor
    public Square() {
        super();
    }

    // constructor with parameters
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // getter for side (width and length are the same)
    public double getSide() {
        return getWidth();
    }

    // setter for side
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // override the setWidth to ensure square property
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // override the setLength to ensure square property
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // string representation of square
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}