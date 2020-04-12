
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  xx = sc.nextLine();
        int n = Integer.parseInt(xx);
        List<String[]> list = new ArrayList<String[]>();
        int sumLength=0;
        int count=0;
        for(int k=1;k<n;k++){
            String s = sc.nextLine();
            String[] ss = s.split(",");
            list.add(ss);
            sumLength+= ss.length;//总的数字的个数
            count++;
        }
        int[] starts = new int[count];
        StringBuilder sb = new StringBuilder();
        int resCount=0;
        while(resCount<sumLength){
            for(int i=0;i<count;i++){
                int length = list.get(i).length;
                if(starts[i]<length ){
                    if(starts[i]+n<length){
                        for(int j=0;j<n;j++){   
                            sb.append(list.get(i)[starts[i]+j]);
                            sb.append(",");
                            resCount++;
                            
                        }
                        starts[i] += n;
                    }else{
                        for(int j=starts[i];j<length;j++){
                            sb.append(list.get(i)[j]);
                            sb.append(",");
                            resCount++;
                        }
                        starts[i]=length;
                    }
                }
            }
        }
        sb  = sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

}