
package kata1;
import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        Student A = new Student("Javi", new Date(88,0,19)) ;     
        System.out.println(A.getAge());
    }
}
