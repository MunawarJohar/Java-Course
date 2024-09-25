import java.security.PublicKey;
import java.util.Scanner;
class NegativeRadiusException extends Exception{
 @Override
 public String toString(){
 return "Radius can no be negative";
 }
 @Override
 public String getMessage() {
 return " Radius cannot be negative ";
 }
}
public class Errors_Java {
 public static double area(int r) throws NegativeRadiusException{
 if(r<0){
 throw new NegativeRadiusException();
 }
 double result=Math.PI*r*r;
 return result;
 }
 public static int divide(int a,int b) throws ArithmeticException{
 int result= a/b;
 return result;
 }
 public static void main(String[] args) {
 try {
// int c=divide(8,0);
// System.out.println(c);
 double areas=area(-10);
 System.out.println(areas);
 }
 catch (Exception e){
 System.out.println("Exception");
 }
 }
 