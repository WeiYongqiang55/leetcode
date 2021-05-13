import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=447 lang=java
 *
 * [447] 回旋镖的数量
 *
 * https://leetcode-cn.com/problems/number-of-boomerangs/description/
 *
 * algorithms
 * Easy (56.47%)
 * Likes:    75
 * Dislikes: 0
 * Total Accepted:    8.7K
 * Total Submissions: 15.4K
 * Testcase Example:  '[[0,0],[1,0],[2,0]]'
 *
 * 给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k
 * 之间的距离相等（需要考虑元组的顺序）。
 * 
 * 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
 * 
 * 示例:
 * 
 * 
 * 输入:
 * [[0,0],[1,0],[2,0]]
 * 
 * 输出:
 * 2
 * 
 * 解释:
 * 两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
 * 
 * 
 */

// @lc code=start
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        int res = 0;
        for(int i=0;i<points.length;i++) {
            hashmap.clear();
            for(int j=0;j<points.length;j++) {
                if(i==j){
                    continue;
                }else{
                    int distance = (int) Math.pow(points[i][0] - points[j][0],2)+(int)Math.pow(points[i][1]-points[j][1],2);
                    if(hashmap.containsKey(distance)){
                        res += hashmap.get(distance)*2;
                        hashmap.put(distance,hashmap.get(distance)+1);
                    }else{
                        hashmap.put(distance,1);
                    }
                }
            }
        } 
        return res;
    }
}
// @lc code=end

