import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args) {
        // Get the current time
        LocalTime now = LocalTime.now();
        
        // Format the time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = now.format(formatter);
        
        // Display the time
        System.out.println("Current Time: " + formattedTime);
    }
}
