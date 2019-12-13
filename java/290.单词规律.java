/*
 * @Author: your name
 * @Date: 2019-12-13 15:23:51
 * @LastEditTime: 2019-12-13 15:53:12
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\290.单词规律.java
 */
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.SourceDataLine;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<>();
        char[] pp = pattern.toCharArray();
        String[] ss = str.split(" "); 
        int size = pp.length;
        if(size!=ss.length){
            return  false;
        }
        for(int i=0;i<size;i++){
            if(!map.containsKey(pp[i])){
                if(map.containsValue(ss[i])){
                    return false;
                }
                map.put(pp[i],ss[i]);
            }else{
                // System.out.println(map.get(pp[i]));
                // System.out.println(ss[i]);
                 if(!map.get(pp[i]).equals(ss[i])){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.wordPattern("abba",
        "dog cat cat dog"));
        
    }
}
// @lc code=end

