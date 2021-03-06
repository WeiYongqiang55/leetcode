/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 *
 * https://leetcode-cn.com/problems/find-the-difference/description/
 *
 * algorithms
 * Easy (60.06%)
 * Likes:    103
 * Dislikes: 0
 * Total Accepted:    20K
 * Total Submissions: 33K
 * Testcase Example:  '"abcd"\n"abcde"'
 *
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 
 * 请找出在 t 中被添加的字母。
 * 
 * 
 * 
 * 示例:
 * 
 * 输入：
 * s = "abcd"
 * t = "abcde"
 * 
 * 输出：
 * e
 * 
 * 解释：
 * 'e' 是那个被添加的字母。
 * 
 * 
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int ssum = 0, tsum = 0;
        for (char c : cs) {
            ssum += (int) (c - 'a');
        }
        for (char c : ct) {
            tsum += (int) (c - 'a');
        }

        int result = tsum - ssum;
        char ccresult = (char) ('a' + result);

        return ccresult;
    }
}
// @lc code=end
