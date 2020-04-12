/*
 * @lc app=leetcode.cn id=188 lang=java
 *
 * [188] 买卖股票的最佳时机 IV
 *
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv/description/
 *
 * algorithms
 * Hard (29.40%)
 * Likes:    192
 * Dislikes: 0
 * Total Accepted:    15.8K
 * Total Submissions: 53.6K
 * Testcase Example:  '2\n[2,4,1]'
 *
 * 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 * 
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
 * 
 * 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 
 * 示例 1:
 * 
 * 输入: [2,4,1], k = 2
 * 输出: 2
 * 解释: 在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
 * 
 * 
 * 示例 2:
 * 
 * 输入: [3,2,6,5,0,3], k = 2
 * 输出: 7
 * 解释: 在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4
 * 。
 * 随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 。
 * 
 * 
 */

// @lc code=start
class Solution {
    
    public int maxProfit(int k, int[] prices) {
        if(k==0) return 0;
        int n = prices.length;
        if(k>prices.length/2) return maxProfit_k_inf(prices);
        int[][][] dp = new int[n][k+1][2];
        for(int i=0;i<n;i++){
            // base case
            dp[i][0][0] = 0;//至今为止没有交易，收益为0
            dp[i][0][1] = Integer.MIN_VALUE;//交易了0次，但持有股票，不符合规则
            for(int t =1;t<=k;t++){
                // base case
                if(i==0){
                    dp[i][t][0] = 0;//第一天买入t次，当天卖出t次,收入为0
                    dp[i][t][1] = -prices[i];//甭管第一天买多少次，反正最后少卖一次，持有了股票
                    continue;
                }
                dp[i][t][0] = Math.max(dp[i-1][t][0],dp[i-1][t][1]+prices[i]);
                dp[i][t][1] = Math.max(dp[i-1][t][1], dp[i-1][t-1][0]-prices[i]);
            }
        }
        return dp[n-1][k][0];
    }

    public int maxProfit_k_inf(int[] prices) {
        int n = prices.length;
        int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1, temp - prices[i]);
        }
        return dp_i_0;
    }

    

}
// @lc code=end

