package deshaw.ascend.session3.thread;

public class ThreadActions {

    private static void interruptExample() throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Simple Thread");
        });
        thread.start();
        Thread.sleep(4000);
        thread.interrupt();
        System.out.println("Interrupt Join example concluded");
    }

    private static void joinExample() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // No-op
            }
            System.out.println("Thread-1");
        });
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // No-op
            }
            System.out.println("Thread-2");
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    public static void main(String[] args) throws InterruptedException {
        interruptExample();
    }
}
