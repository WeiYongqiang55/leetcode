/*
 * @Author: your name
 * @Date: 2019-12-13 17:47:18
 * @LastEditTime: 2019-12-13 18:07:41
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\303.区域和检索-数组不可变.java
 */
/*
 * @lc app=leetcode.cn id=303 lang=java
 *
 * [303] 区域和检索 - 数组不可变
 */

// @lc code=start
class NumArray {
    int[] sum;
    public NumArray(int[] nums) {
        sum = new int[nums.length+1];
        calculate(nums);
    }
    public void  calculate(int[] nums){
        int size = nums.length;
        sum[0] = 0;
        for(int i=1;i<=size;i++){
            sum[i]=sum[i-1]+nums[i-1];
        }
    }
    public int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
// @lc code=end

