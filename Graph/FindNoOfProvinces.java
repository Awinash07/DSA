package Graph;

import java.util.Stack;

public class FindNoOfProvinces {

    public int findNoOfProvinces(int[][] isConnected)
    {
        int n = isConnected.length;
        boolean[] isVisited = new boolean[n+1];
        int provinces = 0;

        for(int i = 0; i < n ; i++){
            if(!isVisited[i]){
                dfs(isConnected, isVisited, i);
                provinces++;
            }
        }
        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] isVisited, int start)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        isVisited[start] = true;

        while(!stack.isEmpty()){
            int current = stack.pop();
            for(int i = 0; i < isConnected.length; i++){
                if(isConnected[current][i] == 1 && !isVisited[i])
                {
                    stack.push(i);
                    isVisited[i] = true;
                }
            }
        }
    }
}
