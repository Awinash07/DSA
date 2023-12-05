import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseLevelOrder {
    public List<List<Integer>> reverseLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i < queueSize; i++){
                TreeNode current = queue.poll();
                currentLevel.add(current.data);
                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            result.add(0,currentLevel);
        }
        return result;
    }
}
