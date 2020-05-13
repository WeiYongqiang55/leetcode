import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import javax.xml.bind.ParseConversionEvent;
// 第2题
class Main {

	public static ArrayList<String> dic = new ArrayList<>();
	public static int maxLength;
	public static int count=0;
	public static void main(String[] args) throws InterruptedException {


		// String aa = "abcba";
		// System.out.println(aa.substring(0,1));
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		char[] cs = s.toCharArray();
		String ss = sc.nextLine();
		int count  = Integer.parseInt(ss);
		
		maxLength = 0;
		for (int i=0;i<count;i++){
			ss = sc.nextLine();
			dic.add(ss);
			maxLength = Math.max(maxLength, ss.length());
		}
		count = dfs(s,0,0);
		System.out.println(count);

	}

	public static int dfs(String subString,int start,int status){
		if(start>=subString.length() && status==1){
			count++;
			count = count%835672545;
			
		}else{
			for(int i=1;i<=maxLength && start+i<=subString.length();i++){
				String danci = subString.substring(start, start+i);
				if(dic.contains(danci)){
					if(start+i == subString.length()){
						dfs(subString,start+i,1);
					}else{
						dfs(subString,start+i,0);
					}
					
				}
			}
		}
		return count;
	}

}
