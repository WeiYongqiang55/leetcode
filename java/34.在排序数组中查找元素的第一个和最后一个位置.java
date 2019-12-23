/*
 * @Author: your name
 * @Date: 2019-12-15 12:53:00
 * @LastEditTime: 2019-12-15 13:14:04
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\34.在排序数组中查找元素的第一个和最后一个位置.java
 */
/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == target) {
                res[0] = i;
                res[1] = i;
                while (i+1<size && nums[i+1]==target) {
                    res[1] = i + 1;
                    i++;
                }
            }
        }
        return res;
    }
}
// @lc code=end

