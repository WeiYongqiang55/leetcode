import java.util.Arrays;

/*
 * @Author: your name
 * @Date: 2019-12-12 20:30:05
 * @LastEditTime: 2019-12-12 20:50:39
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit.sort
 * @FilePath: \leetcode\217.存在重复元素.java
 */
/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 解法1 先排序在计算 95.7%
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;

        // 解法2 set  75%
        // Set<Integer> set = new HashSet<Integer>();
        // for(int i:nums){
        //     set.add(i);
        // }
        // if(nums.length != set.size()){
        //     return true;
        // }else{
        //     return false;
        // }
    }
}
// @lc code=end

