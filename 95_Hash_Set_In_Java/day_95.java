import java.lang.reflect.Array;
import java.util.*;
public class NewTask {
 public static void main(String[] args) {
 // visit the java 19 documentation
 HashSet<Integer> myhash=new HashSet<>(6,0.5f);
 // In hash set value cannot be duplicate for example 10 add 2 times 
but only show in 1
 myhash.add(10);
 myhash.add(20);
 myhash.add(10);
 myhash.add(5);
 System.out.println(myhash);
 // clear () clear all the elements in set
 // remove 
 myhash.remove(10);
 System.out.println(myhash);
 }
}
