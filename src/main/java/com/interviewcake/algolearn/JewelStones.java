package com.interviewcake.algolearn;

import java.util.HashMap;
import java.util.Map;

public class JewelStones {

    public int numJewelsInStones(String j, String s) {
        int result = 0;

        Map<Character, Integer> map = new HashMap<>();
        char[] ourStones = s.toCharArray();
        for (char ourStone : ourStones) {
            if (map.containsKey(ourStone)) {
                int value = map.get(ourStone);
                value++;
                map.put(ourStone, value);
            } else {
                map.put(ourStone, 1);
            }
        }
        char[] jewelStones = j.toCharArray();
        for (char jewelStone : jewelStones) {
            if (map.containsKey(jewelStone)) {
                result += map.get(jewelStone);
            }
        }

        return result;
    }

    public int numJewelsInStones2(String J, String S) {
        if (J.length() == 0)
            return 0;

        int count = 0;
        for(int i = 0; i< S.length(); i++) {
            if(J.indexOf(S.charAt(i)) >= 0)
                count++;
        }
        return count;
    }
}
