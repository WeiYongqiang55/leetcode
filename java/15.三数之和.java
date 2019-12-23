import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @Author: your name
 * @Date: 2019-12-14 21:48:56
 * @LastEditTime: 2019-12-14 22:10:27
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\15.三数之和.java
 */
/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 * 先排序，然后固定一个数字，从小到大 使用双指针
 * 确定接下来的两个数，
 *
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        int size = nums.length;
        if(nums==null || size<3){ return res;}
        //排序
        Arrays.sort(nums);
        for(int i=0; i<size;i++){
            if(nums[i]>0)break;
            if(i>0 && nums[i] == nums[i-1]) continue;//去重
            int Left = i+1;
            int Right = size-1;
            while(Left<Right){
                int sum = nums[i] + nums[Left] +nums[Right];
                if(sum ==0){
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[Left],nums[Right])));
                    while(Left < Right && nums[Left] == nums[Left+1]) Left++;
                    while(Left < Right && nums[Right] == nums[Right-1]) Right--;
                    Left++;
                    Right--;
                }
                else if(sum<0){
                    Left++;
                }else if(sum>0){
                    Right--;
                }
            }
        }
        return res;
    }
}
// @lc code=end

