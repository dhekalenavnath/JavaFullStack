import java.util.*;
class AreaOfSquare{
    public static void main(String args[]){
        System.out.print("Enter side of the Square:");
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        System.out.println("Area of Square="+side*side);
    }
}