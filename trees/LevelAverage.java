
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelAverage {
    public List<Double> levelAverage(TreeNode root){
        List<Double> levelAvg = new ArrayList<>();
        if(root == null) return levelAvg;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            double queueSize = queue.size();
            double levelNodeCount = 0;
            double levelNodeSum = 0;
            for (int i = 0; i<queueSize; i++){
                TreeNode current = queue.poll();
                levelNodeCount++;
                levelNodeSum += current.data;

                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            levelAvg.add(levelNodeSum/levelNodeCount);
        }
        return levelAvg;
    }
}
