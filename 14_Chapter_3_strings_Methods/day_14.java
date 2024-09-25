import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 String name="Munawar";
 System.out.println(name);
 //find length of string
 int value =name.length();
 System.out.println(value);
 //convert lower case
 String lower=name.toLowerCase();
 System.out.println(lower);
 //convert upper case
 String upper=name.toUpperCase();
 System.out.println(upper);
 //trim method
 String nontrim=" My name is Munawar johar and i am a java 
developer ";
 System.out.println(nontrim);
 String trimMethod=nontrim.trim();
 System.out.println(trimMethod);
 //substring method
 System.out.println(name.substring(4));
 System.out.println(name.substring(0));
 // substring method
 System.out.println(name.substring(1,6));
 //replace method
 System.out.println(name.replace('M','N'));
 System.out.println(name.replace("a","ee"));
 // startwith method
 System.out.println(name.startsWith("Mun"));
 System.out.println(name.startsWith("Num"));
 //end with war
 System.out.println(name.endsWith("war"));
 System.out.println(name.endsWith("mu"));
 //char at
 System.out.println(name.charAt(0));
 System.out.println(name.charAt(2));
 //index of
 System.out.println(name.indexOf("Mu"));
 System.out.println(name.indexOf("mun"));
 //another method of index of
 System.out.println(name.indexOf("a",4));
 System.out.println(name.indexOf("a",0));
 System.out.println(name.indexOf("s",0));
 //last index of
 System.out.println(name.lastIndexOf("n"));
 //last index of another method
 System.out.println(name.lastIndexOf("a",5));
 //equals method
 System.out.println(name.equals("Munawar"));
 System.out.println(name.equals("munawar")); //false becuase java is 
case sensitive
 //equalsIngnoreCase return true if use this method
 System.out.println(name.equalsIgnoreCase("munawar"));
 // escape sequence
 System.out.println("Hell i am a programmer \" this is new");
 System.out.println("This new \\ line");
 System.out.println("My \t name is \t Munawar johar and this is \n
new line");
 }
}
