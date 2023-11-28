import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int minDepth = 1;
        while(!queue.isEmpty()){
            int size = queue.size(); 
            for(int i = 0; i < size; i++){
                 TreeNode current = queue.poll();
                 if(isLeafNode(current)){
                    return minDepth;
                 }
                 if(current.left != null){
                    queue.add(current.left);
                 }
                 if(current.right != null){
                    queue.add(current.right);
                 }
            }
            minDepth++;
        }
        return minDepth;
    }
    private boolean isLeafNode(TreeNode curr){
        return curr != null && curr.left == null && curr.right == null;
    }
}
