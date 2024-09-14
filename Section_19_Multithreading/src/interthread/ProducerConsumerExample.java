package interthread;

class SharedResource {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait(); // Wait if data is already available
        }
        data = value;
        available = true;
        notify(); // Notify any waiting thread that data is now available
    }

    public synchronized int consume() throws InterruptedException {
        while (!available) {
            wait(); // Wait if no data is available
        }
        available = false;
        notify(); // Notify any waiting thread that data has been consumed
        return data;
    }
}

class Producer implements Runnable {
    private final SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                resource.produce(count);
                System.out.println("Produced: " + count);
                count++;
                Thread.sleep(1000); // Simulate time taken to produce
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int value = resource.consume();
                System.out.println("Consumed: " + value);
                Thread.sleep(1500); // Simulate time taken to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
