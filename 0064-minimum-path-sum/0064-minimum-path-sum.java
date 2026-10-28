class Solution {

    // private int findPath(int[][] mat, int r, int c) {
    //     int n = mat.length;
    //     int m = mat[0].length;

    //     if (r == n - 1 && c == m - 1) {
    //         return mat[r][c];
    //     }

    //     if (c == m - 1) {
    //         return mat[r][c] + findPath(mat, r + 1, c);
    //     }

    //     if (r == n - 1) {
    //         return mat[r][c] + findPath(mat, r, c + 1);
    //     }

    //     int moveRight = findPath(mat, r + 1, c);
    //     int moveDown = findPath(mat, r, c + 1);

    //     return mat[r][c] + Math.min(moveRight, moveDown);
    // }

    // public int minPathSum(int[][] mat) {
    //     return findPath(mat, 0, 0);
    // }



    private int findPath(int[][] mat, int r, int c,int[][] dp) {
        int n = mat.length;
        int m = mat[0].length;

        if (r == n - 1 && c == m - 1) {
            return mat[r][c];
        }

        if(dp[r][c] != -1){
            return dp[r][c];
        }

        if (c == m - 1) {
            return dp[r][c] = mat[r][c] + findPath(mat, r + 1, c,dp);
        }

        if (r == n - 1) {
            return dp[r][c] = mat[r][c] + findPath(mat, r, c + 1,dp);
        }

        int moveRight = findPath(mat, r , c+1,dp);
        int moveDown = findPath(mat, r+1, c ,dp);

        return dp[r][c] = mat[r][c] + Math.min(moveRight, moveDown);
    }

    public int minPathSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int dp[][] = new int[n][m];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }

        return findPath(mat, 0, 0,dp);
    }
}