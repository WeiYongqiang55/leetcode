/*
 * @Author: your name
 * @Date: 2019-12-09 18:13:16
 * @LastEditTime: 2019-12-09 18:25:07
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edi t
 * @FilePath: \javad:\leetcode\58.最后一个单词的长度.java
 */
/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();//去掉前后的空格
        int start = s.lastIndexOf(" ") + 1;
        return s.substring(start).length();
    }
}
// @lc code=end

