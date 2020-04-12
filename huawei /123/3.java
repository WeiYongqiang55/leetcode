
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            String s  = sc.nextLine();
            String[] map  = new String[26];
            for(int i=0;i<26;i++){
                map[i]="";
            }
            char[] cs = s.toCharArray();
            for(int i=0;i<cs.length;i++){
                if(Character.isUpperCase(cs[i])){
                    int index = cs[i]-'A';
                    map[index]+=cs[i];
                }else if(Character.isLowerCase(cs[i])){
                    int index = cs[i]-'a';
                    map[index]+= cs[i];
                }
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for(int i=0;i<26;i++){
                sb.append(map[i]);
            }
            String res = sb.toString();
            for(int i=0,start=0;i<cs.length;i++){
                if(!Character.isUpperCase(cs[i]) && !Character.isLowerCase(cs[i])){
                    sb2.append(cs[i]);
                }else{
                    sb2.append(res.charAt(start++));
                }
            }
            System.out.println(sb2.toString());
        }
    }

}