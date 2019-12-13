import sun.security.util.Length;

/*
 * @Author: your name
 * @Date: 2019-12-13 10:27:45
 * @LastEditTime: 2019-12-13 10:39:20
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editif()
 * @FilePath: \leetcode\242.有效的字母异位词.java
 */
/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int[] count = new int[26];
        int length = sarr.length;
        for(int i=0;i<length;i++){
            count[sarr[i]-'a']++;
        }
        for(int j= 0;j<length;j++){
            int num = tarr[j] - 'a';
            count[num]--;
            if(count[num] <0){
                return false;
            }       
        }
        return true;
    }
}
// @lc code=end

