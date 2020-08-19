package bstlevelordertraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {

    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    static void levelOrder(Node root) {
        //Write your code here
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        
        System.out.println("Pause");
        
        while(!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.println(current.data + " ");
            if(current.left!=null) queue.add(current.left);
            if(current.right!=null) queue.add(current.right);
            
            System.out.println("Pause");
        }
        

    }

    public static Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int T = sc.nextInt();
        int T = 6;
        int[] data = {3, 5, 4, 7, 2, 1};
        int i = 0;
       
        Node root = null;
        while (T-- > 0) {
            //int data = sc.nextInt();
            root = insert(root, data[i]); 
            i++;
        }
        levelOrder(root);
    }
}
