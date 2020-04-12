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
// class Solution {
//     List<List<String>> res = new ArrayList<>();

//     // 回溯
//     public List<List<String>> partition(String s) {

//         dfs(new ArrayList<>(), s,0);
//         return res;
//     }

//     public void dfs(List<String> tmp, String ss,int start) {
//         if (ss.length() == start) {
//             res.add(tmp);
//             return;
//         }
//         for (int i = start+1; i <= ss.length(); i++) {
//             String s1 =ss.substring(start, i);
//             // StringBuffer s2 = new StringBuffer(ss.substring(i, ss.length()));

            
//             if (isPalindrome(s1.toString())) {
//                 ArrayList<String> next = new ArrayList<>(tmp);
//                 next.add(s1.toString());
//                 dfs(next, ss,i);
//             }
            
//         }

//     }

//     // 判断是不是回文串 125
//     public boolean isPalindrome(String s) {
//         char[] ss = s.toCharArray();
//         int left = 0, right = ss.length - 1;
//         while (left <= right) {
            
            
//             char ll = ss[left];
//             char rr = ss[right];
//             if (ll != rr) {
//                 return false;
//             } else {
//                 left++;
//                 right--;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         new Solution().partition("efe");
//     }
// }

// class Solution {
//     public List<List<String>> partition(String s) {
//         List<List<String>> ans = new ArrayList<>();
//         backtracking(s, 0, new ArrayList<String>(), ans);
//         return ans;
//     }

//     private void backtracking(String s, int start, List<String> cur, List<List<String>> ans) {
//         if (start == s.length()) {
//             ans.add(new ArrayList<String>(cur));
//             return;
//         }

//         for (int i = start; i < s.length(); i++) {
//             if (!isPalindrome(s, start, i)) continue;
//             cur.add(s.substring(start, i + 1));
//             backtracking(s, i + 1, cur, ans);
//             cur.remove(cur.size() - 1);
//         }
//     }

//     private boolean isPalindrome(String s, int l, int r) {
//         while (l < r)
//             if (s.charAt(l++) != s.charAt(r--)) return false;
//         return true;
//     }
// }



//beat 99.83%  把string 换成char[]提升了30%速度
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if(s == null || s.length() == 0) return res;
        char[] chars = s.toCharArray();
        backtrack(chars,res,new ArrayList<String>(),0,0);
        return res;
    }

    private void backtrack(char[] chars, List<List<String>> res, ArrayList<String> list, int start, int index) {

        if(start == chars.length){
            res.add(new ArrayList<>(list));
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

        while(low < high){
            if(chars[low] != chars[high]) return false;
            --high;
            ++low;
        }
        return true;
    }
}

// @lc code=end
