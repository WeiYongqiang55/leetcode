
/*
 * @Author: your name
 * @Date: 2020-01-26 15:44:45
 * @LastEditTime : 2020-01-27 00:20:15
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/350.两个数组的交集-ii.java
 */
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 *
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/description/
 *
 * algorithms
 * Easy (45.41%)
 * Likes:    224
 * Dislikes: 0
 * Total Accepted:    62.6K
 * Total Submissions: 136K
 * Testcase Example:  '[1,2,2,1]\n[2,2]'
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 
 * 示例 1:
 * 
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 
 * 
 * 示例 2:
 * 
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 
 * 说明：
 * 
 * 
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 
 * 
 * 进阶:
 * 
 * 
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * 
 * 
 */

// @lc code=start
class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0) {
            return list.stream().mapToInt(i -> i).toArray();
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // for (int i = 0; i < nums1.length; i++) {
        // System.out.println(nums1[i]);
        // }

        // 如果nums1比nums2大很多，则两者互换
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums1 = temp;
        }

        int start1 = 0;
        int start2 = 0;
        for (; start1 < nums1.length && start2 < nums2.length;) {

            // 相等
            if (nums1[start1] == nums2[start2]) {
                list.add(nums1[start1]);
                start1++;
                start2++;
            } else if (nums1[start1] < nums2[start2]) {
                start1++;
            } else {
                start2++;
            }

        }
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] result = intersect(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
// @lc code=end
