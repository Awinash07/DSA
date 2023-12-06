package trees;
import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversalIterative {

    static class binaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
        idx++; 
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode; 
        }
    }

    static class Traversal{
        public void postOrder(Node root){
            if(root != null){
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.data+"-->");
            }
        }

        public void preOrder(Node root){
            if(root != null){
                System.out.print(root.data+"-->");
                preOrder(root.left);
                preOrder(root.right);
            }
        }

        public void inOrder(Node root){
            if(root != null){
                inOrder(root.left);
                System.out.print(root.data+"-->");
                inOrder(root.right);
            }
        }

        public void levelOrder(Node root){
            if(root != null){
                Queue<Node> q = new LinkedList<>();
                q.add(root);
                q.add(null);
                while(!q.isEmpty()){
                    Node currNode = q.remove();
                    if(currNode == null){
                        System.out.println();
                        if(q.isEmpty()){
                            break;
                        }else{
                            q.add(null);
                        }
                    }else{
                        System.out.print(currNode.data+"-->");
                        if(currNode.left != null){
                            q.add(currNode.left);
                        }
                        if(currNode.right != null){
                            q.add(currNode.right);
                        }
                    }
                }

            }
        }
    }
    public static void main(String args[]){
       int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       binaryTree tree = new binaryTree();
       Node root = tree.buildTree(nodes);
       System.out.println("Root : "+root.data);
       TreeOperation treeOperation = new TreeOperation();
       System.out.println(treeOperation.noOfNodes(root));
       System.out.println(treeOperation.sumOfNodes(root));
    }

}

class TreeOperation{

    public int noOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = noOfNodes(root.left);
        int rightNode = noOfNodes(root.right);
        return leftNode + rightNode + 1;
    }
    public int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;

    }
    public int height(Node root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;
    }

    /*public int diameter(Node root){
        if(root == null) return 0;
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int maxDia = Math.max(height(root.left), height(root.right));
    } */

}

class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data = data;
    }
}
