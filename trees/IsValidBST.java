import java.util.Stack;

public class IsValidBST {

    public boolean isValidBST(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode prev = null;
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if(prev != null && prev.data >= current.data){
                return false;
            }
            prev = current;
            current = current.right;
        }
        return true;
    }    
}
