/*
 * @lc app=leetcode.cn id=712 lang=java
 *
 * [712] 两个字符串的最小ASCII删除和
 *
 * https://leetcode-cn.com/problems/minimum-ascii-delete-sum-for-two-strings/description/
 *
 * algorithms
 * Medium (62.15%)
 * Likes:    108
 * Dislikes: 0
 * Total Accepted:    4.2K
 * Total Submissions: 6.7K
 * Testcase Example:  '"sea"\n"eat"'
 *
 * 给定两个字符串s1, s2，找到使两个字符串相等所需删除字符的ASCII值的最小和。
 * 
 * 示例 1:
 * 
 * 
 * 输入: s1 = "sea", s2 = "eat"
 * 输出: 231
 * 解释: 在 "sea" 中删除 "s" 并将 "s" 的值(115)加入总和。
 * 在 "eat" 中删除 "t" 并将 116 加入总和。
 * 结束时，两个字符串相等，115 + 116 = 231 就是符合条件的最小和。
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: s1 = "delete", s2 = "leet"
 * 输出: 403
 * 解释: 在 "delete" 中删除 "dee" 字符串变成 "let"，
 * 将 100[d]+101[e]+101[e] 加入总和。在 "leet" 中删除 "e" 将 101[e] 加入总和。
 * 结束时，两个字符串都等于 "let"，结果即为 100+101+101+101 = 403 。
 * 如果改为将两个字符串转换为 "lee" 或 "eet"，我们会得到 433 或 417 的结果，比答案更大。
 * 
 * 
 * 注意:
 * 
 * 
 * 0 < s1.length, s2.length <= 1000。
 * 所有字符串中的字符ASCII值在[97, 122]之间。
 * 
 * 动态规划  编辑距离题 
 * 有三种变相，分别是 删除，替换，插入 一个字符，
 * 对应的状态转移方程
 */

// @lc code=start
class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        // dp 数组的性状，dp[i][j] 表示 s1[i:] 和s2[j:]两个子串
        // 达到相等所需删除的字符的 ASCII 值的最小和，最终的答案为 dp[0][0]。
        //    a      p     p     l    e    ''
        // a                               a+d+s  
        // s                               d+s    
        // d                               d    
        // '' apple  pple  ple   le   e    0  2个空串之间的距离为0，
        // 初始化最下边和最右边的两条边界的数据 ，分别是用s1和s2与空串计算距离，
        for (int i = s1.length() - 1; i >= 0; i--) {
            dp[i][s2.length()] = dp[i+1][s2.length()] + s1.codePointAt(i);
        }
        for (int j = s2.length() - 1; j >= 0; j--) {
            dp[s1.length()][j] = dp[s1.length()][j+1] + s2.codePointAt(j);
        }

        // 从后往前遍历
        for (int i = s1.length() - 1; i >= 0; i--) {
            for (int j = s2.length() - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    // 如果相等就什么都不干，s1向前走一个，s2向前走一个，就是 i+1->i  j+1->j
                    dp[i][j] = dp[i+1][j+1];
                } else {
                    // 不相等，要么删除s1的要么删除s2的
                    // dp[i+1][j]就是s1的i位置被删除
                    // dp[i][j+1]就是s2的j位置被删除
                    dp[i][j] = Math.min(dp[i+1][j] + s1.codePointAt(i),
                                        dp[i][j+1] + s2.codePointAt(j));
                }
            }
        }
        return dp[0][0];
    }
}


// @lc code=end

