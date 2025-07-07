class datatypes {
    public static void main(String[] args) {
        // Primitive Data Types
        int integer = 10; // 4 bytes Integer type
        byte smallNumber = 5; // 1 byte Byte type
        float decimal = 3.14f; // 4 bytes Float type
        char character = 'A'; // 2 bytes Character type
        boolean flag = true; // 1 bit Boolean type
        short shortNumber = 1000; // 2 bytes Short type
        long longNumber = 100000L; // 8 bytes Long type
        double doubleNumber = 3.14159; // 8 bytes Double type

        // Note: The size of boolean is not precisely defined in Java, but it is often considered 1 bit.


       
        // Non-Primitive Data Types
        String text = "Hello, World!"; // 
        int[] numbers = {1, 2, 3, 4, 5}; // Array type 
        

        // Displaying the values
        System.out.println("Byte: " + smallNumber);
        System.out.println("Integer: " + integer);
        System.out.println("Decimal: " + decimal);
        System.out.println("Character: " + character);
        System.out.println("Boolean: " + flag);
        System.out.println("String: " + text);
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}