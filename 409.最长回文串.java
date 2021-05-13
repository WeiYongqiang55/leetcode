/*
 * @Author: your name
 * @Date: 2020-01-29 15:02:46
 * @LastEditTime : 2020-01-29 15:43:43
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/409.最长回文串.java
 */
/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 *
 * https://leetcode-cn.com/problems/longest-palindrome/description/
 *
 * algorithms
 * Easy (50.99%)
 * Likes:    93
 * Dislikes: 0
 * Total Accepted:    14.4K
 * Total Submissions: 27.9K
 * Testcase Example:  '"abccccdd"'
 *
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * 
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * 
 * 示例 1: 
 * 
 * 
 * 输入:
 * "abccccdd"
 * 
 * 输出:
 * 7
 * 
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * 
 * 
 */

// @lc code=start
class Solution {
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int res = 0;
        for (int i : count) {
            res += i / 2 * 2;
            if (i % 2 == 1 && res % 2 == 0) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int result = longestPalindrome("abbbcccddd");
        System.out.println(result);
    }
}
// @lc code=end
