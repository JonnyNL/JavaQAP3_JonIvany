package Problem3;

class Point {
    // Private instance variables to define x and y points
    private float x;
    private float y;
    
    // Point constructor that accepts x and y
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Default point constructor initializing point x and y
    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    // Getter for X point
    public float getX() {
        return x;
    }

    // Setter for X point
    public void setX(float x) {
        this.x = x;
    }

    // Getter for Y point
    public float getY() {
        return y;
    }

    // Setter for Y point
    public void setY(float y) {
        this.y = y;
    }

    // Setter for points X,Y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter for points X,Y
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Point toString method
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}