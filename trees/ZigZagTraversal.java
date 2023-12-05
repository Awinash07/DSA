import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
    public List<List<Integer>> zigzagTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean leftToRight = true;
        queue.offer(root);
        while (!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i < queueSize ;i++){
                TreeNode current = queue.poll();
                if(leftToRight)
                    currentLevel.add(current.data);
                else
                    currentLevel.add(0,current.data);
                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);

            }
            result.add(currentLevel);
            leftToRight = !leftToRight;

        }
        return result;
    }

}
