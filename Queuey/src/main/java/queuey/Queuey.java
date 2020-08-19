package queuey;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey {

    LinkedList queue;

    // CONSTUCTORS
    public Queuey() {
        queue = new LinkedList();
    }

    // METHODS
    // Is empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Sizes
    public int size() {
        return queue.size();
    }

    // Enqueuing item
    public void enqueue(String n) {
        queue.addLast(n);
    }

    // Dequeuing item
    public String dequeue() {
        return (String) queue.remove(0);
    }

    // Peek at the first item
    public String peek() {
        return (String) queue.get(0);
    }

    public static void main(String[] args) {
        Stack<String> stacky = new Stack<>();
        stacky.push("there!.");
        stacky.push("Hi ");
        
        System.out.print(stacky.pop());
        System.out.print(stacky.pop());
        
        /*Queuey strQue = new Queuey();
        strQue.enqueue("Hi");
        strQue.enqueue("there!");
        System.out.print(strQue.dequeue() + " ");
        System.out.print(strQue.dequeue() + "."); */
        
        /* Queuey numQue = new Queuey();
        numQue.enqueue(5);
        numQue.enqueue(7);
        numQue.enqueue(6);
        System.out.println("First out: " + numQue.dequeue());
        System.out.println("Peek at second item: " + numQue.peek());
        System.out.println("Second out: " + numQue.dequeue());
        System.out.println("Third out: " + numQue.dequeue()); */
    }
}
