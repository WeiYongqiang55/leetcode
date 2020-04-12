import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=139 lang=java
 *
 * [139] 单词拆分
 *
 * https://leetcode-cn.com/problems/word-break/description/
 *
 * algorithms
 * Medium (42.99%)
 * Likes:    297
 * Dislikes: 0
 * Total Accepted:    32.4K
 * Total Submissions: 75.3K
 * Testcase Example:  '"leetcode"\n["leet","code"]'
 *
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * 
 * 说明：
 * 
 * 
 * 拆分时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 * 
 * 
 * 示例 1：
 * 
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * 
 * 
 * 示例 2：
 * 
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 * 注意你可以重复使用字典中的单词。
 * 
 * 
 * 示例 3：
 * 
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 * 
 * 回溯 超时
 * 记忆化搜索，62% beat
 * 
 */

// @lc code=start
class Solution {

    // 动态规划，
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet=new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }


    // public boolean wordBreak(String s, List<String> wordDict) {
    //     return dfs(s,new HashSet<String>(wordDict),0,new Boolean[s.length()]);
    // }

    // 回溯
    private boolean dfs(String s,HashSet<String> words,int start,Boolean[] memo){
        if(start == s.length()){
            return true;
        }
        if(memo[start]!=null){
            return memo[start];
        }
        for(int end = start+1;end<=s.length();end++){
            if(words.contains(s.substring(start,end)) && dfs(s,words,end,memo)){
                return memo[start]=true;
            }
        }
        return memo[start]=false;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("cat");
        words.add("cats");
        words.add("sand");
        words.add("and");
        words.add("dog");

        new Solution().wordBreak("catsandog", words);
    }
}
// @lc code=end

