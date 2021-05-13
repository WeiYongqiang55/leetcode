import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=873 lang=java
 *
 * [873] 最长的斐波那契子序列的长度
 *
 * https://leetcode-cn.com/problems/length-of-longest-fibonacci-subsequence/description/
 *
 * algorithms
 * Medium (45.53%)
 * Likes:    62
 * Dislikes: 0
 * Total Accepted:    4.8K
 * Total Submissions: 10.4K
 * Testcase Example:  '[1,2,3,4,5,6,7,8]'
 *
 * 如果序列 X_1, X_2, ..., X_n 满足下列条件，就说它是 斐波那契式 的：
 * 
 * 
 * n >= 3
 * 对于所有 i + 2 <= n，都有 X_i + X_{i+1} = X_{i+2}
 * 
 * 
 * 给定一个严格递增的正整数数组形成序列，找到 A 中最长的斐波那契式的子序列的长度。如果一个不存在，返回  0 。
 * 
 * （回想一下，子序列是从原序列 A 中派生出来的，它从 A 中删掉任意数量的元素（也可以不删），而不改变其余元素的顺序。例如， [3, 5, 8] 是
 * [3, 4, 5, 6, 7, 8] 的一个子序列）
 * 
 * 
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入: [1,2,3,4,5,6,7,8]
 * 输出: 5
 * 解释:
 * 最长的斐波那契式子序列为：[1,2,3,5,8] 。
 * 
 * 
 * 示例 2：
 * 
 * 输入: [1,3,7,11,12,14,18]
 * 输出: 3
 * 解释:
 * 最长的斐波那契式子序列有：
 * [1,11,12]，[3,11,14] 以及 [7,11,18] 。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 3 <= A.length <= 1000
 * 1 <= A[0] < A[1] < ... < A[A.length - 1] <= 10^9
 * （对于以 Java，C，C++，以及 C# 的提交，时间限制被减少了 50%）
 * 
 * 方法二：动态规划
状态定义：dp[i][j] 表示以A[i]A[j]结尾的斐波那契额子序列的最大长度
状态转移方程：
如果有一个A[k] 满足；A[k]+A[i] = A[j]
                    那么dp[i][j] = dp[k][i]+1
                
base case: 
        任意两个长度的子序列的最大斐波那契子序列的长度都是2 ，


https://leetcode-cn.com/problems/length-of-longest-fibonacci-subsequence/solution/zhuang-tai-ding-yi-hen-shi-zhong-yao-by-christmas_/
 * 
 */

// @lc code=start
class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int N = A.length;
        Map<Integer, Integer> index = new HashMap();
        for (int i = 0; i < N; ++i)
            index.put(A[i], i);//保存 数字对应的 index

        int[][] dp = new int[N+1][N+1];
        // base case`
        for (int i = 0; i <=N; i++) {
            for (int j = i + 1; j <=N; j++) {
                dp[i][j] = 2;
            }
        }
    
    
        int ans = 0;

        for (int j = 0; j < N; ++j)
            for (int k = j+1; k < N; ++k) {
                // i   j     k 
                //A[i]+A[j]=A[k]
                int i = index.getOrDefault(A[k] - A[j], -1);//计算A[i]的index
                if (i >= 0 && i < j) {
                    // A[i]存在
                    // Encoding tuple (i, j) as integer (i * N + j)
                    dp[j][k]= Math.max(dp[j][k],dp[i][j]+1);
                    ans = Math.max(ans,dp[j][k]);
                }
            }

        return ans >= 3 ? ans : 0;
    }
}


// @lc code=end

