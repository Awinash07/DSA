import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreesTraversal {

    public ArrayList<Integer> inOrderTraversalIterative(TreeNode root){
        ArrayList<Integer> inOrder = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return inOrder;
        }
        TreeNode current = root;
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            inOrder.add(current.data);
            current = current.right;
        }
        return inOrder;
    }

    public ArrayList<Integer> PreOrderTraversalIterative(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> preOrder = new ArrayList<Integer>();

        if(root == null){
            return preOrder;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            preOrder.add(current.data);

            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
        return preOrder;
    }

    public ArrayList<Integer> PostOrderTraversalIterative(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> postOrder = new ArrayList<>();

        if(root == null){
            return postOrder;
        }
        TreeNode current = root;
        TreeNode prev = null;
        while(current != null || !stack.isEmpty()){
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode peekNode = stack.peek();
                if(peekNode.right == null || peekNode.right == prev ){
                    postOrder.add(peekNode.data);
                    prev = peekNode;
                    stack.pop();
                }else{
                    current = peekNode.right;
                }
            }
        }
        return postOrder;
    }

    public List<Integer> levelOrderTraversal(TreeNode root){
        List<Integer> levelOrder = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return levelOrder;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            levelOrder.add(current.data);
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
        return levelOrder;
    }
    
}
