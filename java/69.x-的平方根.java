/*
 * @Author: your name
 * @Date: 2019-12-10 20:03:52
 * @LastEditTime: 2019-12-10 20:30:50
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \javad:\leetcode\69.x-的平方根.java
 */
/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        long xx = x;
        if(x<2){
            return x;
        }
        long right  = (long)x/2;
        long left = 0;
        while(left < right){
            long mid  = (long)(left + 1 + right )/2;
            long square = mid*mid;
            if(square == xx){
                return (int)mid;
            }else if(square >xx){
                right = mid -1;
            }else{
                left = mid;
            }
        }
        
        return (int)left;

        
        // long left = 0;
        // // # 为了照顾到 1 把右边界设置为 x // 2 + 1
        // long right = x / 2 + 1;
        // while (left < right) {
        //     // 注意：这里一定取右中位数，如果取左中位数，代码会进入死循环
        //     // long mid = left + (right - left + 1) / 2;
        //     long mid = (left + right + 1) >>> 1;
        //     long square = mid * mid;
        //     if (square > x) {
        //         right = mid - 1;
        //     } else {
        //         left = mid;
        //     }
        // }
        // // 因为一定存在，因此无需后处理
        // return (int) left;
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.mySqrt(9));
    }
}
// @lc code=end

