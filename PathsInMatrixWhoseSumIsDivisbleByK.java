public class PathsInMatrixWhoseSumIsDivisbleByK {
    public static int helper(int[][] grid, int k, int i, int j, int sum){
        int m = grid.length;
        int n = grid[0].length;
        if(i>=m || j>=n) return 0;

        int newSum = sum + grid[i][j];

        if (i == m - 1 && j == n - 1) {
            return (newSum % k == 0) ? 1 : 0;
        }

        int right = helper(grid,k,i, j+1, newSum);
        int down = helper(grid,k,i+1,j,newSum);

        return (right+down);

    }
    public static int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        return helper(grid,k,0,0,0);
        
    }
    public static void main(String[] args) {
        int[][] grid = {{5,2,4},{3,0,5},{0,7,2}};
        int k = 3;
        int result = numberOfPaths(grid,k);
        System.out.println(result);
    }
}
