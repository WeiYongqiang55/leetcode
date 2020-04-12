import java.util.*;

class Main {
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
            Error
            return super.equals(obj);
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
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int lineNum = sc.nextInt();
            String filename = s.substring(s.lastIndexOf("\\"));

        }

    }
}