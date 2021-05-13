import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=673 lang=java
 *
 * [673] 最长递增子序列的个数
 *
 * https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence/description/
 *
 * algorithms
 * Medium (34.83%)
 * Likes:    129
 * Dislikes: 0
 * Total Accepted:    7.1K
 * Total Submissions: 20.2K
 * Testcase Example:  '[1,3,5,4,7]'
 *
 * 给定一个未排序的整数数组，找到最长递增子序列的个数。
 * 
 * 示例 1:
 * 
 * 
 * 输入: [1,3,5,4,7]
 * 输出: 2
 * 解释: 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: [2,2,2,2,2]
 * 输出: 5
 * 解释: 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
 * 
 * 
 * 注意: 给定的数组长度不超过 2000 并且结果一定是32位有符号整数。
 * 
 */

// @lc code=start
class Solution {
    public static int findNumberOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=1;
            }
        }
        // 因为一个数字本身也是一个子序列，最小长度为1
        // System.out.println(dp[0][1]);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j][0] + 1 > dp[i][0]) {
                        dp[i][0] = dp[j][0] + 1;
                        dp[i][1] = dp[j][1];
                    } else if (dp[j][0] + 1 == dp[i][0]) {
                        dp[i][1] += dp[j][1];
                    }
                }
            }
        }

        int res = 1, index = 0;
        ;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i][0] > res) {
                res = dp[i][0];
            }

        }
        // System.out.println(index);

        int count=0;
        for(int i=0;i<dp.length;i++){
            if(dp[i][0]==res){
                count+=dp[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        findNumberOfLIS(new int[] { 1, 2, 5, 4, 7 });
    }
}
// @lc code=end

