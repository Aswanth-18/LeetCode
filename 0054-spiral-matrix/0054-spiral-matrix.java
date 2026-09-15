class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = mat.length - 1;

        int left = 0;
        int right = mat[0].length - 1;

        while (left <= right && top <= bottom) {
            for (int j = left; j <= right; j++) {
                ans.add(mat[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.add(mat[bottom][j]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}