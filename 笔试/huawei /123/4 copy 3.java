
import java.util.*;

// 球最小公倍数
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s =s.trim();
        char[] cs = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=0;i<cs.length;i++){
            if(isZm(cs[i])){
                sb.append(cs[i]);
            }else{
                sb2.append(sb);
                sb2.append(" ");
                sb.delete(0, sb.length());
            }
        }
        if(sb.length()>0){
            sb2.append(sb);
        }
        String[] sss = sb2.toString().split(" ");
        for(int i = sss.length-1;i>=0;i--){
            if(!sss[i].equals(" ")){
            System.out.print(sss[i]);
            }
            if(i!=0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static boolean isZm(char c){
        if(!Character.isUpperCase(c) && !Character.isLowerCase(c)){
            return false;
        }
        return true;
    }

}