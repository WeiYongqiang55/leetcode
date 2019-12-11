import sun.security.util.Length;

/*
 * @Author: your name
 * @Date: 2019-12-09 16:48:59
 * @LastEditTime: 2019-12-09 17:10:54
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \javad:\leetcode\28.实现-str-str.java
 */
/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle){
        if(needle==null || needle.length()==0) return 0;
        if(needle.length() > haystack.length())return -1;
        for (int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        Solution a  = new Solution();
        System.out.print(a.strStr("a", "a"));
    }
}
// @lc code=end

