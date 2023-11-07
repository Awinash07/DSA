import java.util.Stack;

public class SizeOfTree {

    public int sizeOfTree(TreeNode root){
        if(root == null){
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        int count = 0;
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            count++;
            current = current.right;
        }
        return count;
    }
    
}
