package DynamicProgramming;

import java.util.Arrays;

public class UniquePathWithObstacle {

    public static int uniquePathWithObstacle(int i , int j , int[][] maze)
    {
        int[][] dp = new int[i + 1][j + 1];

        for(int[] row : dp) Arrays.fill(row, -1);

        return uniquePathWithObstacleHelper(i-1,j-1,maze,dp);
    }

    public static int uniquePathWithObstacleHelper(int i, int j, int[][] maze, int[][] dp)
    {
        if(i < 0 || j < 0) return 0;

        if(i == 0 && j == 0) return 1;

        if( i > 0 && j > 0 && maze[i][j] == -1) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int up = uniquePathWithObstacleHelper(i - 1, j, maze, dp);
        int left = uniquePathWithObstacleHelper(i, j - 1, maze, dp);

        return dp[i][j] = up+left;
    }

    public static void main(String args[]) {
        // Define the maze
        int[][] maze = {
                {0, 0, 0},
                {0, -1, 0},
                {0, 0, 0}
        };

        int n = maze.length;
        int m = maze[0].length;

        // Calculate and print the number of paths through the maze
        System.out.println(uniquePathWithObstacle(n, m, maze));
    }
}
