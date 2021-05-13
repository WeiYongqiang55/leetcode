import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 *
 * https://leetcode-cn.com/problems/spiral-matrix-ii/description/
 *
 * algorithms
 * Medium (76.95%)
 * Likes:    161
 * Dislikes: 0
 * Total Accepted:    29.6K
 * Total Submissions: 38.5K
 * Testcase Example:  '3'
 *
 * 给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * 
 * 示例:
 * 
 * 输入: 3
 * 输出:
 * [
 * ⁠[ 1, 2, 3 ],
 * ⁠[ 8, 9, 4 ],
 * ⁠[ 7, 6, 5 ]
 * ]
 * 
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        List ans = new ArrayList();
        int[][] matrix = new int[n][n];
        
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        int i=1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) matrix[r1][c]=i++;//上
            for (int r = r1 + 1; r <= r2; r++) matrix[r][c2]=i++; //yright
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) matrix[r2][c]=i++;
                for (int r = r2; r > r1; r--) matrix[r][c1]=i++;
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return matrix;
    }
    
}
// @lc code=end

