import java.util.Scanner;
public class Errors_Java {
 public static void main(String[] args) {
 int [] marks=new int[3];
 marks[0]=7;
 marks[1]=10;
 marks[2]=20;
 Scanner sc=new Scanner(System.in);
 boolean answer=true;
 while (answer) {
 int index = sc.nextInt();
 try {
 System.out.println("Welcome to lecture 82");
 try {
 System.out.println(marks[index]);
 answer=false;
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Sorry this index does not exists");
 System.out.println("Exception in level 2");
 }
 } catch (Exception e) {
 System.out.println("Exception in level 1");
 }
 System.out.println("Try Exception is Complete");
 }
// int [] marks=new int[3];
// marks[0]=7;
// marks[1]=10;
// marks[2]=20;
//
// Scanner sc=new Scanner(System.in);
// int index=sc.nextInt();
// try {
// System.out.println("Welcome to lecture 82");
// try {
// System.out.println(marks[index]);
// }
// catch (ArrayIndexOutOfBoundsException e){
// System.out.println("Sorry this index does not exists");
// System.out.println("Exception in level 2");
// }
// }
// catch (Exception e){
// System.out.println("Exception in level 1");
// }
 }
}