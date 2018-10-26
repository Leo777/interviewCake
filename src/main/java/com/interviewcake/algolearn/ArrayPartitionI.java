package com.interviewcake.algolearn;

import java.util.Arrays;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i<nums.length; i=i+2) {
            result += nums[i];
        }
        return result;
    }
    private static final int shift = 10000;

    //O(n)
    /*
    Instead of sorting the original array, we can use a count[] array to count the frequence of each number, and then loop through count[] to chose the smaller one for each pairs.

As the number is between [-10000, 10000], there is 20001 in total.
for each number and the index of count[] array, the mapping relationship is:
index = number + 10000

After we have filled count array, loop through count[] to pick elements.
Only consider to pick this element if its freq > 0:
1. If we have not picked the 1st element, pick current number, and freq--
2. If we have picked the 1st element, skip current number by freq--
     */
    public int arrayPairSum2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // to store the freq of of num
        // each index maps to number "index - shift"
        int[] count = new int[2 * shift + 1];

        for (int num : nums) {
            int index = num + shift;
            count[index]++;
        }

        int res = 0;
        boolean first = true; // need to chose first element
        for (int index = 0; index < count.length; index++) {
            while (count[index] != 0) {
                if (first) {
                    int num = index - shift;
                    res += num;
                    count[index]--;
                    first = false;
                } else { // has chosen the first element, skip the second
                    count[index]--;
                    first = true;
                }
            }
        }

        return res;
    }
}
