/*
 * @lc app=leetcode.cn id=72 lang=java
 *
 * [72] 编辑距离
 *
 * https://leetcode-cn.com/problems/edit-distance/description/
 *
 * algorithms
 * Hard (56.70%)
 * Likes:    771
 * Dislikes: 0
 * Total Accepted:    50.7K
 * Total Submissions: 85.5K
 * Testcase Example:  '"horse"\n"ros"'
 *
 * 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
 * 
 * 你可以对一个单词进行如下三种操作：
 * 
 * 
 * 插入一个字符
 * 删除一个字符
 * 替换一个字符
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：word1 = "horse", word2 = "ros"
 * 输出：3
 * 解释：
 * horse -> rorse (将 'h' 替换为 'r')
 * rorse -> rose (删除 'r')
 * rose -> ros (删除 'e')
 * 
 * 
 * 示例 2：
 * 
 * 输入：word1 = "intention", word2 = "execution"
 * 输出：5
 * 解释：
 * intention -> inention (删除 't')
 * inention -> enention (将 'i' 替换为 'e')
 * enention -> exention (将 'n' 替换为 'x')
 * exention -> exection (将 'n' 替换为 'c')
 * exection -> execution (插入 'u')
 * 
 * 动态规划
 */

// @lc code=start
class Solution {
    
    public int minDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        // dp 数组的性状，dp[i][j] 表示 s1[i:] 和s2[j:]两个子串
        // 达到相等所需删除的字符的数量，最终的答案为 dp[0][0]。
        // asd是 s1,apple是s2
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
                    /**
                     * 不相等，
                     * 选择1：s1插入一个s2一样的字符,s1 和s2匹配了，s2向后走一个
                     * 选择2：s1替换成s2中的字符，i++，j++;
                     * 选择3：s1删除当前字符，接着和s2比较 i+1,j不变
                    */
                    dp[i][j] = Math.min(Math.min(dp[i][j+1]+1,dp[i+1][j+1]+1),dp[i+1][j]+1);
                }
            }
        }
        return dp[0][0];
    }
}
// @lc code=end

