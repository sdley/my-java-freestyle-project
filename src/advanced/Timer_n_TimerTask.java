package advanced;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_n_TimerTask {

    // Timer: class that schedules tasks for future execution in a background thread.
    //        It can schedule tasks to run once or repeatedly at fixed intervals.
    //        Useful for: sending notifications, scheduling periodic updates, repetitive actions, etc.

    // TimerTask: abstract class that implements Runnable, representing a task to be scheduled by a Timer.
    //            Represents a task that can be scheduled for one-time or repeated execution by a Timer.
    //            It defines a single method, run(), which contains the code to be executed when the task is run.
    //            You create a subclass of TimerTask and override its run() method to define the task's behavior.

    void main() {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Task executed!");
                count--;

                if (count == 0) {
                    System.out.println("Task completed, stopping timer.");
                    timer.cancel(); // Stop the timer after 3 executions
                }
            }
        };

        // timer.schedule(task, 2000); // Schedule task to run after 2 seconds
        // timer.schedule(task, 0, 1000); // Schedule task to run every 1 second starting immediately
        timer.schedule(task, 300, 2000); // Schedule task to run every 2 seconds starting after 3 seconds



    }
}
