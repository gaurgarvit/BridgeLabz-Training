import java.util.Scanner;

class Circle {
    double radius;

    // constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // method to calculate area of the circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // method to calculate circumference of the circle
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // method to display area and circumference
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        Circle c= new Circle(s.nextDouble()); 
        c.displayDetails();
    }
}
