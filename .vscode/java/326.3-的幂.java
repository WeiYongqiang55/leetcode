import java.util.Set;
import java.util.TreeSet;
import java.lang.Math;
/*
 * @Author: your name
 * @Date: 2020-01-26 12:59:41
 * @LastEditTime : 2020-01-26 13:59:15
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/326.3-的幂.java
 */
/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3的幂
 *
 * https://leetcode-cn.com/problems/power-of-three/description/
 *
 * algorithms
 * Easy (45.58%)
 * Likes:    85
 * Dislikes: 0
 * Total Accepted:    33.8K
 * Total Submissions: 73.3K
 * Testcase Example:  '27'
 *
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * 
 * 示例 1:
 * 
 * 输入: 27
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: 0
 * 输出: false
 * 
 * 示例 3:
 * 
 * 输入: 9
 * 输出: true
 * 
 * 示例 4:
 * 
 * 输入: 45
 * 输出: false
 * 
 * 进阶：
 * 你能不使用循环或者递归来完成本题吗？
 * 
 * 解题思路：
 * int的大小在32bit机器中是有上限的，我们找到3的幂次放在int中de
 * 的最大值MAX，然后因为任意一个3的幂次方X 乘以若干个3应该等于MAX
 * 对于任意的n，我们用MAX%n ，如果结果为0，说明是3的幂次方，否则不是
 * 
 */

// @lc code=start
class Solution {
    // public static Set<Integer> set = new TreeSet<>();

    public static boolean isPowerOfThree(int n) {
        // double a = Math.log(n) / Math.log(3);
        // return Math.abs(a - Math.rint(a)) <= 0.00000000000001;

        // 方法2
        int MAXINT = Integer.MAX_VALUE;
        int max3 = (int) (Math.log(MAXINT) / Math.log(3));
        int MAX = (int) Math.pow(3, max3);
        // 最大的3的幂次方
        System.out.println("最大的3的幂次方是： " + MAX);

        if (MAX % n == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(3));
    }
}
// @lc code=end