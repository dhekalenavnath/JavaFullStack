import java.util.*;
class inputs{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a byte value:");
    byte smallNumber = sc.nextByte(); // 1 byte Byte type
    System.out.println("Enter an integer value:");
    int integer = sc.nextInt(); // 4 bytes Integer type
    System.out.println("Enter a float value:");
    float decimal = sc.nextFloat(); // 4 bytes Float type
    System.out.println("Enter a character:");
    char character = sc.next().charAt(0); // 2 bytes Character type
    System.out.println("Enter a boolean value (true/false):");
    boolean flag = sc.nextBoolean(); // 1 bit Boolean type
    System.out.println("Enter a short value:");
    short shortNumber = sc.nextShort(); // 2 bytes Short type
    System.out.println("Enter a long value:");
    long longNumber = sc.nextLong(); // 8 bytes Long type
    System.out.println("Enter a double value:");
    double doubleNumber = sc.nextDouble(); // 8 bytes Double type
    sc.nextLine(); // Consume the newline character left by nextDouble()
    System.out.println("Enter a Paragraph :");
    String s=sc.nextLine();//this will get full names with spaces 
    decimal = 3.14f; // Casting double to float
    // printing all the values
    System.out.println("Byte: " + smallNumber + 
                    "\nInteger: " + integer + 
                       "\nFloat: " + decimal + 
                       "\nCharacter: " + character + 
                       "\nBoolean: " + flag + 
                       "\nShort: " + shortNumber + 
                       "\nLong: " + longNumber + 
                       "\nDouble: " + doubleNumber+
                       "\nStrings:"+s);
    
    }
}