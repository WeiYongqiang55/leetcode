/*
 * @Author: your name
 * @Date: 2019-12-09 17:54:58
 * @LastEditTime: 2019-12-09 18:12:57
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit = 
 * @FilePath: \javad:\leetcode\53.最大子序和.java
 */
/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和 动态规划
 */

// @lc code=start
class Solution {

    public int maxSubArray(int[] nums) {
        
        int result = nums[0];
        int size = nums.length;
        if(size ==0) {
            return 0;
        }else if(size==1){
            return nums[0];
        }
        int[] dp = new int[size];
        dp[0] = nums[0];
        for (int i =1;i<size;i++){
            dp[i] = Math.max(nums[i], nums[i]+dp[i-1]);
            if(dp[i] > result){
                result = dp[i];
            }
        }
        return result;
    } 
}
// @lc code=end

