class typecasting{
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Type Casting: " + doubleValue);

        // Explicit Type Casting (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Type Casting: " + anotherIntValue);

        char charValue = 'A'; // Character 'A'
        int charToInt = (int) charValue; // char to int
        System.out.println("Char to Int: " + charToInt);

    }
}