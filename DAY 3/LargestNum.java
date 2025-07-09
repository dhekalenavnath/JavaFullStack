//// Problem: Find the largest number using conditional statements
class LargestNum{
    public static void main(String[] args) {
        System.out.println("Largest Number Finder");
        int num1 = 10;
        int num2 = 20;
        int num3 = 15; 
        int largest;
        // Using if-else statements to find the largest number
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);
    }
}