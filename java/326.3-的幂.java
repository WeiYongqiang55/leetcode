/*
 * @Author: your name
 * @Date: 2019-12-13 19:23:11
 * @LastEditTime: 2019-12-14 13:43:57
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\326.3-的幂.java
 */
/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n<1){
        //     return false;
        // }

        // while(n%3 == 0){
        //     n /= 3;
        // }
        // return n==1;
        //方法2 因为传入的值是int 类型，
        // int类型中最大的3的幂次方是1162261467，
        //所以用这个最大的幂对其他取余，如果是0说明是3的幂次
        return n > 0 && 1162261467 % n == 0;
    }
}
// @lc code=end

