import java.lang.reflect.Array;
import java.util.*;
public class NewTask {
 public static void main(String[] args) {
// Calendar cal=Calendar.getInstance();
// // This print gregory calendar
// System.out.println(cal.getCalendarType());
//
// System.out.println(cal.getTimeZone());
 Calendar 
c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Karachi"));
 // This print gregory calendar
 System.out.println(c.getCalendarType());
 System.out.println(c.getTimeZone());
 }
}