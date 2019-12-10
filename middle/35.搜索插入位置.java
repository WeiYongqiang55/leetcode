/*
 * @Author: your name
 * @Date: 2019-12-09 17:11:14
 * @LastEditTime: 2019-12-09 17:24:10
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \javad:\leetcode\35.搜索插入位置.java
 */
/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        //二分查找
        int start =0;
        int end = nums.length-1;

        while (start <=end){
            int mid = (int)(end + start )/2;
            if (target == nums[mid]){
                return mid;
            }else if(target >nums[mid]){
                start = mid+1;
            }else{
                end  = mid -1;
            }
        }
        //没有找到
        return end+1;
    }
    public static void main(String[] args) {
        Solution a  = new Solution();
        int[] nums = {1,3,5,6};
        System.out.print(a.searchInsert(nums, 0));
    }
}
// @lc code=end

