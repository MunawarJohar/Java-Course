import java.lang.reflect.Array;
import java.util.*;
public class NewTask {
 public static void main(String[] args) {
 LinkedList <Integer> L1=new LinkedList<>();
 LinkedList <Integer> L2= new LinkedList<>();
 L1.add(6);
 L1.add(10);
 L1.add(12);
 L1.add(5);
 L1.add(15);
 // add 100 in 0 index
 L2.add(1);
 L2.add(2);
 L2.add(3);
 L2.add(5);
 //add element in last
 L1.addLast(40);
 // Add L2 elements in L1 at the end
 L1.addAll(L2);
 L1.add(0,100);
 // All element clear in the list
// L1.clear();
 // Set 300 is replace with 3
 // L1.set(8,300);
 for (int i=0;i<L1.size();i++){
 System.out.println(L1.get(i));
 }
 System.out.println("End list");
 // add first
 L1.addFirst(1000);
 // It return false because 200 is not include in L1
 System.out.println(L1.contains(200));
 // It gives 4 because 5 is located in index 4
 System.out.println(L1.indexOf(5));
 // it gives 9 because the last location of 5 is 9
 System.out.println(L1.lastIndexOf(5));
 }
}