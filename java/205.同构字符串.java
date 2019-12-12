import java.util.HashMap;
import java.util.Map;

/*
 * @Author: your name
 * @Date: 2019-12-12 19:54:02
 * @LastEditTime: 2019-12-12 20:29:34
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\205.同构字符串.java
 */
/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // 解法1 beats 51%
        Map<Character,Character> map1 = new HashMap<>();
        int size1 = s.length();
        int size2 = t.length();
        if(size1 != size2){
            return false;
        }
        for (int i=0;i<size1;i++){
            if(map1.containsKey(s.charAt(i))){
                if(map1.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                if(map1.containsValue(t.charAt(i))){
                    //已经有字符和这个匹配了
                    return false;
                }else{
                    map1.put(s.charAt(i),t.charAt(i));
                }
            }
        }
        return true;

        // 解法2  这个解法beats 96%
        // char[] ch1 = s.toCharArray();
        // char[] ch2 = t.toCharArray();
        // int len = s.length();
        // for (int i = 0; i < len; i++) {
        //     if(s.indexOf(ch1[i]) != t.indexOf(ch2[i])){
        //         return false;
        //     }
        // }
        // return true;
    }
}
// @lc code=end

