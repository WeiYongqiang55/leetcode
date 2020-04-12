import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=132 lang=java
 *
 * [132] 分割回文串 II
 *
 * https://leetcode-cn.com/problems/palindrome-partitioning-ii/description/
 *
 * algorithms
 * Hard (42.54%)
 * Likes:    119
 * Dislikes: 0
 * Total Accepted:    9K
 * Total Submissions: 21.2K
 * Testcase Example:  '"aab"'
 *
 * 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
 * 
 * 返回符合要求的最少分割次数。
 * 
 * 示例:
 * 
 * 输入: "aab"
 * 输出: 1
 * 解释: 进行一次分割就可将 s 分割成 ["aa","b"] 这样两个回文子串。
 * 
 * 
 */

// @lc code=start
class Solution {
    int ans=0;
    int[][] map;
    public int minCut(String s) {
        List<List<String>> res = new ArrayList<>();
        
        if(s == null || s.length() == 0) return 0;
        char[] chars = s.toCharArray();
        map = new int[chars.length][chars.length];//默认是0
        backtrack(chars,res,new ArrayList<String>(),0,0);
        return ans-1;
    }

    private void backtrack(char[] chars, List<List<String>> res, ArrayList<String> list, int start, int index) {

        if(start == chars.length){
            if(res.isEmpty()){
                ans = list.size();
                res.add(new ArrayList<>(list));
            }
            if(list.size()<ans){
                ans =  list.size();
            }
            
            return;
        }
        for (int i = index; i < chars.length; i++){

            if(!isPalindrome(chars,start,i)) continue;
            list.add(new String(chars,start,i - start + 1));
            backtrack(chars,res,list,i + 1,i + 1);
            list.remove(list.size() - 1);
        }
    }

    private boolean isPalindrome(char[] chars,int low,int high){

        int _low=low,_high=high;
        if(map[low][high]==1){//表示是回文
            return true;
        }
        if(map[low][high]==2){
            return false;
        }
        while(low < high){
            if(chars[low] != chars[high]){
                map[_low][_high]=2;
                return false;
            } 
            --high;
            ++low;
        }
        map[_low][_high]=1;
        return true;
    }
}
// @lc code=end

