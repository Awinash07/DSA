package Graph;

import java.util.ArrayList;

public class DFS {

    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis[] = new boolean[v+1];
        vis[0] = true;
        ArrayList<Integer> result = new ArrayList<>();
        return dfs(0, adj, vis, result);
    }

    public ArrayList<Integer> dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> result)
    {
        vis[node] = true;
        result.add(node);

        for(Integer i : adj.get(node)){
            if(vis[i] == false){
                dfs(i, adj, vis, result);
            }
        }
        return result;
    }

}
