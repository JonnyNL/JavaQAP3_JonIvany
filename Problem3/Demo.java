package Problem3;

public class Demo {
    public static void main(String[] args) {
        // Test Point class
        System.out.println("vv Start of testing for Point Class vv");
        System.out.println("");

        System.out.println("Created a new point");
        Point p1 = new Point(2.5f, 3.0f);
        System.out.println("Point p1: " + p1.toString());

        System.out.println("");
        System.out.println("Created a different point");
        Point p2 = new Point();
        System.out.println("Point p2: " + p2.toString());

        System.out.println("");
        System.out.println("Using setX() to set x coordinate of p1 to 4.2");
        p1.setX(4.2f);
        System.out.println("Using setY() to set y coordinate of p1 to 1.8");
        p1.setY(1.8f);
        System.out.println("After setting x and y coordinates of p1: " + p1.toString());

        System.out.println("");
        System.out.println("Using setXY() to set x and y coordinates of p2 to 5.0 and 6.2");
        p2.setXY(5.0f, 6.2f);
        System.out.println("After setting x and y coordinates of p2: " + p2.toString());

        System.out.println("");
        System.out.println("Using getXY() to get the coordinates of p1");
        float[] p1Coordinates = p1.getXY();//using method to create array of coords
        System.out.println("Coordinates of p1: (" + p1Coordinates[0] + "," + p1Coordinates[1] + ")");

        // Test MovablePoint class
        System.out.println("");
        System.out.println("End of Testing for Point Class...");
        System.out.println("vv Start of Testing for Movable Point class vv");
        
        System.out.println("");
        System.out.println("Created a new Movable Point");
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.8f);
        System.out.println("MovablePoint mp1: " + mp1.toString());

        System.out.println("");
        System.out.println("Created a different Movable Point");
        MovablePoint mp2 = new MovablePoint();
        System.out.println("MovablePoint mp2: " + mp2.toString());

        System.out.println("");
        System.out.println("Using setXSpeed() to set xSpeed of mp1 to 1.2");
        mp1.setXSpeed(1.2f);
        System.out.println("Using setYSpeed() to set ySpeed of mp1 to 0.7");
        mp1.setYSpeed(0.7f);
        System.out.println("After setting xSpeed and ySpeed of mp1: " + mp1.toString());

        System.out.println("");
        System.out.println("Using setSpeed() to set xSpeed and ySpeed of mp2 to 0.3 and 0.9");
        mp2.setSpeed(0.3f, 0.9f);
        System.out.println("After setting xSpeed and ySpeed of mp2: " + mp2.toString());

        System.out.println("");
        System.out.println("Using getSpeed() to get the speed of mp1");
        float[] mp1Speed = mp1.getSpeed();
        System.out.println("Speed of mp1: (" + mp1Speed[0] + "," + mp1Speed[1] + ")");

        System.out.println("");
        System.out.println("Using move() to move mp1");
        mp1.move();
        System.out.println("After moving mp1: " + mp1.toString());

        System.out.println("");
        System.out.println("End of Testing for Movable Point...");
    }
}