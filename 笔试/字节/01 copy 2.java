import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import javax.xml.bind.ParseConversionEvent;
// 第4题
class Main {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		char[] cs = s.toCharArray();
		String ss = sc.nextLine();
		int count  = Integer.parseInt(ss);

		// 首先建立数组，dp[2][3]里面保存的是s[2;3]中不同的字符
		String[][] dp = new String[s.length()][s.length()];
		for(int i=0;i<s.length();i++){
			for(int j=i;j<s.length();j++){
				if(j==i){
					
					dp[i][j] = Character.toString(s.charAt(j));
				}else{
					String check = Character.toString(s.charAt(j));
					if(!dp[i][j-1].contains(check)){
						dp[i][j] = dp[i][j-1]+check;
					}
				}
			}
		}

		for (int i=0;i<count;i++){
			ss = sc.nextLine();
			String[] css = ss.split(" ");
			int operation = Integer.parseInt(css[0]);
			if(operation==2){
				int lIndex = Integer.parseInt(css[1]);
				int rIndex = Integer.parseInt(css[2]);
				List<Character> list = new ArrayList<Character>();
				for(int j=lIndex-1;j<rIndex;j++){
					if(!list.contains(cs[j])){
						list.add(cs[j]);
					}
				}
				System.out.println(list.size());
			}else if(operation==1){
				int pos = Integer.parseInt(css[1]);
				char c = css[2].charAt(0);
				cs[pos-1]=c;
			}
		}

	}
}
