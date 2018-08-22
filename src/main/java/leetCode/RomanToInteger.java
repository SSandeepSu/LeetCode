package leetCode;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {

    }


    public static int romatToInt(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        int preVal = 0;
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            int currVal = map.get(s.charAt(i));
            if(preVal < currVal){
                res -= preVal * 2;
            }
            preVal = currVal;
            res += currVal;
        }
        return res;
    }

}
