package projects;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {

    // Count Down Timer Program

    void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds to count down from: ");
        int seconds = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = seconds;

            @Override
            public void run() {
                System.out.println("Time left: " + count + " seconds");
                count--;

                if (count < 0) {
                    System.out.println("Time's up!");
                    timer.cancel(); // Stop the timer when countdown reaches zero
                }
            }
        };

        timer.schedule(task, 0, 1000); // Schedule task to run every 1 second starting immediately

        scanner.close();
    }
}
