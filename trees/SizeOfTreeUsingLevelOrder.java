import java.util.LinkedList;
import java.util.Queue;

public class SizeOfTreeUsingLevelOrder {
    public int sizeOfTreeUsingLevelOrder(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            for (int i = 0; i < queueSize ;i++){
                TreeNode current = queue.poll();
                count++;
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
        }
        return count;
    }
}
