package LinkedList;

public class Node {
    // PROPERTIES
    Node next;  // Reference
    int data;   // Data
    
    // METHODS
    // Constructors
    public Node (int newData){
        data = newData;
        next = null;
    }
    
     public Node (int newData, Node newNext){
        data = newData;
        next = newNext;
    }
    
    // Getters and Setters

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
     
}
