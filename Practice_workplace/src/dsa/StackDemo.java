package dsa;

public class StackDemo {

    int top = -1;
    int arr[] = new int[5];

    void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = x;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + arr[top--]);
        }
    }

    public static void main(String[] args) {

        StackDemo s = new StackDemo();

        s.push(10);
        s.push(20);
        s.pop();
    }
}