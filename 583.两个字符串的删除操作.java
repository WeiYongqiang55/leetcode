/*
 * @lc app=leetcode.cn id=583 lang=java
 *
 * [583] 两个字符串的删除操作
 *
 * https://leetcode-cn.com/problems/delete-operation-for-two-strings/description/
 *
 * algorithms
 * Medium (48.57%)
 * Likes:    96
 * Dislikes: 0
 * Total Accepted:    6.4K
 * Total Submissions: 13.1K
 * Testcase Example:  '"sea"\n"eat"'
 *
 * 给定两个单词 word1 和 word2，找到使得 word1 和 word2 相同所需的最小步数，每步可以删除任意一个字符串中的一个字符。
 * 
 * 
 * 
 * 示例：
 * 
 * 输入: "sea", "eat"
 * 输出: 2
 * 解释: 第一步将"sea"变为"ea"，第二步将"eat"变为"ea"
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 给定单词的长度不超过500。
 * 给定单词中的字符只含有小写字母。
 * 
 * 
 */

// @lc code=start

class Solution {
    public int minDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        // dp 数组的性状，dp[i][j] 表示 s1[i:] 和s2[j:]两个子串
        // 达到相等所需删除的字符的数量，最终的答案为 dp[0][0]。
        //    a      p     p     l    e    ''
        // a                               a+d+s  
        // s                               d+s    
        // d                               d    
        // '' apple  pple  ple   le   e    0  2个空串之间的距离为0，
        // 初始化最下边和最右边的两条边界的数据 ，分别是用s1和s2与空串计算距离，
        for (int i = s1.length() - 1; i >= 0; i--) {
            dp[i][s2.length()] = dp[i+1][s2.length()] +1;
        }
        for (int j = s2.length() - 1; j >= 0; j--) {
            dp[s1.length()][j] = dp[s1.length()][j+1] +1;
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
                    dp[i][j] = Math.min(dp[i+1][j] + 1,
                                        dp[i][j+1] + 1);
                }
            }
        }
        return dp[0][0];
    }
}

// @lc code=end

