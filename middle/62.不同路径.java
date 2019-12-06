import sun.security.x509.UniqueIdentity;

/*
 * @Author: your name
 * @Date: 2019-12-05 09:41:33
 * @LastEditTime: 2019-12-05 18:22:50
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\62.不同路径.java
 */
/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 * 解题思路1：递归回溯，超出边界剪枝
 * 解题思路2：动态规划，我们令 dp[i][j] 是到达 i, j 最多路径
 * 动态方程：dp[i][j] = dp[i-1][j] + dp[i][j-1]
 * 注意，对于第一行 dp[0][j]，或者第一列 dp[i][0]，由于都是在边界，
 * 所以只能为 1
 */

// @lc code=start
class Solution {
    public static int uniquePaths(int m, int n) 
    {
        // 动态规划
        int[][] dp = new int[m][n];
        for(int i = 0; i < n; i++)
        {
            dp[0][i] = 1;
        }
        for(int j = 0; j < m;j++)
        {
            dp[j][0] = 1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }   
    public void print(String s){
        System.out.println(s);
    }
    // public static void main(String[] args) {
    //     System.out.println(uniquePaths(7,3));
    // }
}
// @lc code=end
