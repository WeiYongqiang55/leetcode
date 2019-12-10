/*
 * @Author: your name
 * @Date: 2019-12-09 15:55:52
 * @LastEditTime: 2019-12-09 16:16:20
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editstrs
 * @FilePath: \javad:\leetcode\14.最长公共前缀.java
 */
/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs ==null || strs.length ==0) return "";
        for (int i =0 ;i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            for (int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        Solution a  = new Solution();
        String[] strs = {"flower","flow","flight"};
        String res = a.longestCommonPrefix(strs);
        System.out.print(res);
    }
}
// @lc code=end

