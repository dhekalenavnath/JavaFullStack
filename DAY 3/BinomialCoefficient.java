
public class BinomialCoefficient {
  
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int  bincoeff(int n,int r){
        int factn=factorial(n);
        int factr=factorial(r);
        int factnmr=factorial(n-r);

        return factn/(factr*factnmr);
    }



    public static void main(String args[]) {
       System.out.println("Binomial Coeficient :"+bincoeff(5, 2));
    }

    
}
