/**
 * Using methods to implement how a queue works 
 */
public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(6);
        
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("The current values are");
        queue.print();
        System.out.println();

        int qsize = queue.size();
        System.out.println("The size of the queue is "+qsize);

        int capacity = queue.capacity();
        System.out.println("The capacity of the queue is "+capacity);

        int val1 = queue.dequeue();
        System.out.println("The value removed is "+val1);
        int val2 =queue.dequeue();
        System.out.println("The value removed is "+val2);

        int val3 = queue.peek();
        System.out.println("The next value that will be removed is "+val3);

        System.out.println("The current values are");
        queue.print();
        System.out.println();
    }
}