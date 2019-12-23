import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * @Author: your name
 * @Date: 2019-12-23 09:30:21
 * @LastEditTime : 2019-12-23 12:28:01
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\423.从英文中重建数字.java
 */
/*
 * @lc app=leetcode.cn id=423 lang=java
 *
 * [423] 从英文中重建数字
 * 因为 
 */

// @lc code=start
class Solution {
    
    public static String originalDigits(String s) {
        StringBuilder res = new StringBuilder();
        String[] chars = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        //偶数的特征
        // {'z', 'w', 'u', 'x', 'g'} zero two four six eight
        Set<Character> even = new HashSet<>();//zero , two,four,six,eight
        even.add('z');
        even.add('w');
        even.add('u');
        even.add('x');
        even.add('g');
        // 奇数的特征
        //{ 'o','t','f','s'};//one,three,five,seven, ，没有nine的，
        Set<Character> odd = new HashSet<>();
        odd.add('o');
        odd.add('t');
        odd.add('f');
        odd.add('s');
        HashMap<Character, Integer> map = new HashMap<>(35);//35*0.75=26.333
        char[] sc = s.toCharArray();
        for (int i = 0; i < sc.length; i++) {
            if (!map.containsKey(sc[i])) {
                map.put(sc[i], 1);
            } else {
                map.put(sc[i], map.get(sc[i]) + 1);
            }
        }
        //先做偶数，把对应的值减掉 遍历map中的key
        for (Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Character, Integer> item = it.next();
            char c = item.getKey();
            int count = item.getValue();
            if (even.contains(c) && count >0) {
                //是偶数
                switch (c) {
                case 'z':
                    for (char cc : chars[0].toCharArray()) {
                        map.replace(cc, map.get(cc) - count);

                    }
                    for (int i = 0; i < count; i++) {
                        res.append('0');
                    }
                    break;
                case 'w':
                    for (char cc : chars[2].toCharArray()) {

                        map.replace(cc, map.get(cc) - count);

                    }
                    for (int i = 0; i < count; i++) {
                        res.append('2');
                    }
                    break;
                case 'u':
                    for (char cc : chars[4].toCharArray()) {

                        map.replace(cc, map.get(cc) - count);

                    }
                     for (int i = 0; i < count; i++) {
                        res.append('4');
                    }
                    break;
                case 'x':
                    for (char cc : chars[6].toCharArray()) {

                        map.replace(cc, map.get(cc) - count);

                    }
                     for (int i = 0; i < count; i++) {
                        res.append('6');
                    }
                    break;
                case 'g':
                    for (char cc : chars[8].toCharArray()) {

                        map.replace(cc, map.get(cc) - count);

                    }
                     for (int i = 0; i < count; i++) {
                        res.append('8');
                    }
                    break;
                }
            }
        }
        //迭代删除value为0的建制对
        for (Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Character, Integer> item = it.next();
            char c = item.getKey();
            int count = item.getValue();
            if (count == 0) {
                it.remove();
            }
        }
        // 做奇数，把对应的值减掉
        for (Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Character, Integer> item = it.next();
            char c = item.getKey();
            int count = item.getValue();
            if (odd.contains(c) && count>0) {
                // 是
                switch (c) {
                case 'o':
                    for (char cc : chars[1].toCharArray()) {

                        map.replace(cc, map.get(cc) - count);

                    }
                     for (int i = 0; i < count; i++) {
                        res.append('1');
                    }
                    break;
                case 't':
                    for (char cc : chars[3].toCharArray()) {

                        map.replace(cc, map.get(cc) - count);

                    }
                     for (int i = 0; i < count; i++) {
                        res.append('3');
                    }
                    break;
                case 'f':
                    for (char cc : chars[5].toCharArray()) {

                        map.replace(cc, map.get(cc) - count);

                    }
                     for (int i = 0; i < count; i++) {
                        res.append('5');
                    }
                    break;
                case 's':
                    for (char cc : chars[7].toCharArray()) {

                        map.replace(cc, map.get(cc) - count);

                    }
                     for (int i = 0; i < count; i++) {
                        res.append('7');
                    }
                    break;

                }
            }
        }
        //剩下的就是nine 了，数i的个数就行en
        if (map.get('i') != null) {
            for(int i =0;i<map.get('i');i++){
                res.append('9');
            }
        }
        // int[] counts = new int[10];
        // for (int i = 0; i < 10; i++) {
        //     for (char var : nums[i].toCharArray()) {
        //         counts[i] += (int) (var - 'a' + 1);
        //     }
        // }
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(counts[i]);
        // }
        char[] resstring = res.toString().toCharArray();
        Arrays.sort(resstring);
        String temp = String.valueOf(resstring);
        return temp;
    }

    public static void main(String[] args) {
        String s = new String("xsi");
        String res = originalDigits(s);
        System.out.println(res);
    }
}
// @lc code=end
