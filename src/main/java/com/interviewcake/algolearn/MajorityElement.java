package com.interviewcake.algolearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int counter = 0;
        int element = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], ++count);
            } else {
                map.put(nums[i], 1);
            }

        }
        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : entry) {

            if (integerIntegerEntry.getValue() > counter) {
                counter = integerIntegerEntry.getValue();
                element = integerIntegerEntry.getKey();
            }
        }
        return element;
    }

    public int majorityElement2(int[] nums) {
        int maj = nums[0], count = 0;
        for(int x : nums){
            if(x==maj) count++;
            else if(count==0){
                count=1;
                maj=x;
            }
            else count--;
        }
        return maj;
    }
}
