public class StarPatterns{
    public static void main(String[] args) {
        // Loop for each row
        /*
         * This code prints a right-angled triangle pattern of stars.
         *
         * *
         * * *
         * * * *
         */
        System.out.println("Right-Angled Triangle Pattern:");
       for(int i=1;i<=4;i++){
        // printing number of columns
       for(int j=1;j<=i;j++){
            System.out.print("* ");
       }
        // Move to the next line after each row
         System.out.println();
       }

       /*
        * This code prints an inverted right-angled triangle pattern of stars.
        */
        System.out.println("Inverted Right-Angled Triangle Pattern:");
        
        for(int i=0;i<4;i++){
          for(int j=4;j>i;j--){
            System.out.print("* ");
          
          }
          System.out.println();
        }

        /*
         * This code prints a half with numbers pyramid pattern of stars.
         */
        System.out.println("Half Pyramid with Numbers Pattern:");

        for(int i=1;i<=4;i++){
          for(int j=1;j<=i;j++){
            System.out.print(j + " ");
          }
          System.out.println();
        }
        /*
         * This code prints a pattern of characters in a pyramid shape.
         */
        System.out.println("Character Pyramid Pattern:");
        char ch = 'A';
        for(int i=1;i<=4;i++){
          for(int j=1;j<=i;j++){
            System.out.print(ch + " ");
            ch++;
          }
          System.out.println();
        }

    }
}
