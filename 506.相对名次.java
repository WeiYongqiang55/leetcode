import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * @lc app=leetcode.cn id=506 lang=java
 *
 * [506] 相对名次
 *
 * https://leetcode-cn.com/problems/relative-ranks/description/
 *
 * algorithms
 * Easy (53.04%)
 * Likes:    36
 * Dislikes: 0
 * Total Accepted:    7K
 * Total Submissions: 13.2K
 * Testcase Example:  '[5,4,3,2,1]'
 *
 * 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold
 * Medal", "Silver Medal", "Bronze Medal"）。
 * 
 * (注：分数越高的选手，排名越靠前。)
 * 
 * 示例 1:
 * 
 * 
 * 输入: [5, 4, 3, 2, 1]
 * 输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * 解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal"
 * and "Bronze Medal").
 * 余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
 * 
 * 提示:
 * 
 * 
 * N 是一个正整数并且不会超过 10000。
 * 所有运动员的成绩都不相同。
 * 
 * 
 */

// @lc code=start
class Solution {
    // public String[] findRelativeRanks(int[] nums) {
    //     int[] numscopy = Arrays.copyOf(nums, nums.length);
        
    //     Arrays.sort(numscopy);
        
    //     String[] res =  new String[nums.length];
    //     int length = nums.length;
    //     for(int i=0;i<nums.length;i++){
    //         int index = Arrays.binarySearch(numscopy,nums[i]);
    //         if(index==length-1){
    //             res[i]="Gold Medal";
    //         }
    //         else if(index==length-2){
    //             res[i]="Silver Medal";
    //         }
    //         else if(index==length-3){
    //             res[i]="Bronze Medal";
    //         }else{
    //             res[i] = String.valueOf(length-index);
    //         }
    //     }
    //     return res;
    // }
    public static  String[] findRelativeRanks(int[] nums) {
        //先找最大值
        int max =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int[] dp = new int[max+1];

        for(int i=0;i<nums.length;i++){
            dp[nums[i]]=i+1;
        }
        String[] res = new String[nums.length];

        for(int i=max,rank=1;i>=0;i--){
            if(dp[i]>0){
                switch(rank){
                    case 1:
                        res[dp[i]-1]="Gold Medal";
                        break;
                    case 2:
                        res[dp[i]-1]="Silver Medal";
                        break;
                    case 3:
                        res[dp[i]-1]="Bronze Medal";
                        break;
                    default:
                        res[dp[i]-1]=String.valueOf(rank);
                        break;
                }
                rank++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findRelativeRanks(new int[]{10,3,8,9,4});
    }
}
// @lc code=end

