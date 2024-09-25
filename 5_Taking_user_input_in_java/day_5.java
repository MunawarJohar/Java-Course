import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 System.out.println("Taking input from user class : ");
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter number 1");
 int a=scan.nextInt();
 System.out.println("Enter number 2");
 int b=scan.nextInt();
 int sum=a+b;
 System.out.println("The sum of these numbers is ");
 System.out.println(sum);
// for float values
 System.out.println("Enter number float 1");
 float c=scan.nextFloat();
 System.out.println("Enter number flaot 2");
 float d=scan.nextFloat();
 float s=c+d;
 System.out.println("The sum of these flaots numbers is ");
 System.out.println(s);
 System.out.println("For boolean");
 boolean n=scan.hasNextBoolean();
 System.out.println(n);
 String str=scan.nextLine();
 System.out.println(str);
 }
}
