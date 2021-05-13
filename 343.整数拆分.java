/*
 * @lc app=leetcode.cn id=343 lang=java
 *
 * [343] 整数拆分
 *
 * https://leetcode-cn.com/problems/integer-break/description/
 *
 * algorithms
 * Medium (55.30%)
 * Likes:    195
 * Dislikes: 0
 * Total Accepted:    23.1K
 * Total Submissions: 41.5K
 * Testcase Example:  '2'
 *
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 * 
 * 示例 1:
 * 
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1。
 * 
 * 示例 2:
 * 
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 * 
 * 说明: 你可以假设 n 不小于 2 且不大于 58。
 * 
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        if(n==4) return 4;
        //从4开始以后的每一个数，其通过拆分得到的积都大于其本身，不要问我为什么，猜的
        int []dp_max=new int[n+1];//n>=5，从下标1开始使用dp表
        dp_max[1]=1;
        dp_max[2]=2;
        dp_max[3]=3;
        dp_max[4]=4;
        //当下面用到的加数小于5时，使用它们本身而不是它们的拆分值，因为小于5时它们本身更大
        //只有当加数大于等于5时，才用它们的拆分值
        for(int each_num=5;each_num<=n;each_num++){
            dp_max[each_num]=dp_max[1]*dp_max[each_num-1];//初始化，比如5=1+4，此时给dp_max[5]赋值1*4
            for(int i=2;i<=each_num/2;i++){//i<=each_num/2即可,因为拆分各部分之积与顺序无关

                int res = dp_max[i]*dp_max[each_num-i];
                if(res>dp_max[each_num]) {
                    dp_max[each_num]=res;
                }   
            }

        }
        return dp_max[n];


    }
}


// @lc code=end

