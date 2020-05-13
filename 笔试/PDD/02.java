

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sN = sc.nextLine();
        int N = Integer.parseInt(sN);
        String snum = sc.nextLine();
        String[] snums = snum.split(" ");
        ArrayList<Integer> num = new ArrayList<>();
        // int[] num = new int[N];
        for(int i=0;i<N;i++){
            int n =  Integer.parseInt(snums[i]);
            num.add(n);
        }
        Collections.sort(num);
        int sum=0;
        for(int i =N-1,count=1;i>=0;i--){
            if(count%3==0){

            }else{
                sum+=num.get(i);
            }
            count++;
        }
        System.out.println(sum);

    }
}