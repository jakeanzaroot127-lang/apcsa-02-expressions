/**
 * Exercise 2 — TimeConverter
 *
 * Convert a number of seconds into hours, minutes, and seconds.
 *
 * Example: 9296 seconds  →  2 hours, 34 minutes, 56 seconds
 *
 * Hint: 1 hour = 3600 seconds, 1 minute = 60 seconds.
 * Same / and % pattern as ChangeMaker.
 */
public class TimeConverter {
    public static void main(String[] args) {
        int totalSeconds = 9296;
        System.out.println(totalSeconds);
        int totalMinutes = totalSeconds/60;
        System.out.println(totalMinutes);
        int hours = totalMinutes/60;
        System.out.println(hours);
        int minutes = hours%60;
        System.out.println(minutes);
        int seconds = totalMinutes%60;
        System.out.println(seconds);
        System.out.println(hours + " hours " + minutes + " minutes");

        

    }
}
