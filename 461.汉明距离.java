/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 *
 * https://leetcode-cn.com/problems/hamming-distance/description/
 *
 * algorithms
 * Easy (74.42%)
 * Likes:    235
 * Dislikes: 0
 * Total Accepted:    39.5K
 * Total Submissions: 53K
 * Testcase Example:  '1\n4'
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 
 * 注意：
 * 0 ≤ x, y < 2^31.
 * 
 * 示例:
 * 
 * 
 * 输入: x = 1, y = 4
 * 
 * 输出: 2
 * 
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ⁠      ↑   ↑
 * 
 * 上面的箭头指出了对应二进制位不同的位置。
 * 
 * 
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);//返回数字的二进制中的1的个数
    }
}
// @lc code=end

