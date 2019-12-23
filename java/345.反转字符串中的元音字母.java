import java.util.Arrays;
import java.util.HashSet;

/*
 * @Author: your name
 * @Date: 2019-12-14 13:45:16
 * @LastEditTime: 2019-12-14 14:06:38
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editle
 * 
 * @FilePath: \leetcode\345.反转字符串中的元音字母.java
 */
/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    private final static HashSet<Character> vowels =
     new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] ss = s.toCharArray();
        while(left<= right){
            if(vowels.contains(ss[left])){
                if(vowels.contains(ss[right])){
                    if(ss[left]!=ss[right]){
                        char temp =ss[right];
                        ss[right] = ss[left];
                        ss[left] = temp;
                    }
                    left++;
                    right--;    
                }else{
                    right--;
                }
            }else{
                left++;
            }
        }
        String res = String.valueOf(ss);
        System.out.println(res);
        return res;  
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.print(a.reverseVowels("hello"));
    }
}
// @lc code=end

