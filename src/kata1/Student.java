
package kata1;
import java.util.Date;

public class Student {
    private final static double DAYS_PER_YEAR = 365.25;
    private final static long HOURS_PER_YEAR = (long) (24 * DAYS_PER_YEAR);
    private final static long MINUTES_PER_YEAR = 60 * HOURS_PER_YEAR;
    private final static long SECONDS_PER_YEAR = 60 * MINUTES_PER_YEAR;
    private final static long MILLISECONDS_PER_YEAR = 1000 * SECONDS_PER_YEAR;
    private String name;            
    private Date birthDate;

    public Student(String name, Date birthAge) {
        this.name = name;
        this.birthDate = birthAge;
    }

    public String getName() {
        return name;
    }
    
    public Date getBirthAge() {
        return birthDate;
    }
    
    public int getAge(){
        Date today = new Date();
        long millisecondsFromBirthDate = today.getTime() - birthDate.getTime();
        return (int) (millisecondsFromBirthDate / MILLISECONDS_PER_YEAR);
    }
}
