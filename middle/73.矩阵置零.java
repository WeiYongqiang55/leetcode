
/*
 * @Author: your name
 * @Date: 2019-12-05 10:31:28
 * @LastEditTime: 2019-12-05 10:43:31
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\73.矩阵置零.java
 */
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        // int R = matrix.length;
        // int C = matrix[0].length;
        // Set<Integer> rows = new HashSet<Integer>();
        // Set<Integer> cols = new HashSet<Integer>();

        // for(int i =0;i<R;i++){
        // for (int j= 0;j<C;j++){
        // if (matrix[i][j] == 0){
        // rows.add(i);
        // cols.add(j);
        // }
        // }
        // }

        // for(int i =0;i<R;i++){
        // for (int j= 0;j<C;j++){
        // if(rows.contains(i) || cols.contains(j)){
        // matrix[i][j] =0;
        // }
        // }
        // }

        if (matrix == null || matrix.length == 0) {
            return;
        }
        boolean[] row = new boolean[matrix.length]; // 记录每一行是否有零
        boolean[] col = new boolean[matrix[0].length]; // 记录每一列是否有零
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < col.length; j++) {
            if (col[j]) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}

// @lc code=end
