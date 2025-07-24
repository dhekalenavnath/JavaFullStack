public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 13; // Example decimal number
        String binaryString = "";

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryString = remainder + binaryString; // Prepend the remainder
            decimalNumber = decimalNumber / 2; // Update the number
        }

        System.out.println("Binary representation: " + binaryString);
    }
}