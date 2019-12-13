import java.util.ArrayList;
import java.util.Arrays;

/*
 * @Author: your name
 * @Date: 2019-12-13 11:41:49
 * @LastEditTime: 2019-12-13 12:00:17
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editnum
 * @FilePath: \leetcode\268.缺失数字.java
 */
/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字 
 * 可以先求0-n得所有数字得和然后减去数组中所有数字得和就得到了 要求的得数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] != 0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] != nums[i]+1){
                        return nums[i]+1;
            }
        }
        return nums[nums.length-1]+1;
    }
}
// @lc code=end

