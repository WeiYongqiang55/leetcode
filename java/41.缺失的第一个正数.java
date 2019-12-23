import java.util.Arrays;

/*
 * @Author: your name
 * @Date: 2019-12-15 13:14:33
 * @LastEditTime: 2019-12-15 13:42:08
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edits
 * @FilePath: \leetcode\41.缺失的第一个正数.java
 */
/*
 * @lc app=leetcode.cn id=41 lang=java
 *
 * [41] 缺失的第一个正数 也就是说从1开始
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);
        if (nums.length < 1) {
            return 1;
        }
        int start = 0;
        int res = -1;
        while (start <nums.length && nums[start] <= 0 ) {
            start++;
        }
        if (start < nums.length) {
            int next = 1;
            for (int i = start; i < nums.length; i++) {
                if (nums[i] != next) {
                    res = next;
                    break;
                } else {
                    next++;
                    while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                        i++;
                    }
                    
                }
            }    
        }
        return res == -1 ? Math.max(nums[nums.length - 1] + 1,1) : res;
    }
    public static void main(String[] args) {
        int[] nums = { 4, 3, 4, 1, 1, 4, 1, 4 };
        Solution a = new Solution();
        System.out.print(a.firstMissingPositive(nums));
    }
}
// @lc code=end

