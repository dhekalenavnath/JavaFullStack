class typepromotion{
    public static void main(String[] args){

        char ch = 'A'; // Character 'A'
        int a=10;
        short b=20;
        byte c=30;
        long d=40;
        double e=50.5;
        float f=60.5f;
        //b=ch*ch; // Implicit type promotion occurs here, char is promoted to int

        System.out.println(a+b+c+d+e+f+ch); // Type promotion occurs here, all values are promoted to double for addition
        // In Java, when performing arithmetic operations, smaller data types are promoted to larger data types
        // to avoid data loss. For example, byte and short are promoted to int, and
        // int is promoted to long, float, or double as needed.
        // This ensures that the result of the operation can accommodate the range of all involved types.

    }
}