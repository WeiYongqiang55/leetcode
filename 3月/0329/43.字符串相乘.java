import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 *
 * https://leetcode-cn.com/problems/multiply-strings/description/
 *
 * algorithms
 * Medium (41.95%)
 * Likes:    295
 * Dislikes: 0
 * Total Accepted:    51.9K
 * Total Submissions: 123.7K
 * Testcase Example:  '"2"\n"3"'
 *
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * 
 * 示例 1:
 * 
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 
 * 示例 2:
 * 
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * 
 * 说明：
 * 
 * 
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 * 
 * 
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {

        // BigDecimal a = new BigDecimal(num1);
        // BigDecimal b = new BigDecimal(num2);
        // return a.multiply(b).toString();

        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        StringBuffer res = new StringBuffer("0");
        // 竖式乘法
        for(int i=num2.length()-1,zeros=0;i>=0;i--){

            StringBuffer temp = new StringBuffer();//阶段乘积的结果
            int k=zeros;
            while(k>0){
                temp.append("0");
                k--;
            }
            int carry=0;//进位
            for(int j=num1.length()-1;j>=0;j--){
                //从后往前乘
                int n2 = num2.charAt(i)-'0';
                int n1=  num1.charAt(j)-'0';
                int mul= n1*n2+carry;
                carry = mul/10;
                temp.insert(0, mul%10);
            }
            if(carry!=0){
                temp.insert(0, Integer.toString(carry));
            }

            //字符串 数字相加
            
            int Acarry=0;
            int tnum=0;
            for(int tend = temp.length()-1,rend=res.length()-1;tend>=0;rend--,tend--){
                tnum = temp.charAt(tend)-'0';
                int rnum = rend>=0? res.charAt(rend)-'0' : 0;

                int mmul = tnum+rnum+Acarry;
                Acarry = mmul/10;
                
                temp.replace(tend, tend+1, Integer.toString(mmul%10));
            }
            if(Acarry==1){
                temp.insert(0, "1");
            }
            res = new StringBuffer(temp);
            zeros++;
        }
        System.out.println(res.toString());
        return res.toString();

    }

    public static void main(String[] args) {
        
        new Solution().multiply("9","9");
    }
}
// @lc code=end

