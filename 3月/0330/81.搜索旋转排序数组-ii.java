/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 *
 * https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/description/
 *
 * algorithms
 * Medium (35.26%)
 * Likes:    121
 * Dislikes: 0
 * Total Accepted:    21.9K
 * Total Submissions: 62.1K
 * Testcase Example:  '[2,5,6,0,0,1,2]\n0'
 *
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * 
 * ( 例如，数组 [0,0,1,2,2,5,6] 可能变为 [2,5,6,0,0,1,2] )。
 * 
 * 编写一个函数来判断给定的目标值是否存在于数组中。若存在返回 true，否则返回 false。
 * 
 * 示例 1:
 * 
 * 输入: nums = [2,5,6,0,0,1,2], target = 0
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: nums = [2,5,6,0,0,1,2], target = 3
 * 输出: false
 * 
 * 进阶:
 * 
 * 
 * 这是 搜索旋转排序数组 的延伸题目，本题中的 nums  可能包含重复元素。
 * 这会影响到程序的时间复杂度吗？会有怎样的影响，为什么？
 *   数组部分有序 本质
 * 
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return true;
            }
            if (nums[start] == nums[mid]) {
                // 第一种情况，011101111，看不出来前面还是有序
                start++;
                continue;
            }
            if (nums[start] < nums[mid]) {
                // 左半部分有序
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // 有半部分有序
                if (target >= nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 3));
    }
}
// @lc code=end
