import java.util.Scanner;
import java.util.Stack;

class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] cs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int count=0,left=0,right=0;
        for(int i=0;i<cs.length;i++){
            if(cs[i]=='('){
                stack.add('(');
            }else if(cs[i]==')'){
                if(stack.size()>0 && stack.peek()=='('){
                    stack.pop();
                    count++;
                }else{
                    right++;
                }
            }
        }
        if(stack.size()>0){
            left+=stack.size();
        } 
        System.out.println(count+" "+left+" "+right);
    }
}