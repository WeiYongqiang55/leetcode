import java.util.Stack;

/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 *
 * https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/description/
 *
 * algorithms
 * Medium (48.68%)
 * Likes:    95
 * Dislikes: 0
 * Total Accepted:    25.3K
 * Total Submissions: 51.8K
 * Testcase Example:  '["2","1","+","3","*"]'
 *
 * 根据逆波兰表示法，求表达式的值。
 * 
 * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * 
 * 说明：
 * 
 * 
 * 整数除法只保留整数部分。
 * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 * 
 * 
 * 示例 1：
 * 
 * 输入: ["2", "1", "+", "3", "*"]
 * 输出: 9
 * 解释: ((2 + 1) * 3) = 9
 * 
 * 
 * 示例 2：
 * 
 * 输入: ["4", "13", "5", "/", "+"]
 * 输出: 6
 * 解释: (4 + (13 / 5)) = 6
 * 
 * 
 * 示例 3：
 * 
 * 输入: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
 * 输出: 22
 * 解释: 
 * ⁠ ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 * 
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        //保存数字
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens) {
            if(isNumber(s)){
                stack.push(Integer.parseInt(s));
            }else{
                int num1,num2;
                switch(s){
                    case "+":
                        num2 = stack.pop();
                        num1= stack.pop();
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        num2 = stack.pop();
                        num1= stack.pop();
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        num2 = stack.pop();
                        num1= stack.pop();
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        num2 = stack.pop();
                        num1= stack.pop();
                        stack.push((int)(num1 / num2));
                        break;
                }
            }
        }
        System.out.println(stack.peek());
        return stack.pop();
    }
    /**
     * 判断是不是数字，包括小数、负数
     * @return
     */
    public boolean isNumber(String str){
        //采用正则表达式的方式来判断一个字符串是否为数字，这种方式判断面比较全
		//可以判断正负、整数小数
		//?:0或1个, *:0或多个, +:1或多个
        Boolean strResult = str.matches("-?[0-9]+.*[0-9]*");
        return strResult;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        solution.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
    }
}
// @lc code=end

