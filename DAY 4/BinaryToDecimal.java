import java.util.*;
public class BinaryToDecimal {

    public static void BinTODec(int n){
        int mynum=n;
        int dec=0;
        int pow=0;

        while(n>0){
            int lastd=n%10;
            dec=dec+(lastd*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }

        System.out.println("Decimal Number of "+mynum+"="+dec);

        
    }
    
    public static void main(String []args){
      BinTODec(1111);
        
    }
}
