
import java.util.Calendar;

public class Clock {


public static void main(String[] args) {
    // create a time object initialized to the current time
    Calendar cal = Calendar.getInstance();
    Time currentTime = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

    // loop and tick every second until the time advances to the next minute
    while (cal.get(Calendar.MINUTE) == currentTime.getMinute()) {           //current minute equal to calendar minute?
        try {
            Thread.sleep(1000); // sleep for 1 second
        } catch (InterruptedException e) {              //what went wrong in case of an interruption
            e.printStackTrace();
        }
        currentTime.tick(); // increment the time by 1 second
        System.out.println("current time is: " + currentTime.toString());
    }
}

}