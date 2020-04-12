import java.util.HashMap;
import java.util.Iterator;

class Solution {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            int key = (int)it.next();
            if(map.get(key)!=2){
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}