 import java.util.Scanner;
public class Main {
 static int logic(int x,int y){
 int z;
 if(x>y){
 z=x+y;
 }
 else {
 z=(x+y)*5;
 }
 return z;
 }
 // create another method
 int newlogic(int x,int y){
 int z;
 if(x>y){
 z=x+y;
 }
 else {
 z=(x+y)*5;
 }
 return z;
 }
 public static void main(String[] args) {
 // Java methods
// before used java method
 int a=5;
 int b=3;
 int c;
 if(a>b){
 c=a+b;
 }
 else{
 c=(a+b)*5;
 }
 int a1=50;
 int b2=30;
 int c1;
 if(a1>b2){
 c1=a1+b2;
 }
 else{
 c1=(a1+b2)*5;
 }
 System.out.println(c);
 System.out.println(c1);
 // after using java method
 int sum=logic(20,3);
 System.out.println(sum);
 // object creation
 Main obj=new Main();
 int o=obj.newlogic(44,3);
 System.out.println(o);
 }
}
