import java.util.Scanner;
public class Errors_Java {
 public static void main(String[] args) {
 int [] marks=new int[3];
 marks[0]=7;
 marks[1]=10;
 marks[2]=20;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the array index");
 int ind=sc.nextInt();
 System.out.println("Enter the number you want to divide the value 
with");
 int number=sc.nextInt();
 try {
 System.out.println("The value at array index is :"+marks[ind]);
 System.out.println("The value if array value / number us 
:"+marks[ind]/number);
 }
 catch (ArrayIndexOutOfBoundsException a) {
 System.out.println("Some exception is occur :");
 System.out.println(a);
 }
 catch (ArithmeticException a) {
 System.out.println("Some exception is occur :");
 System.out.println(a);
 }
 catch (Exception e) {
 System.out.println("Some exception is occur :");
 System.out.println(e);
 }
 System.out.println("End the program");
 }
}