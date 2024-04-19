package Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphMainMethod {
    public static void main(String[] args) {

        ArrayList <ArrayList< Integer >> adj = new ArrayList <> ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        //==============BFS==================>
        BFS bfs = new BFS();
        List< Integer > bfsResult = bfs.bfsOfGraph(5, adj);
        System.out.println("BFS Graph=======>");
        for(int i = 0;i<bfsResult.size();i++) {
            System.out.print(bfsResult.get(i)+" ");
        }
        System.out.println();

        //=================DFS=================>
        DFS dfs = new DFS();
        ArrayList < Integer > dfsResult = dfs.dfsOfGraph(5, adj);
        System.out.println("DFS Graph=======>");
        for(int i = 0;i<dfsResult.size();i++) {
            System.out.print(dfsResult.get(i)+" ");
        }

        //==============connected components========>
        System.out.println();
        int[][] isConnected =  {{1, 1, 0},
                                {1, 1, 0},
                                {0, 0, 1}};
        System.out.println("Connected Components========>");
        FindNoOfProvinces provinceFinder = new FindNoOfProvinces();
        int numberOfProvinces = provinceFinder.findNoOfProvinces(isConnected);
        System.out.println("Number of provinces: " + numberOfProvinces);
    }
}

