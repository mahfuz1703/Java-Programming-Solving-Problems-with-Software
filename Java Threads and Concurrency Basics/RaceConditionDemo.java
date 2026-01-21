import java.util.concurrent.atomic.AtomicInteger;

// class Counter{
//     // private int count = 0;
//     private AtomicInteger count = new AtomicInteger(0); // solve race condition

//     public void increment() {
//         // count++;
//         count.incrementAndGet(); // atomically increments by 1 for solve race condition
//     }

//     public int getCount() {
//         // return count;
//         return count.get();
//     }
// }


// Synchronized solution
class Counter{

    // Useing synchronized methods------------------
    // private int count = 0;
    // public synchronized void increment() {
    //     count++;
    // }

    // public synchronized int getCount() {
    //     return count;
    // }



    // Using synchronized block---------------------
    private int count = 0;
    private final Object lock = new Object();

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}


public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable counterTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(counterTask);
        Thread thread2 = new Thread(counterTask);

        thread1.start();
        thread2.start();

       thread1.join();
       thread2.join();

        System.out.println("Expected count: 2000");
        System.out.println("Actual count: " + counter.getCount());
    }
}
