/*
 * @Author: your name
 * @Date: 2019-12-11 19:16:11
 * @LastEditTime: 2019-12-11 19:23:36
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\119.杨辉三角-ii.java
 */
/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>()); //[[1]]
        res.get(0).add(1);// [[1]]
        res.add(new ArrayList<Integer>(1));
        res.get(1).add(1);// [[1],[1]]
        res.get(1).add(1);// [[1],[1,1]]
        if(rowIndex <2){
            return res.get(rowIndex);
        }
        for (int i=2;i<rowIndex+1;i++){
            res.add(new ArrayList<>());
            for (int j =0;j<i+1;j++){
                if(j==0 || j==i){
                    res.get(i).add(1);
                }
                else{
                  res.get(i).add(res.get(i-1).get(j-1) + res.get(i-1).get(j));  
                }
            }
        }
        return res.get(rowIndex);
    }
}
// @lc code=end

