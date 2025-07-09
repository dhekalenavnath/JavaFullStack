public class ConditionStatements {
    public static void main(String[] args) {
        int number = 10;

        // If statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // If-else statement
        if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is non-negative.");
        }

        // If-else if-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch statement
        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 10:
                System.out.println("The number is ten.");
                break;
            default:
                System.out.println("The number is neither one nor ten.");
                break;
        }
    }
}
