
import java.util.LinkedList;
import java.util.Queue;

public class FindSuccessor {
    public TreeNode findSuccessor(TreeNode root, int val){
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if(current.left != null) queue.offer(current.left);
            if(current.right != null) queue.offer(current.right);
            if(current.data == val) break;
        }
        return queue.peek();
    }
}
