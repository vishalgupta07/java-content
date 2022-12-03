package deshaw.ascend.session3.thread;

public class ThreadSynchronization {

    private ServerSimulation server = new ServerSimulation();

    private void synchronizedMethodExample() {
        Thread thread1 = new Thread(() -> server.requestResourceWithSynchronizedMethod("Thread-1"));
        Thread thread2 = new Thread(() -> server.requestResourceWithSynchronizedMethod("Thread-2"));
        thread1.start();
        thread2.start();
    }

    private void synchronizedBlockExample() {
        Thread thread1 = new Thread(() -> server.requestResourceWithSynchronizedBlock("Thread-1"));
        Thread thread2 = new Thread(() -> server.requestResourceWithSynchronizedBlock("Thread-2"));
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        ThreadSynchronization threadSynchronization = new ThreadSynchronization();
        threadSynchronization.synchronizedBlockExample();
    }
}
