import java.util.Scanner;
public class Main {
 //before using varargs
// static int sum(int a,int b){
// return a+b;
// }
// static int sum(int a,int b,int c){
// return a+b;
// }
 // after using varargs
 static int plus(int ...arr){
 // int [] newArr;
 int result=0;
 for(int newArr:arr){
 result+=newArr;
 }
 return result;
 }
 static int add(int a,int ...arr){
 // int [] newArr;
 int result=0;
 for(int newArr:arr){
 result+=newArr+a;
 }
 return result;
 }
 public static void main(String[] args) {
// calling the methods before using varargs
// System.out.println("Welcome to varargs in java");
//
// System.out.println("The sum of a and b is : "+sum(10,20));
// System.out.println("The sum of a and b and c is : 
"+sum(10,20,40));
 // calling varargs in java
 System.out.println("Plus is zero "+plus());
 System.out.println("Plus the five numbers is : "+plus(3,4,5,6,7));
 System.out.println("Plus the ten numbers : 
"+plus(2,3,5,2,1,3,5,7,8,5));
 // passing one parameter is must
 System.out.println("Calling the add method "+add(3,4));
 }
}
