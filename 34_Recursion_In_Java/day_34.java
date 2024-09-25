import java.util.Scanner;
public class Main {
    // factorial(n)=n*n-1*...1
    // factorial (5) =5*4*3*2*1 =120
    // factorial (n) n*factorial(n-1)
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            //first method
            return n*factorial(n-1);
//            // second method
//            int product=1;
//            for(int i=1;i<=n;i++){
//                product+=1;
//            }
//            return product;

        }

    }
    public static void main(String[] args) {
        //Recursion in java
        int fac=5;
        System.out.println("The factorial of 5 is "+factorial(fac));
        System.out.println("The factorial of 4 is "+factorial(4));
    }

}
