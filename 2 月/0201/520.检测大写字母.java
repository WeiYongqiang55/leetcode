/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 *
 * https://leetcode-cn.com/problems/detect-capital/description/
 *
 * algorithms
 * Easy (54.27%)
 * Likes:    73
 * Dislikes: 0
 * Total Accepted:    14.4K
 * Total Submissions: 26.5K
 * Testcase Example:  '"USA"'
 *
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 * 
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * 
 * 
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 
 * 
 * 否则，我们定义这个单词没有正确使用大写字母。
 * 
 * 示例 1:
 * 
 * 
 * 输入: "USA"
 * 输出: True
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: "FlaG"
 * 输出: False
 * 
 * 
 * 注意: 输入是由大写和小写拉丁字母组成的非空单词。
 * 
 */

// @lc code=start
class Solution {
    public static boolean detectCapitalUse(String word) {
        /**
         * 第一个字母：大写
         *          后面的要么全大写，要么全小写
         * 第一个字母小写：
         *          后面的全小写
         */
        char[] cs = word.toCharArray();
        if(cs[0]>='A' && cs[0]<='Z'){
            if(word.substring(1).toUpperCase().equals(word.substring(1))) {
                return true;   
            }else if(word.substring(1).toLowerCase().equals(word.substring(1))) {
                return true;
            }else{
                return false;
            }
        }else{
            if(word.substring(1).toLowerCase().equals(word.substring(1))){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        detectCapitalUse("USA");
    }
}
// @lc code=end

