package deshaw.ascend.session3.thread;

public class MultiThreadedExecution {

    private ServerSimulation server1 = new ServerSimulation();

    private ServerSimulation server2 = new ServerSimulation();

    // Using thread
    static class ServerRequestThread extends Thread {

        private String requestPayload;

        private ServerSimulation server;

        public ServerRequestThread(String requestPayload, ServerSimulation server) {
            this.requestPayload = requestPayload;
            this.server = server;
        }

        @Override
        public void run() {
            server.requestResource(requestPayload);
        }
    }

    private void executeUsingThreadClass() {
        ServerRequestThread requestThread1 = new ServerRequestThread(ThreadExampleConstants.detailsResource, server1);
        ServerRequestThread requestThread2 = new ServerRequestThread(ThreadExampleConstants.marksResource, server2);
        requestThread1.start();
        requestThread2.start();
    }

    // Using runnable interface
    private void executeUsingRunnableInterface() {
        Runnable requestRunnable1 = new Runnable() {
            @Override
            public void run() {
                server1.requestResource(ThreadExampleConstants.detailsResource);
            }
        };

        Runnable requestRunnable2 = new Runnable() {
            @Override
            public void run() {
                server2.requestResource(ThreadExampleConstants.marksResource);
            }
        };

        Thread thread1 = new Thread(requestRunnable1);
        Thread thread2 = new Thread(requestRunnable2);
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        MultiThreadedExecution execution = new MultiThreadedExecution();
        execution.executeUsingThreadClass();
//        execution.executeUsingRunnableInterface();
    }
}
