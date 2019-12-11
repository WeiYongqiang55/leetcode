import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @Author: your name
 * @Date: 2019-12-06 21:39:17
 * @LastEditTime: 2019-12-06 21:56:37
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \javad:\leetcode\90.子集-ii.java
 */
/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int begin =0;
        List<List<Integer>> res = new ArrayList<List<Integer>>(); 
        List<Integer> path = new ArrayList<Integer>();
        //先给nums 排个序
        Arrays.sort(nums);
        dfs(res,nums,path,begin);
        return res;
    }
    public void dfs(List<List<Integer>> res,int[] nums,List<Integer> path,int begin){
      
        res.add(new ArrayList<Integer>(path)); //深拷贝
            
        
        int i= begin;
        while(i<nums.length){
            // 选
            path.add(nums[i]);
            dfs(res,nums,path,i+1);
            // 不选
            path.remove(path.size()-1);
            // 和78题不同之处，跳过相同的
            while(i< (nums.length-1) && nums[i] == nums[i+1]){
                i++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        int[] nums = {4,4,4,1,4};
        System.out.println(a.subsetsWithDup(nums));
        
    }
}
// @lc code=end

