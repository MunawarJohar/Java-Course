
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
//class Cylinder{
// private int radius;
// private int height;
// // Question 3
// public Cylinder(int radius, int height) {
// this.radius = radius;
// this.height = height;
// }
////
// public int getRadius() {
// return radius;
// }
////
//// public void setRadius(int radius) {
//// this.radius = radius;
//// }
////
// public int getHeight() {
// return height;
// }
////
//// // Question 2
//// public void setHeight(int height) {
//// this.height = height;
//// }
//// public double SurfaceArea(){
//// return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
//// }
//// public double Volume(){
//// return Math.PI*radius*radius*height;
//// }
////}
// Question 4
//class Rectangle{
// private int length;
// private int height;
//
// public Rectangle(int length, int height) {
// this.length = length;
// this.height = height;
// }
// public Rectangle() {
// this.length = 4;
// this.height = 5;
// }
//
// public int getLength() {
// return length;
// }
//
// public int getHeight() {
// return height;
// }
//}
// Question 5
class Sphere{
 private int raduis;
 public Sphere(int raduis) {
 this.raduis = raduis;
 }
 public double getArea() {
 return 4*Math.PI*raduis*raduis;
 }
}
public class Main {
 public static void main(String[] args) {
// // Question 1
// Cylinder mycylinder=new Cylinder();
// mycylinder.setHeight(16);
// int h=mycylinder.getHeight();
// System.out.println(h);
//
// mycylinder.setRadius(4);
// int r=mycylinder.getRadius();
// System.out.println(r);
//
// // Question 2
// System.out.println(mycylinder.SurfaceArea());
// System.out.println(mycylinder.Volume());
//
// // Question 3
// Cylinder cy=new Cylinder(4,5);
// System.out.println(cy.getHeight());
// System.out.println(cy.getRadius());
// // Question 4
// // for default constructor
// Rectangle rect=new Rectangle(5,77);
// System.out.println("This is height"+rect.getHeight());
// System.out.println("This is lenght"+rect.getLength());
// // for custom constructor
//
// Rectangle cusReact=new Rectangle();
// System.out.println(cusReact.getHeight());
// System.out.println(cusReact.getLength());
 // Question 5
 Sphere sp=new Sphere(4);
 System.out.print("Area is : ");
 System.out.println(sp.getArea());
 }
}