/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 *
 * https://leetcode-cn.com/problems/simplify-path/description/
 *
 * algorithms
 * Medium (38.86%)
 * Likes:    123
 * Dislikes: 0
 * Total Accepted:    32.2K
 * Total Submissions: 82.8K
 * Testcase Example:  '"/home/"'
 *
 * 以 Unix 风格给出一个文件的绝对路径，你需要简化它。或者换句话说，将其转换为规范路径。
 * 
 * 在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （..）
 * 表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。更多信息请参阅：Linux / Unix中的绝对路径 vs 相对路径
 * 
 * 请注意，返回的规范路径必须始终以斜杠 / 开头，并且两个目录名之间必须只有一个斜杠 /。最后一个目录名（如果存在）不能以 /
 * 结尾。此外，规范路径必须是表示绝对路径的最短字符串。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入："/home/"
 * 输出："/home"
 * 解释：注意，最后一个目录名后面没有斜杠。
 * 
 * 
 * 示例 2：
 * 
 * 输入："/../"
 * 输出："/"
 * 解释：从根目录向上一级是不可行的，因为根是你可以到达的最高级。
 * 
 * 
 * 示例 3：
 * 
 * 输入："/home//foo/"
 * 输出："/home/foo"
 * 解释：在规范路径中，多个连续斜杠需要用一个斜杠替换。
 * 
 * 
 * 示例 4：
 * 
 * 输入："/a/./b/../../c/"
 * 输出："/c"
 * 
 * 
 * 示例 5：
 * 
 * 输入："/a/../../b/../c//.//"
 * 输出："/c"
 * 
 * 
 * 示例 6：
 * 
 * 输入："/a//b////c/d//././/.."
 * 输出："/a/b/c"
 * 
 */

// @lc code=start
// class Solution {
//     public String simplifyPath(String path) {
//         char[] ss = path.toCharArray();
//         if(ss[0]!='/'){
//             return null;
//         }
//         StringBuilder res  = new StringBuilder();
//         res.append("/");
//         for(int i=1;i<ss.length;i++){
//             if(ss[i]=='/'){
//                 if(res.charAt(res.length()-1)=='/'){
//                     continue;  // 多个////
//                 }else if(i==ss.length-1){
//                     continue;//  /home/
//                 }else{
//                     res.append(ss[i]);
//                 }
//             }else if(ss[i]=='.' ){
//                 //   ..
//                 if(i+1<ss.length && ss[i+1]=='.'){
//                     if(res.length()>1){
//                         res.delete(res.length()-1,res.length());//删除掉最后一个/
//                         int last = res.lastIndexOf("/");
//                         if(last !=0){
//                             res.delete(last, res.length());
//                         }else{
//                             res.delete(last+1,res.length());
//                         }   
//                     }
//                     i++;
//                 }
//             }else{
//                 res.append(ss[i]);
//             }
//         }
//         if(res.charAt(res.length()-1)=='/' && res.length()!=1){
//             res.deleteCharAt(res.length()-1);
//         }
//         System.out.println(res.toString());
//         return res.toString();
//     }

//     public static void main(String[] args) {
//         new Solution().simplifyPath("/...");
//     }
// }

class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        for (String item : path.split("/")) {
            if (item.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else if (!item.isEmpty() && !item.equals(".")) stack.push(item);
        }
        String res = "";
        for (String d : stack) res = "/" + d + res;
        return res.isEmpty() ? "/" : res;  
    }
}

// @lc code=end

