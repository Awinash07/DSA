import java.util.Stack;

public class NthNode {
    public TreeNode nthNode(TreeNode root , int n){
        if(root == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if(--n == 0){
                return current;
            } 
            current = current.right;
        }
        return null;   
    }
}
