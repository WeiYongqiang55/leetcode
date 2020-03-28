/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 *
 * https://leetcode-cn.com/problems/reverse-string-ii/description/
 *
 * algorithms
 * Easy (51.37%)
 * Likes:    58
 * Dislikes: 0
 * Total Accepted:    10.4K
 * Total Submissions: 20.2K
 * Testcase Example:  '"abcdefg"\n2'
 *
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k
 * 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 * 
 * 示例:
 * 
 * 
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 * 
 * 
 * 要求:
 * 
 * 
 * 该字符串只包含小写的英文字母。
 * 给定字符串的长度和 k 在[1, 10000]范围内。
 * 
 * 
 */

// @lc code=start
class Solution {
    public static String reverseStr(String s, int k) {
        StringBuilder ss = new StringBuilder();
        boolean flag = true;//是否翻转的开关
        for(int i = 0; i < s.length();i+=k){
            if(flag){
                if(i+k<s.length()){
                    ss.append(new  StringBuilder(s.substring(i,i+k)).reverse()); 
                }else{
                    ss.append(new  StringBuilder(s.substring(i,s.length())).reverse()); 
                }
                flag = false;
            }else{
                if(i+k<s.length()){
                    ss.append(s.substring(i,i+k));
                }else{
                    ss.append(s.substring(i,s.length()));
                }
                flag=true;
            }
        }
        System.out.println(ss.toString());
        return ss.toString();
    }

    public static void main(String[] args) {
        reverseStr("abcdefg",2);
    }
}
// @lc code=end

