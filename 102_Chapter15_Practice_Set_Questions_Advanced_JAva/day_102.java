import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalTime;
public class NewTask {
 public static void main(String[] args) {
// // Question 1
// ArrayList arr=new ArrayList();
// arr.add("Student 1");
// arr.add("Student 2");
// arr.add("Student 3");
// arr.add("Student 4");
// arr.add("Student 5");
// arr.add("Student 6");
// arr.add("Student 7");
// arr.add("Student 8");
// arr.add("Student 9");
// arr.add("Student 10");
// for (Object o: arr){
// System.out.println(o);
// }
//
// // Question 5
// HashSet<Integer> s=new HashSet();
// s.add(10);
// s.add(19);
// s.add(100);
// s.add(200);
// s.add(10);
// System.out.println(s);
// // Question 2
// Date d=new Date();
// 
System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
// // Question 3
// Calendar cal=Calendar.getInstance();
// System.out.println(cal.get(Calendar.HOUR)+":"+ 
cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
 // Question 4
 LocalTime datetime=LocalTime.now();
 DateTimeFormatter 
datefarmeter=DateTimeFormatter.ofPattern("H//m//s");
 String mydate= datetime.format(datefarmeter);
 System.out.println(mydate);
 }
}