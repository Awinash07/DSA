
import java.util.*;

public class createTree{

    static Scanner sc = null;

    static Node createTreeNode(){
        Node root = null;
        System.out.println("Enter Data: ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);

        System.out.println("Enter left for " +data);
        root.left = createTreeNode();

        System.out.println("Enter right for " +data);
        root.right = createTreeNode();

        return root;
    }

    public static void main(String args[]){
        sc = new Scanner(System.in);
        Node root = createTreeNode();
        System.out.println(root);
    }
}

class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data = data;
    }
}