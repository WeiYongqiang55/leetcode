/*
 * @lc app=leetcode.cn id=63 lang=java
 *
 * [63] 不同路径 II
 *
 * https://leetcode-cn.com/problems/unique-paths-ii/description/
 *
 * algorithms
 * Medium (32.61%)
 * Likes:    248
 * Dislikes: 0
 * Total Accepted:    49.5K
 * Total Submissions: 151.9K
 * Testcase Example:  '[[0,0,0],[0,1,0],[0,0,0]]'
 *
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * 
 * 
 * 
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 * 
 * 说明：m 和 n 的值均不超过 100。
 * 
 * 示例 1:
 * 
 * 输入:
 * [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 * 
 * 动态规划 ，dp[i][j]表示从0，0点到这个点一共共有几种路径
 * 状态方程
 * dp[i][j] = dp[i-1][j]+dp[i][j-1]
 * base  case :
 *  i==0 和j==0 的时候，i==0,只能是从左边来的，所以dp[0][j] = dp[0][j-1]
 * j==0 : 只能是从上面来的，所以 dp[i][0] = dp[i-1][0]
 * 
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid[0].length == 0) {
            return 0;
        }
        int rol = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        for (int i = 0; i < rol; i++) {
            for (int j = 0; j < col; j++) {
                // 判断是否有障碍物，若有，当前点对结果贡献为0，直接置0即可。
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                    continue;
                }
                if (i == 0 && j == 0) {
                    obstacleGrid[i][j] = 1; // 将第一个格点赋初始值1；
                } else if (i == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i][j - 1]; // 第一行格点值等于左边格点值；
                } else if (j == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j]; // 第一列格点值等于上边格点值；
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i][j - 1] + obstacleGrid[i - 1][j]; // 其他格点值等于左边、上边格点值之和；
                }
            }
        }
        return obstacleGrid[rol - 1][col - 1];
    }
}
// @lc code=end

