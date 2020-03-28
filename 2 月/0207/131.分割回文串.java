import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 *
 * https://leetcode-cn.com/problems/palindrome-partitioning/description/
 *
 * algorithms
 * Medium (64.77%)
 * Likes:    209
 * Dislikes: 0
 * Total Accepted:    20.6K
 * Total Submissions: 31.7K
 * Testcase Example:  '"aab"'
 *
 * 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
 * 
 * 返回 s 所有可能的分割方案。
 * 
 * 示例:
 * 
 * 输入: "aab"
 * 输出:
 * [
 * ⁠ ["aa","b"],
 * ⁠ ["a","a","b"]
 * ]
 * 
 */

// @lc code=start
class Solution {
    List<List<String>> res = new ArrayList<List<String>>();

    public List<List<String>> partition(String s) {
        dfs(s,0,new ArrayList<String>());
        return res;
    }
    public void dfs(String s,int startPositon,ArrayList<String> list){
        
        //递归出口，已经没有字母可以选择了
        if(startPositon==s.length()){
            res.add(new ArrayList<String>(list));
            return ;
        }else{
            for(int i=startPositon;i<s.length();i++){
                ArrayList<String> newlist = new ArrayList<String>(list);
                //当前切割是回文
                if(isPalindrome(s.substring(startPositon,i+1))){
                    newlist.add(s.substring(startPositon,i+1));
                    dfs(s,i+1,newlist);
                }
            }
        }
    }
    /**
     * check if str is palindrome? 
     * @param str
     * @return palindrome :true  ; not palindrome :false
     */
    public boolean isPalindrome(String str) {
        if(str.equals(new StringBuilder(str).reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.partition("aab");
    }
}
// @lc code=end

