import java.util.*; 
// Importing the Scanner class for user input
class AreaOfCircle{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radius of the circle: ");
    double radius = sc.nextDouble();
    double area = Math.PI * radius * radius;// Calculating the area of the circle using the formula πr²
    // Math.PI provides the value of π (pi) in Java
    System.out.println("The area of the circle is: " + area);// Displaying the calculated area
    System.out.println(Math.PI); // Displaying the area with 2 decimal places

    sc.close();
    }
}