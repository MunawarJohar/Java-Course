import javax.naming.CannotProceedException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
@FunctionalInterface
interface myinterface{
 void oneinterface();
 // if we used two methods in this class then error is occur because it is 
functional interface 
// void secondinterface();
}
class phone{
public void time(){
 System.out.println("Time is 10 AM");
}
}
class newphone extends phone{
 @Override // overwrite notation help for overwriting
public void time(){
 System.out.println("Time is 10 PM");
}
@Deprecated
public int add(int a,int b){
 return a+b;
}
}
public class NewTask {
 @SuppressWarnings("deprecation")
 public static void main(String[] args) {
 newphone ph=new newphone();
 ph.time();
 ph.add(22,3);
 }
}