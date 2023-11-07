import java.util.Stack;

public class KthSmallest {

    public int kthSmallest(TreeNode root, int k){
        if(root == null){
            return -1;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root; 
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            
            if(--k == 0){
                return current.data;
            }
            current = current.right;
        }
        return -1;
    } 
}
