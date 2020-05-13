
import java.util.*;

import javax.sound.sampled.SourceDataLine;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> legal = new ArrayList<String>();//合法字符串
        List<String> illegal =  new ArrayList<>();//不合法字符串
        while(true){
            String ss = sc.nextLine();
            String s= ss.trim();
            if(s.length()==0){
                break;
            }
            char[]  cs = s.toCharArray();
            boolean flag =false;
            for(int i=0;i<cs.length;i++){
                if(!check(cs[i])){//illegal
                    illegal.add(ss);
                    flag = true;
                    break;
                }
            }
            // legal
            if(!flag &&!legal.contains(s)){
                legal.add(s);
                
            }
        }
        for(String a:legal){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
        for(String b:illegal){
            System.out.print(b);
            System.out.print(" ");
        }
        System.out.println();
    // 左移10位
        for(String  s:legal){
            int slength = s.length();
            int leftShift;
            if(slength<=10){
                leftShift = 10 % slength;
            }else{
                leftShift= 10;
            }
            s= s.substring(leftShift, s.length())+s.substring(0, leftShift);
            System.out.print(s+" ");
        }
        // 排序
        Collections.sort(legal);
        for(String s:legal){
            System.out.print(s+" ");
        }


    }
    public static boolean check(char c){
        if(!Character.isUpperCase(c) && !Character.isLowerCase(c) && !Character.isDigit(c)){
            return false;
        }
        return true;
    }

}