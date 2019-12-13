/*
 * @Author: your name
 * @Date: 2019-12-12 21:13:10
 * @LastEditTime: 2019-12-12 21:17:14
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\231.2-的幂.java
 */
/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2的幂  2的幂变成2进制，开头是1其余全是0
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&n-1)==0;
    }
}
// @lc code=end

