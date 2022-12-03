package deshaw.ascend.session3.thread;

public class SingleThreadedExecution {

    public static void main(String[] args) {
        // Servers
        ServerSimulation server1 = new ServerSimulation();
        ServerSimulation server2 = new ServerSimulation();
        // Resource request
        server1.requestResource(ThreadExampleConstants.detailsResource);
        server2.requestResource(ThreadExampleConstants.marksResource);
    }
}
