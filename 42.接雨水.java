/*
 * @Author: your name
 * @Date: 2020-12-18 11:50:18
 * @LastEditTime: 2020-12-18 12:10:31
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\42.接雨水.java
 */
/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 solution :
 https://leetcode-cn.com/problems/trapping-rain-water/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-w-8/
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        // 动态规划方法
        int sum =0;
        int[] max_left = new int[height.length];
        int[] max_right = new int[height.length];
        // 求当前列的左边的最大的列高，不包含当前列的列高
        for(int i=1;i<height.length-1;i++) {
            max_left[i] = Math.max(max_left[i-1],height[i-1]);
        }
        // 求当前列的右边的最大的列高，不包含当前列的列高
        for(int i=height.length-2;i>=0;i--) {
            max_right[i] = Math.max(max_right[i+1],height[i+1]);
        }

        for(int i=1;i<height.length-1;i++) {
            int min = Math.min(max_left[i],max_right[i]);
            if(min > height[i]) {
                sum += (min - height[i]);
            }
        }
        return sum;
        
    }

    // public static void main(String[] args) {
    //     trap
    // }
}
// @lc code=end
