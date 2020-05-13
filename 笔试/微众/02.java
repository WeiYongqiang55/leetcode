import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n,m,a,b;
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        n = Integer.parseInt(ss[0]);
        m = Integer.parseInt(ss[1]);
        a = Integer.parseInt(ss[2]);
        a = Integer.parseInt(ss[2]);
        b = Integer.parseInt(ss[3]);
        if(m>=n){
            System.out.println(0);
        }else{
            int liwu = n-m;

            int cost = Math.min(b*liwu, a*liwu);
            System.out.println(cost);
        }
    

    }
}


[{"INTERVIEW_DATE":"2020-04-17T13:33:04.000+0800","WORK_PLACE_NAME":"中国/深圳","index":2,"WORK_PLACE":"Shenzhen","RESUME_TYPE":"0","IV_PROCESS":1,"SHOW_INTERVIEW":"0","JOB_CODE":"J202002270182","CREATION_DATE":"2020-04-17T13:32:58.000+0800","JOB_REQUIREMENT_ID":144739,"INTEXSIST":0,"CHECK_IN_COUNT":3,"JOB_NAME":"助理工程师A,工程师B","INTERVIEW_TYPE":0,"graduateItem":"3","IV_DATE":"2020-04-19","TNEXT":"0","INTERVIEWEE_ID":830436,"EXTERNAL_JOB_NAME":"软件开发工程师（实习生）","showStatus":6,"IV_EXISTS":"1","JOB_TYPE":"0","SHOW_PROCESS":"0","CURRENT_DEPT":"047285/网络产品与解决方案/Network Products & Solutions"}]