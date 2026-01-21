class Task implements Runnable {
    private String taskName;

    public Task(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        System.out.println(taskName + " is running.");
    }
}

public class ThreadExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Task 1"));
        Thread thread2 = new Thread(new Task("Task 2"));

        thread1.start();
        // System.out.println(thread1.getName() + " has started.");
        thread2.start();
        // System.out.println(thread2.getName() + " has started.");

        try { // Wait for both threads to finish before exiting main thread
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Lambda expression for a thread
        Runnable runnableTask = () -> {
            System.out.println("Lambda Task is running.");
        };
        Thread lambdaThread = new Thread(runnableTask);
        lambdaThread.start();

        try { // Wait for lambdaThread to finish before exiting main thread
            lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}