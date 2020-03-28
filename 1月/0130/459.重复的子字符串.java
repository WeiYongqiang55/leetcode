/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 *
 * https://leetcode-cn.com/problems/repeated-substring-pattern/description/
 *
 * algorithms
 * Easy (44.99%)
 * Likes:    147
 * Dislikes: 0
 * Total Accepted:    12.8K
 * Total Submissions: 28.4K
 * Testcase Example:  '"abab"'
 *
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * 
 * 示例 1:
 * 
 * 
 * 输入: "abab"
 * 
 * 输出: True
 * 
 * 解释: 可由子字符串 "ab" 重复两次构成。
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: "aba"
 * 
 * 输出: False
 * 
 * 
 * 示例 3:
 * 
 * 
 * 输入: "abcabcabcabc"
 * 
 * 输出: True
 * 
 * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 * 
 * 
 */

// @lc code=start
class Solution {
    public static boolean repeatedSubstringPattern(String s) {
        //正则表达式
        // return s.matches("(\\w+)\\1+");

        int len = s.length();

        for (int i = len / 2; i > 0; i--) {
            //如果不是倍数，直接跳过，因为只有是倍数 才可能
            if (len % i != 0) {
                continue;
            }

            //假设是重复的字符串，那么用第一个子串和最后一个子串比较，
            //如果相等，接着和下一个子串比较，如果所有子串都相等那么就是重复的
            boolean flag = true;
            for (int j = len / i; j > 1; j--) {
                if (!s.substring(0, i).equals(s.substring((j - 1) * i, j * i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        repeatedSubstringPattern("abacabacabac");
    }
}
// @lc code=end

