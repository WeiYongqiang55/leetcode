/*
 * @Author: your name
 * @Date: 2020-01-27 00:41:44
 * @LastEditTime: 2020-01-27 14:35:46
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/383.赎金信.java
 */
/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 *
 * https://leetcode-cn.com/problems/ransom-note/description/
 *
 * algorithms
 * Easy (51.01%)
 * Likes:    66
 * Dislikes: 0
 * Total Accepted:    15.3K
 * Total Submissions: 29.8K
 * Testcase Example:  '"a"\n"b"'
 *
 * 给定一个赎金信 (ransom)
 * 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回
 * true ；否则返回 false。
 * 
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * 
 * 注意：
 * 
 * 你可以假设两个字符串均只含有小写字母。
 * 
 * 
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] dic = new int[26];
        for (char c : magazine.toCharArray()) {
            dic[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (dic[c - 'a'] == 0) {
                return false;
            } else {
                dic[c - 'a']--;
            }
        }
        return true;
    }
}
// @lc code=end
