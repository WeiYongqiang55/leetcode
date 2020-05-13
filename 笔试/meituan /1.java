import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        
        int num,kemu;
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        num = Integer.parseInt(ss[0]);
        kemu = Integer.parseInt(ss[1]);
        int[][] t = new int[num][kemu];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<num;i++){
            String s1 = sc.nextLine();
            String[] ss1 = s1.split(" ");
            for(int j=0;j<kemu;j++){
                t[i][j]  = Integer.parseInt(ss1[j]);
            }
        }
        for(int j=0;j<kemu;j++){
            int maxscore=-1;
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<num;i++){
                if(t[i][j]>maxscore){
                    maxscore=t[i][j];
                    temp.clear();
                    temp.add(i);
                }else if(t[i][j]==maxscore){
                    temp.add(i);
                }
            }
            for(int k=0;k<temp.size();k++){
                if(!list.contains(temp.get(k))){

                
                    list.add(temp.get(k));
                }
            }
            
        }
        System.out.println(list.size());
    }
}