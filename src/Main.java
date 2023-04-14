import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of hours to countdown: ");
        int hours = scanner.nextInt();
        int totalSeconds = hours * 60 * 60;

        for (int secondsRemaining = totalSeconds; secondsRemaining > 0; secondsRemaining--) {
            int hoursRemaining = secondsRemaining / 3600;
            int minutesRemaining = (secondsRemaining % 3600) / 60;
            int secondsInMinuteRemaining = (secondsRemaining % 60);

            System.out.printf("%02d:%02d:%02d\n", hoursRemaining, minutesRemaining, secondsInMinuteRemaining);
        }

        System.out.println("Countdown complete!");
    }
}