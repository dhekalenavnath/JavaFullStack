import java.util.*;
class Shop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of Pencil pen and Eraser: ");
        float pencil,pen,eraser;
        pencil=sc.nextFloat();
        pen=sc.nextFloat();
        eraser=sc.nextFloat();
        System.out.println("Total Cost of items with 18%gst="+((pencil+pen+eraser)));
        
 
    }
}