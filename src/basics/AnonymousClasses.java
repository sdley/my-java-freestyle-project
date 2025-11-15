package basics;

public class AnonymousClasses {

    // Anonymous class: a class without a name. Cannot be reused.
    // Add custom behavior without creating a separate named class.
    // Useful for creating one-time-use classes, often for event handling, callbacks, runnable tasks, etc.

    void main() {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("The dog goes *Bark Bark!*");
            }
        };

        dog1.speak(); // Outputs: The dog goes *Woof Woof!*
        dog2.speak(); // Outputs: The dog goes *Bark Bark!*

        System.out.println();

        // Example: Creating a Runnable using an anonymous class
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task is running in an anonymous class!");
            }
        };

        // Execute the task
        new Thread(task).start();


    }
}
