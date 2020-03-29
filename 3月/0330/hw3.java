import java.util.HashMap;
import java.util.Scanner;

// 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）


// 输入描述:
// 输入一个十六进制的数值字符串。


// 输出描述:
// 输出该数值的十进制字符串。


// 输入例子1:
// 0xA

// 输出例子1:
// 10

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        HashMap<Character,Integer> map  = new HashMap<>();
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);

        while (sc.hasNext()) {
            n = sc.next();
            n = n.substring(2);//去掉ox
            char[] cn= n.toCharArray();
            int res=0;
            for(int i = cn.length-1,carry=0;i>=0;i--,carry++){
                if(Character.isDigit(cn[i])){
                    res += (int)(cn[i]-'0') * (int)(Math.pow(16, carry));
                }else{
                    res = res+ (map.get(cn[i]))*(int)(Math.pow(16, carry));
                }
            }
            System.out.println(res);
        }
    }
}