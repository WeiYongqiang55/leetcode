import java.util.Arrays;

/*
 * @Author: your name
 * @Date: 2019-12-14 21:46:28
 * @LastEditTime: 2019-12-14 22:59:00
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\16.最接近的三数之和.java
 */
/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
       
        int size = nums.length;
        if(nums==null || size<3){ return res;}
        //排序
        Arrays.sort(nums);
        for(int i=0; i<size;i++){

            int Left = i+1;
            int Right = size-1;
            while (Left < Right) {
                int sum = nums[i] + nums[Left] + nums[Right];
                if (Math.abs(target -sum) < Math.abs(target-res)) {
                    res = sum;
                }
                if (sum < target) {
                    Left++;
                } else if (sum > target) {
                    Right--;
                } else {
                    return res;
                }
            }
            
        }
        return res;
    }
}
// @lc code=end

