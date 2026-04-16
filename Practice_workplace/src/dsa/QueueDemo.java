package dsa;

public class QueueDemo {

    int front = -1, rear = -1;
    int arr[] = new int[5];

    void enqueue(int x) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            arr[++rear] = x;
            if (front == -1)
                front = 0;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Dequeued: " + arr[front++]);
        }
    }

    public static void main(String[] args) {

        QueueDemo q = new QueueDemo();

        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
    }
}
