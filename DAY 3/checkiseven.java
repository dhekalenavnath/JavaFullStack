
/* 
Q. Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.
*/
class checkiseven{
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(10)); // true
        System.out.println(isEven(11)); // false
        }
}