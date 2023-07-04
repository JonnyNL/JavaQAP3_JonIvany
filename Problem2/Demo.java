package Problem2;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Start of sample tests");
        System.out.println(" ");
        
        System.out.println("Created new Shape");
        Shape S = new Shape("Red", true);
        System.out.println(S);

        System.out.println(" ");
        System.out.println("Created new Circle");
        Circle C = new Circle(5.0);
        System.out.println(C);
        System.out.println("Area: " + C.getArea());
        System.out.println("Perimeter: " + C.getPerimeter());

        System.out.println(" ");
        System.out.println("Created a different Circle");
        Circle C1 = new Circle(5.0, "blue", true);
        System.out.println(C1);
        System.out.println("Area: " + C1.getArea());
        System.out.println("Perimeter: " + C1.getPerimeter());

        System.out.println(" ");
        System.out.println("Created a new Rectangle");
        Rectangle R = new Rectangle(2.0, 3.0);
        System.out.println(R);
        System.out.println("Area: " + R.getArea());
        System.out.println("Perimeter: " + R.getPerimeter());

        System.out.println(" ");
        System.out.println("Created a different Rectangle");
        Rectangle R1 = new Rectangle(2.0, 3.0, "green", false);
        System.out.println(R1);
        System.out.println("Area: " + R1.getArea());
        System.out.println("Perimeter: " + R1.getPerimeter());

        System.out.println(" ");
        System.out.println("Created a new Square");
        Square Sq = new Square(4.0);
        System.out.println(Sq);
        System.out.println("Area: " + Sq.getArea());
        System.out.println("Perimeter: " + Sq.getPerimeter());

        System.out.println(" ");
        System.out.println("Created a different Square");
        Square Sq1 = new Square(4.0, "yellow", true);
        System.out.println(Sq1);
        System.out.println("Area: " + Sq1.getArea());
        System.out.println("Perimeter: " + Sq1.getPerimeter());

        System.out.println(" ");
        System.out.println("End of Sample Testing...");
        System.out.println("vv Additional Tests vv");

        // Testing Shape Set Methods
        System.out.println(" ");
        System.out.println("Before: " + S);
        System.out.println("Using setColor() and setFilled() to change Shape color to Green and filled status to false");
        S.setColor("Green");
        S.setFilled(false);
        System.out.println("After: " + S);

        // Testing Circle Set Radius
        System.out.println(" ");
        System.out.println("Before: " + C);
        System.out.println("Using setRadius() to change Circle radius to 3.5");
        C.setRadius(3.5);
        System.out.println("After: " + C);

        // Testing Rectangle setWidth and setLength methods
        System.out.println(" ");
        System.out.println("Before: " + R);
        System.out.println("Using setWidth() and setLength() to change Rectangle width to 4.0 and length to 5.0");
        R.setWidth(4.0);
        R.setLength(5.0);
        System.out.println("After: " + R);

        // Modify square properties
        System.out.println(" ");
        System.out.println("Before: " + Sq);
        System.out.println("Using setSide() to change Square side to 6.0");
        Sq.setSide(6.0);
        System.out.println("After: " + Sq);

        System.out.println("");
        System.out.println("End of additional tests");
    }
}