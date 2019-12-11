/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯 超时问题，加字典map 记忆化递归
 */

// @lc code=start
class Solution {
    int count=0;
    public int climbStairs(int n) {
        return active(n);

        //记忆递归
        // int[] memo = new int[n+1];
        // back(n,memo);
        // return count;
    }
    //递归解法 
    public void back(int n,int[] memo){
        if(n>=0 && memo[n]>0){
            count += memo[n];
            return ; 
        }
        if(n==0){
            count += 1;
            return ;
        }else if(n<0){
            return ;
        }else{
            if(n-1>=0){
                back(n-1,memo);
                memo[n-1] = count; 
            }
            if(n-2>=0){
                back(n-2,memo);
                memo[n-2] = count;
            }
            
        }
    }
    //动态规划 没有记忆递归快
    public int active(int n){
        if(n<3){
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.climbStairs(4));
    }
}
// @lc code=end

