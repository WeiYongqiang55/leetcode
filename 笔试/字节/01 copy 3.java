import java.util.Scanner;
import java.util.Stack;

import javax.xml.bind.ParseConversionEvent;

// 第一题
class Main {

	public static void main(String[] args) throws InterruptedException {

		// String test = "abc";
		// String tt= test.substring(0, 3-3);
		// System.out.println(tt);

		// 放历史的句子
		Stack<String> stack = new Stack<>();
		String current = "";
		stack.push(current);
		Scanner  sc = new Scanner(System.in);
		int count =0;
		String s = sc.nextLine();
		count = Integer.parseInt(s);

		for(int i=0;i<count;i++){
			String ss = sc.nextLine();
			String[] css = ss.split(" ");
			int operation = Integer.parseInt(css[0]);
			if(operation!=4){
				String neirong = css[1];
				//  1 2 3
				if(operation==1){
					
					current=current+neirong;
					stack.push(current);
				}else if(operation==2){
					int deleteNum = Integer.parseInt(neirong);
					// 删除最后的K个字符
					current = current.substring(0,current.length()-deleteNum);
					stack.push(current);
				}else if(operation==3){
					// 输出第K个字符
					int index = Integer.parseInt(neirong);
					System.out.println(current.charAt(index-1));
				}
			}
			else{
				// 4 回退
				stack.pop();
				if(!stack.isEmpty()){
					current = stack.peek();
					
				}
				
			}
		}

	}
}
