/*
 * @lc app=leetcode.cn id=201 lang=java
 *
 * [201] 数字范围按位与
 *
 * https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/description/
 *
 * algorithms
 * Medium (44.44%)
 * Likes:    79
 * Dislikes: 0
 * Total Accepted:    7.8K
 * Total Submissions: 17.4K
 * Testcase Example:  '5\n7'
 *
 * 给定范围 [m, n]，其中 0 <= m <= n <= 2147483647，返回此范围内所有数字的按位与（包含 m, n 两端点）。
 * 
 * 示例 1: 
 * 
 * 输入: [5,7]
 * 输出: 4
 * 
 * 示例 2:
 * 
 * 输入: [0,1]
 * 输出: 0
 * 
 */

// @lc code=start
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int zeros = 0;
    while (n > m) {
        zeros++;
        //无符号右移
        m >>>= 1;
        n >>>= 1;
    }
    //将 0 的个数空出来
    return (m << zeros);//

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.rangeBitwiseAnd(10,11);
        System.out.println(res);
        System.out.println(10<<1);
    }
}
// @lc code=end

