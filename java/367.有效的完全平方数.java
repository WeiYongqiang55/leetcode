/*
 * @Author: your name
 * @Date: 2020-01-27 00:20:24
 * @LastEditTime : 2020-01-27 00:29:53
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/367.有效的完全平方数.java
 */
/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 *
 * https://leetcode-cn.com/problems/valid-perfect-square/description/
 *
 * algorithms
 * Easy (42.68%)
 * Likes:    84
 * Dislikes: 0
 * Total Accepted:    21.6K
 * Total Submissions: 50.3K
 * Testcase Example:  '16'
 *
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * 
 * 说明：不要使用任何内置的库函数，如  sqrt。
 * 
 * 示例 1：
 * 
 * 输入：16
 * 输出：True
 * 
 * 示例 2：
 * 
 * 输入：14
 * 输出：False
 * 
 * 
 */

// @lc code=start
class Solution {
    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long left = 2, right = num / 2, x, gussed;
        while (left <= right) {
            x = left + (right - left) / 2;
            gussed = (long) Math.pow(x, 2);
            if (gussed == num) {
                return true;
            } else if (gussed < num) {
                left = x + 1;
            } else {
                // 大于num
                right = x - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));

    }
}
// @lc code=end
