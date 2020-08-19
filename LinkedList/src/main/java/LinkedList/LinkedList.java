package LinkedList;

public class LinkedList {

    // Properties
    Node head;
    int count;

    // Constructor
    public LinkedList(Node newHead) {
        head = newHead;
        count = 1;
    }

    // Methods
    // add
    public void add(int newData) {
        Node temp = new Node(newData); // First, we create the new node
        Node current = head; // Lo posicionamos en en el NODO#0
        // Buscamos el ultimo NODO
        // Si el actual es NODO#4, entonces getNext apunta a NODO#5
        while (current.getNext() != null) { // El NODO#4 esta apuntando a un null? Si es si, es el ultimo
            current = current.getNext();
        }
        current.setNext(temp); // Al NODO ultimo le digo que apunte al nueno NODO
        count++;
    }

    // get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // size
    public int size() {
        return count;
    }

    // is empty
    public boolean isEmpty() {
        return head == null;
    }

    // remove last
    public void remove() {
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        LinkedList lista;
        
        lista.add(7);
        
        
    }
}
