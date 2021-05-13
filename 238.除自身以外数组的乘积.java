/*
 * @lc app=leetcode.cn id=238 lang=java
 *
 * [238] 除自身以外数组的乘积
 *
 * https://leetcode-cn.com/problems/product-of-array-except-self/description/
 *
 * algorithms
 * Medium (65.58%)
 * Likes:    300
 * Dislikes: 0
 * Total Accepted:    26.9K
 * Total Submissions: 40.7K
 * Testcase Example:  '[1,2,3,4]'
 *
 * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i]
 * 之外其余各元素的乘积。
 * 
 * 示例:
 * 
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 * 
 * 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * 
 * 进阶：
 * 你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
 * 
 */

// @lc code=start
class Solution {
    // public int[] productExceptSelf(int[] nums) {
    //     int[] res = new int[nums.length];
    //     int p = 1, q = 1;
    //     for (int i = 0; i < nums.length; i++) {
    //         res[i] = p;
    //         p *= nums[i];
    //     }
    //     for (int i = nums.length - 1; i > 0 ; i--) {
    //         q *= nums[i];
    //         res[i - 1] *= q;
    //     }
    //     return res;

    // }

    public int[] productExceptSelf(int[] nums) {
    int len=nums.length;
        int L[]=new int[len];
        int R[]=new int[len];
        L[0]=1;R[len-1]=1;
        for(int i=1;i<len;i++){
            L[i]=nums[i-1]*L[i-1];
        }
         for(int i=len-2;i>=0;i--){
            R[i]=nums[i+1]*R[i+1];
        }
        int result[]=new int[len];
        for(int i=0;i<len;i++){
            L[i]=L[i]*R[i];
        }
        return L;
    }
}
// @lc code=end

