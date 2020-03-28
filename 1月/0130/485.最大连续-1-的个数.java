/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 *
 * https://leetcode-cn.com/problems/max-consecutive-ones/description/
 *
 * algorithms
 * Easy (55.41%)
 * Likes:    81
 * Dislikes: 0
 * Total Accepted:    26.4K
 * Total Submissions: 47.7K
 * Testcase Example:  '[1,0,1,1,0,1]'
 *
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * 
 * 示例 1:
 * 
 * 
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 
 * 
 * 注意：
 * 
 * 
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 * 
 * 
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int last=0;
        int front =0;
        int res=0;
        while(last<nums.length){
            if(nums[last]==1){
                last++;
            }else{
                res = Math.max(res,last-front);
                front=last+1;
                last=front;
            }
        }
        /** 判断最后的连续值是否是最大值 */
        res = Math.max(res,last-front);
        return res;
    }
}
// @lc code=end

