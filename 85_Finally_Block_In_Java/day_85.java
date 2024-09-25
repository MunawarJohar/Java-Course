import java.security.PublicKey;
import java.util.Scanner;
public class Errors_Java {
 public static int Greet() {
 try {
 int a = 55;
 int c = 0;
 int d = a / c;
 return d;
 } catch (Exception e) {
 System.out.println(e);
 } finally {
 System.out.println("Cleaning up resources This is the end of this 
Methods .");
 }
 return -1;
 }
 public static void main (String[]args){
 int g=Greet();
 System.out.println(g);
 int a=5;
 int b=15;
 while (true){
 try {
 System.out.println(a/b);
 }catch (Exception e){
 System.out.println(e);
 break;
 }
 finally {
 System.out.println("I am finally for value of b="+b);
 }
 b--;
 }
 try {
 System.out.println(40/10);
 }finally {
 System.out.println("Yes I am Finally ..");
 }
 }
 }