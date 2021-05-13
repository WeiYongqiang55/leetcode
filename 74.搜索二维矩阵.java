/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 *
 * https://leetcode-cn.com/problems/search-a-2d-matrix/description/
 *
 * algorithms
 * Medium (37.69%)
 * Likes:    151
 * Dislikes: 0
 * Total Accepted:    36.9K
 * Total Submissions: 97.8K
 * Testcase Example:  '[[1,3,5,7],[10,11,16,20],[23,30,34,50]]\n3'
 *
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * 
 * 
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * 
 * 
 * 示例 1:
 * 
 * 输入:
 * matrix = [
 * ⁠ [1,   3,  5,  7],
 * ⁠ [10, 11, 16, 20],
 * ⁠ [23, 30, 34, 50]
 * ]
 * target = 3
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入:
 * matrix = [
 * ⁠ [1,   3,  5,  7],
 * ⁠ [10, 11, 16, 20],
 * ⁠ [23, 30, 34, 50]
 * ]
 * target = 13
 * 输出: false
 * 
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix==null){
            return false;
        }
        int row= matrix.length;
        if(row==0  ){
            return false;
        }
        int  col=matrix[0].length;
        if(col==0){
            return false;
        }
        if(target<matrix[0][0] || target > matrix[row-1][col-1]){
            return false;
        }

        int targetRow=0;
        while(targetRow<row && target>=matrix[targetRow][0]){
            targetRow++;
        }
        if(targetRow>0){
            targetRow--;
        }
        // if(target>matrix[targetRow][col-1]){
        //     return false;
        // }
        int targetCol=0;
        while(targetCol<col && target>matrix[targetRow][targetCol] ){
            targetCol++;
        }
        if(targetCol==col){
            return false;
        }else if(target==matrix[targetRow][targetCol]){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1},{3}};
        System.out.println(new Solution().searchMatrix(matrix, 3));
        
    }
}
// @lc code=end

