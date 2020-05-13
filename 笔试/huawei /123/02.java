import java.util.ArrayList;

/**
 * 定义字符对:两个字符由大小写字母相加得到,大写字母在前.如Aa,Dd
 * 
 * 定义蛇形字符串:按字母顺序连续组成的字符对,如AaBb,RrSsTt等,但AaCcDd不是蛇形字符串,因为不满足字母顺序连续
 * 
 * 题目要求为输出一串随机字符串,利用该字符串的元素组合出所有可能的蛇形字符串,
 * 并按蛇形字符串的头字母字典顺序(A-Z)输出,如果头字母的字典顺序相同,则输出两者之间较长的蛇形字符串. 直到全部蛇形字符的组合. 例子
 * SxxsrR^AaSs RrSs Aa Ss
 */
class Main {

    public static ArrayList<Integer> findMaxLength(int[] res){
        // 找最长的连续子串
        int maxLeng=0;//长度
        int start=0;//开始的位置
        for(int i=0;i<25;i++){
            
            if(res[i]>0){
                
                int j=i+1;
                while(res[j]>0){
                    j++;
                }
                int length = j-i;
                if(length>maxLeng){
                    start=i;
                    maxLeng=length;
                }
                i+=length-1;
            }  
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(maxLeng);
        list.add(start);
        return list;
    }

    public static void main(String[] args) {

        String s = "SxxsrR^AaSs";
        // String s = "AaBbCcEe";
        char[] cs = s.toCharArray();
        int[] uppermap = new int[26];
        int[] lowermap = new int[26];
        
        int[] res = new int[26];
        for(int i=0;i<cs.length;i++){
            if(Character.isUpperCase(cs[i])){
                int index = cs[i]-'A';
                uppermap[index]++;
            }else if(Character.isLowerCase(cs[i])){
                int index = cs[i]-'a';
                lowermap[index]++;
            }
                
        }

        for(int i=0;i<26;i++){
            res[i]=Math.min(uppermap[i],lowermap[i]);
        }
        
        while(findMaxLength(res).get(0)>0){
            ArrayList<Integer> list = findMaxLength(res);
            int length = list.get(0);
            int start = list.get(1);
            for(int i=0;i<length;i++){
                System.out.print((char)('A'+start+i));
                System.out.print((char)('a'+start+i));
                res[start+i]--;
            }
            System.out.println();
        }

    }

}