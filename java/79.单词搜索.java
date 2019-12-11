/*
 * @Author: your name
 * @Date: 2019-12-06 10:41:17
 * @LastEditTime: 2019-12-06 11:51:16
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edi
 * @FilePath: \javad:\leetcode\79.单词搜索.java
 */
/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    //一个全局变 success,标记是否成功，成功找到则不再遍历
    private boolean SUCCESS=false;
    private boolean[][] WALKED;
    private final int[][] DIRECTION = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };// 上 右 下 左
    private int m;// 行
    private int n;// 列
    

    public boolean exist(final char[][] board, final String word) {
        m = board.length;
        if (m == 0) {
            return false;
        }
        n = board[0].length;
        WALKED = new boolean[m][n];// 记录走没走过
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, 0, word,board)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(final int i, final int j, final int str_position, final String word,final char[][] board) {
        /**
         * @description: waiked 记录哪些被走过了 ，str_position记录字符串匹配到了第几个,cur记录当前在哪里
         * @param {type}
         * @return: 返回 true 或者false,
         */
        if (SUCCESS) {// 已经有结果了，不再遍历
            return true;
        }
        if (str_position == word.length() - 1) {

            if (board[i][j] == word.charAt(str_position)) {
                SUCCESS = true;
                return true;
            }
            else{
                return false;
            }
        }

        // 四个方向遍历 上右下左

        // int LIMIT = board.length * board[0].length; // 行*列
        if (board[i][j] == word.charAt(str_position)) {
            WALKED[i][j] = true;
            for (int step = 0; step < 4; step++) {
                final int newX = i + DIRECTION[step][0];
                final int newY = j + DIRECTION[step][1];
                if (inArea(newX, newY) && !WALKED[newX][newY]) {
                    if (dfs(newX, newY, str_position + 1, word,board)) {
                        return true;
                    }
                }

            }
            WALKED[i][j] = false;
        }
        return false;
    }

    public boolean inArea(final int x, final int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    // public static void main(final String[] args) {
    //     final char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
    //     final String word = "ABCB";
    //     final Solution solution = new Solution();
    //     System.out.println(solution.exist(board, word));
    // }
}
// @lc code=end

