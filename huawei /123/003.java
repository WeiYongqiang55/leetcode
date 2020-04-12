import java.util.ArrayList;
import java.util.Collections;

class Error implements Comparable {
    public String filename;
    public int lineNumber;
    public int errorCount;

    
    

    public  Error(String filename, int num, int count) {
        this.filename=filename;
        this.lineNumber=num;
        this.errorCount=count;

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String res = this.filename+" "+this.lineNumber+" "+this.errorCount;
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Error e = (Error)obj;
        String es = e.filename+" "+e.lineNumber;
        String cs = this.filename+" "+this.lineNumber;
        if(es.equals(cs)){
            return true;
        }else{
            return false;
        }
        
    }
    @Override
    public int compareTo(Object o) {
        Error e = (Error) o;

        if (this.errorCount > e.errorCount) {
            return -1;
        } else if (this.errorCount < e.errorCount) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Error> list = new ArrayList<>();
        Error e1 = new Error("1",23,1);

        if(!list.contains(e1)){
            list.add(e1);
        }
        Error e2 = new Error("1",23,1);
        if(!list.contains(e2)){
            list.add(e2);
        }
        
        
        Collections.sort(list);
        for(Error e:list){
            System.out.println(e.toString());
        }

    }
}