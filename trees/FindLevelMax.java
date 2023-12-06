import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLevelMax {
    public List<Integer> findLevelMax(TreeNode root){
        List<Integer> levelMaxList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            int levelMax = 0;
            for(int i = 0 ; i < queueSize ; i++){
                TreeNode current = queue.poll();
                levelMax = Math.max(levelMax, current.data);

                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            levelMaxList.add(levelMax);
        }
        return levelMaxList;
    }
}
