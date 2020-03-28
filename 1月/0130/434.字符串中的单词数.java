/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 *
 * https://leetcode-cn.com/problems/number-of-segments-in-a-string/description/
 *
 * algorithms
 * Easy (33.57%)
 * Likes:    45
 * Dislikes: 0
 * Total Accepted:    11.6K
 * Total Submissions: 34.5K
 * Testcase Example:  '"Hello, my name is John"'
 *
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * 
 * 示例:
 * 
 * 输入: "Hello, my name is John"
 * 输出: 5
 * 
 * 
 */

// @lc code=start
class Solution {
    public static int countSegments(String s) {
        s= s.trim();//去除首尾空格
        if(s.length()==0 || s==null){
            return 0;
        }
        String[] res = s.split("\\s+");//使用一个或者多个空格分割
        return res.length;
    }
    public static void main(String[] args) {
        int res = countSegments("    foo    bar");
        System.out.println(res);
    }
}
// @lc code=end

