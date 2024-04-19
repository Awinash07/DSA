package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public List<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj)
    {
        List<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        boolean[] vis = new boolean[v];
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer i : adj.get(node)){
                if(vis[i] == false){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        return bfs;
    }
}
