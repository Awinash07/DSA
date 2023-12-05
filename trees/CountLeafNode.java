import java.util.LinkedList;
import java.util.Queue;

public class CountLeafNode {
    public int countleafNode(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int leafNodeCount = 0;
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            for(int i = 0 ; i < queueSize; i++){
                TreeNode current = queue.poll();
                if(current.left == null && current.right == null) leafNodeCount++;
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
        }
        return leafNodeCount;
    }
}
