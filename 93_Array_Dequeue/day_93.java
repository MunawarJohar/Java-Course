import java.lang.reflect.Array;
import java.util.*;
public class NewTask {
 public static void main(String[] args) {
 ArrayDeque<Integer> adeque=new ArrayDeque<>();
 adeque.add(10);
 adeque.add(20);
 adeque.add(30);
 adeque.add(40);
 adeque.add(50);
 // gives first element of array deque
 System.out.println(adeque.getFirst());
 // give last element of array deque
 System.out.println(adeque.getLast());
 
 }
}
