/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子序列
 *
 * https://leetcode-cn.com/problems/maximum-product-subarray/description/
 *
 * algorithms
 * Medium (36.71%)
 * Likes:    370
 * Dislikes: 0
 * Total Accepted:    33.1K
 * Total Submissions: 89.6K
 * Testcase Example:  '[2,3,-2,4]'
 *
 * 给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。
 * 
 * 示例 1:
 * 
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 * 
 * 
 * 示例 2:
 * 
 * 输入: [-2,0,-1]
 * 输出: 0
 * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 * 
 */

// @lc code=start
class Solution {
    /**
     * 暴力法
     * @param nums
     * @return
     */
    // public static int maxProduct(int[] nums) {
    //     int max = nums[0];
    //     for(int i=0;i<nums.length;i++) {
    //         int product = nums[i];
    //         if(product>max){
    //             max = product;
    //         }
    //         for(int j=1;j<nums.length-i;j++) { 
    //             product *= nums[i+j];
    //             if(product>max){
    //                 max = product;
    //             }
    //         }
            
    //     }
    //     System.out.println(max);
    //     return max;
    // }

//     思路二, 动态规划^1

//     我们只要记录前i的最小值, 和最大值, 那么 dp[i] = max(nums[i] * pre_max, nums[i] * pre_min, nums[i]), 这里0 不需要单独考虑, 因为当相乘不管最大值和最小值,都会置0

//     
    public static int maxProduct(int[] nums) {
        
        int res = nums[0];
        int preMin=res,preMax=res;
        for(int i=1;i<nums.length;i++){
            int curMax =Math.max(Math.max(nums[i]*preMax,nums[i]*preMin),nums[i]);
            int curMin = Math.min(Math.min(nums[i]*preMax,nums[i]*preMin),nums[i]);
            res = Math.max(res,curMax);
            preMax = curMax;
            preMin = curMin;
        }
        return res;
    }
    public static void main(String[] args) {
        maxProduct(new int[]{-2,0,-1});
    }
}

// @lc code=end

