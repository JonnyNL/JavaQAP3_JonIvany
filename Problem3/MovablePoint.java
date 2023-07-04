package Problem3;

class MovablePoint extends Point {
    //Private instance variables to define xSpeed and ySpeed floats
    private float xSpeed;
    private float ySpeed;

    // MoveablePoint Constructor with x, y, xSpeed, and ySpeed parameters
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // MoveablePoint Constructor with xSpeed and ySpeed parameters
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Default constructor
    public MovablePoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    // Getter for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    // Setter for xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter for ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Method to set xSpeed and ySpeed simultaneously
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Method to get xSpeed and ySpeed as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Overridden toString() method to include xSpeed and ySpeed
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }

    // Method to move the point by adding xSpeed and ySpeed to current coordinates
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}