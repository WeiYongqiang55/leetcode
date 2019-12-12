/*
 * @Author: your name
 * @Date: 2019-12-12 14:56:04
 * @LastEditTime: 2019-12-12 16:07:46
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edits
 * @FilePath: \leetcode\189.旋转数组.java
 */
/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组 使用额外空间了
 * maibumaine hao[anasd asda ]
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            a[(i+k)%nums.length] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = a[i];
        }
    }
}
// @lc code=end

