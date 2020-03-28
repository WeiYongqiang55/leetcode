import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=60 lang=java
 *
 * [60] 第k个排列
 *
 * https://leetcode-cn.com/problems/permutation-sequence/description/
 *
 * algorithms
 * Medium (48.10%)
 * Likes:    169
 * Dislikes: 0
 * Total Accepted:    21.9K
 * Total Submissions: 45.4K
 * Testcase Example:  '3\n3'
 *
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * 
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * 
 * 
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 
 * 
 * 给定 n 和 k，返回第 k 个排列。
 * 
 * 说明：
 * 
 * 
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1,  n!]。
 * 
 * 
 * 示例 1:
 * 
 * 输入: n = 3, k = 3
 * 输出: "213"
 * 
 * 
 * 示例 2:
 * 
 * 输入: n = 4, k = 9
 * 输出: "2314"
 * 
 * 
 */

// @lc code=start
class Solution {
    static StringBuilder res = new StringBuilder();

    public static String getPermutation(int n, int k) {
        k=k-1;
        res.replace(0, res.length(), "");
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        digui(list, k);
        return res.toString();

    }

    public static void digui(List<Integer> list, int k) {
        if (k == 0) {
            for (int i = 0; i < list.size(); i++) {
                res.append(list.get(i).toString());
            }
        } else {
            int size = list.size();
            int index = (int) (k / nFactorial(size - 1));
            res.append(list.get(index).toString());
            k = k % nFactorial(size - 1);
            list.remove(index);
            digui(list, k);
        }
    }

    public static int nFactorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    // public static void main(String[] args) {
    //     System.out.println(getPermutation(4, 9));
    // }
}
// @lc code=end

