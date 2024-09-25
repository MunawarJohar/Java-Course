import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 int a=6*5-34/2;
 /*
highest precedence goes to * and /.
they are the evaluated on the basic of left to right associavity.
 30-34/2
 30-17
 13
 */
 int b=60/5-34*2;
 // left to right
 /*
 12-34*2
 12-68
 -56
 */
 System.out.println(a);
 System.out.println(b);
 // Precendence and Associativity
 int c=b=45;
 //Right to left
 System.out.println(c);
 //Quiz questions
 int x=6,y=3;
 int k=x-y/2;
 System.out.println(k);
 //Q 2
 int n=b*b -(4*a*c)/(2*a);
 System.out.println(n);
 //Q 3
 int v=2,u=8;
 int r=v*v-u*u;
 System.out.println(r);
 int d=4;
 int result=a+b-d;
 System.out.println(result);
 }}