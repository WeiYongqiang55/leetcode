import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 *
 * https://leetcode-cn.com/problems/perfect-squares/description/
 *
 * algorithms
 * Medium (52.91%)
 * Likes:    301
 * Dislikes: 0
 * Total Accepted:    35.5K
 * Total Submissions: 66.5K
 * Testcase Example:  '12'
 *
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 * 
 * 示例 1:
 * 
 * 输入: n = 12
 * 输出: 3 
 * 解释: 12 = 4 + 4 + 4.
 * 
 * 示例 2:
 * 
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9.
 * 
 */

// @lc code=start
class Solution {
	private class Node {
		int val;
		int step;

		public Node(int val, int step) {
			this.val = val;
			this.step = step;
		}
	}

    // BFS
	public int numSquares(int n) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(n, 1));
		boolean record[] = new boolean[n];
		while (!queue.isEmpty()) {
			int val = queue.peek().val;
			int step = queue.peek().step;
			queue.remove();
			// 每一层的广度遍历
			for (int i = 1;; i++) {
				int nextVal = val - i * i;
				// 说明已到最大平方数
				if (nextVal < 0)
					break;

				// 由于是广度遍历，所以当遍历到0时，肯定是最短路径
				if(nextVal == 0)
					return step;
				
				// 当再次出现时没有必要加入，因为在该节点的路径长度肯定不小于第一次出现的路径长
				if(!record[nextVal]){
				   queue.add(new Node(nextVal,step + 1));
				   record[nextVal] = true;
				}
			}
		}
		return -1;
	}

	// public static void main(String[] args) {
	// 	System.out.println(new NumSquares().numSquares(13));
	// }

}



// @lc code=end

