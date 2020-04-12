import java.util.*;

/**
 *  为幼儿园的小朋友设计一个加减法的计算法,输入为一串仅包含加减号的运算表达式,测试样例表达式均为合法输入,请你返回计算式的值.

    题目是我凭记忆转述的,实际题目比这个要严谨的多,同时也有同学会被这些描述带偏,以为题目描述得这么严谨肯定有留一些坑,结果就是想太多,最后没做出来ヽ(ー_ー)ノ

输入样例: ‘1+3-5’

返回:-1
 */

//1+3-5  
class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        char[] cs = s.toCharArray();
        int first=0,second=0,res=0;
        for(int i=0;i<cs.length;i++){
            if(Character.isDigit(cs[i])){
                int start=i;
                StringBuilder sb = new StringBuilder();
                while(start<cs.length && Character.isDigit(cs[start])){
                    sb.append(cs[start]);
                    start++;
                }
                first = Integer.parseInt(sb.toString());
                i += start-i-1;
            }else{
                boolean flag = false;
                if(cs[i]=='+'){
                    flag=true;
                }else{
                    flag=false;//-
                }
                int start=i+1;
                StringBuilder sb = new StringBuilder();
                while(start<cs.length && Character.isDigit(cs[start])){
                    sb.append(cs[start]);
                    start++;
                }
                int num = Integer.parseInt(sb.toString());
                if(flag){
                    //+
                    first += num;
                }else{
                    first -= num;
                }
                i += start-i-1;

            }
        }
        System.out.println(first);
       
    }
}