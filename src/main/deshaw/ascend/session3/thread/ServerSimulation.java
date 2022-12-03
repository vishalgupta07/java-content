package deshaw.ascend.session3.thread;

public class ServerSimulation {

    public void requestResource(String payload) {
        System.out.println("Requesting resource for payload: " + payload);
        try {
            // Business logic
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Resource request fulfilled by server for payload: " + payload);
    }

    public synchronized void requestResourceWithSynchronizedMethod(String payload) {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread access: " + threadName);
        requestResource(payload);
    }

    public void requestResourceWithSynchronizedBlock(String payload) {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread access: " + threadName);

        assert payload != null;
        synchronized (payload) {
            requestResource(payload);
        }
    }
}
