import java.security.PublicKey;
import java.util.Scanner;
class MyException extends Exception{
 @Override
 public String toString(){
 return super.toString()+"I am to String()";
 }
 @Override
 public String getMessage() {
 return "I am get message() ";
 }
}
class AgeException extends Exception{
 @Override
 public String toString(){
 return "Age cannot be greater than 150 ";
 }
 @Override
 public String getMessage() {
 return "Make sure that the value of age entered is correct ";
 }
}
public class Errors_Java {
 public static void main(String[] args) {
 int a;
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 if(a<100){
 try {
// throw new MyException();
 throw new ArithmeticException("This is new arithmetic 
exception:");
 }catch (Exception e){
 System.out.println(e.getMessage());
 System.out.println(e.toString());
 System.out.println(e);
 e.printStackTrace();
 }
 System.out.println("Finished");
 }
 
}
}